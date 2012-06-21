
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import auxiliares.Utilitario;
import auxiliares.ValidarException;
import javax.swing.JOptionPane;
import modelos.Cheque;

/**
 *
 * @author muky
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheque cheque = new Cheque();


        /*
         * Para o Valor do cheque ser válido, o mesmo deve: - Ter um valor entre
         * R$0,01 [Um Centavo] e R$10.000,00 [Dez Mil Reais] - Conter apenas 1
         * [um] ponto e 1 [uma] vírgula [independente da ordem] - Ter no máximo
         * 9 caracteres [Dez Mil Reais formatados] - Não conter caracteres não
         * numéricos diferentes de ponto [.] e vírgula [,]
         *
         */

        //try {
        boolean keep;

        //Lê o Valor do Cheque



        do {
            try {
                cheque.setValor(Utilitario.pergunta("Entre com o Valor do Cheque:\nR$"));
                keep = true;
            } catch (ValidarException ve) {
                Utilitario.mensagem(ve.getMessage(), JOptionPane.ERROR_MESSAGE);
                keep = false;
            }
        } while (keep == false);


        //Lê o Destinatário

        do {
            try {
                cheque.setDestinadoA(Utilitario.pergunta("Insira o destinatário"));
                keep = true;
            } catch (ValidarException ve) {
                Utilitario.mensagem(ve.getMessage(), JOptionPane.ERROR_MESSAGE);
                keep = false;
            }
        } while (keep == false);

        //Lê a Data de Emissão do Cheque
        do {
            try {
                cheque.setData(Utilitario.pergunta("Insira a data (dd/mm/aaaa)"));
                keep = true;
            } catch (ValidarException ve) {
                Utilitario.mensagem(ve.getMessage(), JOptionPane.ERROR_MESSAGE);
                keep = false;
            }
        } while (keep == false);

        //Aponta o caminho da imagem do cheque
        String path = System.getProperty("user.dir").replace("\\", "/");
        System.out.println(path);
        //Monta e formata o cheque em HTML/CSS
        String html = ""
                + "<html>"
                + "<style>"
                + "#imagem{width: 892px; height: 382px;" + "     border-style:solid;"
                + "     border-width:1px;" + " background:url(\"file:///" + path + "/src/lib/cheque.png\") no-repeat}"
                + "#apDiv1 {"
                + "	width:620px;"
                + "	height:50px;"
                + "	z-index:1;"
                + "	margin-left: 34px;"
                + "	margin-top: 10px;"
                + "	text-indent:150px;"
                + "	line-height:30px;"
                + "     font-size:10px;"
                + "}"
                + "#apDiv2 {"
                + "	width:30px;"
                + "	height:48px;"
                + "	z-index:2;"
                + "	margin-left: 495px;"
                + "	margin-top: 0px;"
                + "	font-size:30px;"
                + "}"
                + "#apDiv3 {"
                + "	width:680px;"
                + "	height:19px;"
                + "	z-index:3;"
                + "	margin-left: 60px;"
                + "	margin-top: 7px;"
                + "}"
                + "#apDiv4 {"
                + "	width:176px; max-width:100px;"
                + "	height:26px;"
                + "	z-index:4;"
                + "	margin-left: 403px;"
                + "	margin-top: 15px;"
                + "}"
                + "#apDiv6 {"
                + "	width:100px;"
                + "     max-width:100px;"
                + "	height:22px;"
                + "	z-index:5;"
                + "	margin-left: 424px;"
                + "	margin-top: 20px;"
                + "}"
                + "</style>"
                + "<body style=\"width:892px; height: 382px\">"
                + "<div id=\"imagem\">"
                + "<div id=\"apDiv2\">#" + cheque.getValorReal() + "#</div>"
                + "<div id=\"apDiv1\">*** " + cheque.getValorExtenso() + " ***</div>"
                + "<div id=\"apDiv3\">*** " + cheque.getDestinadoA() + " ***</div>"
                + "<div id=\"apDiv4\">" + cheque.getStringData() + "</div>"
                + "<div id=\"apDiv6\">Lucas Franco, Rogério Chaves e Thiago Moraes</div>"
                + "</div>"
                + "</body>"
                + "</html>";

        //System.out.println(path);
        //System.out.println(html);

        //Imprime o Cheque formatado
        Utilitario.mensagem(html, JOptionPane.PLAIN_MESSAGE);

        /*
         * } catch (ValidarException ex) { Utilitario.mensagem("Erro\n" +
         * ex.getMessage(), JOptionPane.ERROR_MESSAGE); shall = false;
            }
         */
    }
}
