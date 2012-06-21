/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import auxiliares.RealExtensiveName;
import auxiliares.ValidarException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author muky
 */
public class Cheque {

    private double valor;
    private String destinadoA, assinatura;
    private Date data;

    public void setValor(String valor) throws ValidarException {
        //Lê o Valor do Cheque

        String caracterInvalido = "abcdefghijklmnopqrstuvxzw!@#$%¨&*()_-=+§¬£¢³²¹ª°º]}{[´`~^:;\\\"|/?°";
        char[] c = caracterInvalido.toCharArray();

        //Remove R$ se houver e Substitui virgulas por pontos
        valor = valor.toUpperCase().replace("R$", "").replace(",", ".");
        //Remove os pontos exceto o ultimo
        int pp = valor.indexOf("."); // primeiro ponto
        int up = valor.lastIndexOf("."); // ultimo ponto

        if (pp != up) {
            valor = valor.substring(0, pp) + valor.substring(pp + 1, valor.length());
        }


        //Verifica se o valor (String):
        //é nulo, ou contém apenas 1 ponto ou virgula sem valor numérico
        if (valor.trim().equals("") || valor.trim().equals(".") || valor.trim().equals(",")) {
            throw new ValidarException("Campo [Valor] é obrigatório. Por favor, preencha-o.");

            //tem mais de 9 caracteres (10.000,00)
        } else if (valor.length() > 9) {
            throw new ValidarException("Valor [" + valor + "] excede os limites de caracteres [9].");
            //Mais...  
        } else {
            boolean k = true;
            //contem letras e ou caracters inválidos
            for (int i = 0; i < c.length; i++) {
                if (valor.toLowerCase().contains("" + c[i])) {
                    k = false;
                    throw new ValidarException("Contém caracteres inválidos.");
                }
            }

            //tem mais de um ponto ou virgula
            int contp = 0, contv = 0;
            for (int j = 0; j < valor.length(); j++) {
                if (valor.charAt(j) == '.') {
                    contp += 1;
                }
                if (valor.charAt(j) == ',') {
                    contv += 1;
                }
                if (contp > 1 || contv > 1) {
                    break;
                }
            }

            if (contp > 1) {
                k = false;
                throw new ValidarException("Contém mais de um ponto.");
            }
            if (contv > 1) {
                k = false;
                throw new ValidarException("Contém mais de uma virgula.");
            }

            //Se não tiver erro ele converte pra Double
            if (k = true) {
                this.setValor(Double.parseDouble(valor));
            }
        }
    }

    public String getValorReal() {
        String valors = (this.valor + "").replace('.', ',');
        if(!valors.contains(",")){
            valors += ",00";
        }
        String[] split = valors.split(",");
        if(split[1].length() < 2){
            split[1] += "0";
        }
        if(split[1].length() > 2){
            split[1] = split[1].substring(0, 2);
        }
        return "R$ "+split[0]+","+split[1];
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValidarException {
        //Se Valor menor que 1 centavo ou maior que 10 mil reais : inválido
        if (valor < 0.01 || valor > 10000.0) {
            throw new ValidarException("Valor Fora do limite de 1 Centavo a 10 Mil Reais. \n[R$0,01 a R$10.000,00]");
        } else {
            this.valor = valor;
        }
    }

    public String getValorExtenso() {
        //Converte para extenso
        RealExtensiveName valorExtenso = new RealExtensiveName();
        valorExtenso.setNumber(this.getValor());
        return valorExtenso + "";
    }

    public String getDestinadoA() {
        return destinadoA;
    }

    public boolean setDestinadoA(String destinadoA) throws ValidarException {
        boolean retorno;

        if (destinadoA.trim().equals("")) {
            retorno = false;
            throw new ValidarException("O campo [Destinado a] é obrigatório.\nPor favor, preencha-o.");

        } else {
            this.destinadoA = destinadoA;
            retorno = true;
        }
        return retorno;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) throws ValidarException {
        if (assinatura.trim().equals("")) {
            throw new ValidarException("O campo [Assinatura] é obrigatório.\nPor favor, preencha-o.");
        } else {
            this.assinatura = assinatura;
        }
    }

    public Date getData() {
        return data;
    }

    public String getStringData() {
        //return data.getDate() + "/" + (data.getMonth() + 1) + "/" + (data.getYear() + 1900);
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return "Volta Redonda,  " + data.getDate() + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + meses[data.getMonth()] + " de " + (data.getYear() + 1900);
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void setData(String data) throws ValidarException {
        if (data.length() < 6 || data.length() > 10) {
            throw new ValidarException("Data [" + data + "] Inválida");
        } else if (data.replace("\\", "").replace("/", "").trim().equals("")) {
            throw new ValidarException("O campo [Data] não pode ser nulo!\nPor favor, preencha-o.");
        }

        System.out.println(data);
        
        String[] dt = data.split("/");
        String d, m, a;
        d = dt[0]; //dia
        m = dt[1]; //mes
        a = dt[2]; //ano
        
        //arruma ano
        if (a.length() == 1) {
            a = "200" + a;
        } else if (a.length() == 2) {
            a = "20" + a;
        }

        int dia = Integer.parseInt(d);
        int mes = Integer.parseInt(m);
        int ano = Integer.parseInt(a);

        System.out.println(dia + "-" + mes + "-" + ano);

        if (dia < 1 || dia > 31) {
            throw new ValidarException("Data [" + data + "] Inválida, Dia [" + dia + "] Inválido. [válido de 1 a 31]");
        } else if (mes < 1 || mes > 12) {
            throw new ValidarException("Data [" + data + "] Inválida, Mês [" + mes + "] Inválido. [válido de 1 a 12]");
        } else if (ano < 2011) {
            throw new ValidarException("Data [" + data + "] Inválida, Ano [" + ano + "] Inválido. [válido à partir de 2011]");
        }

        DateFormat format = new SimpleDateFormat("dd/MM/yy");
        try {
            this.data = format.parse(data);
        } catch (Exception ex) {
            //throw new ValidarException(ex.getMessage());
            throw new ValidarException("Data [" + data + "] Inválida, Por favor use o formato Dia/Mês/Ano.");
        }

    }
}
