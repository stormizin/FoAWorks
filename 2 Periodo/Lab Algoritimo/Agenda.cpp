#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <conio.h>

typedef struct Agenda
{
        char nome[50];
        char fone[17];
        char email[80];
}T_agenda;

// prototipos
void inclusao(void);
void Listar(void);
void quick_struct(int);
void qs_struct(int,int);
void ordenar(void);
void pesquisar(void);
char Validaresp();

static int qtd = 0;

T_agenda Tab[100];
FILE *fp;


// =================================================================
// ==================Incluir dados no arquivo=======================
//==================================================================
void inclusao(){
     int total = 0, retorno;
     char op = 's';
     char bug;
     
     if ((fp = fopen("agenda.db", "a")) == NULL)
     {
        printf ("O arquivo da lista não pode ser aberto!\n");
        printf ("Insira dados!\n");
        system("pause");
        exit(1);
     }
     while (op == 's')
     {
           scanf("%c",&bug);
           printf("Digite o nome: ");
           gets(Tab[total].nome);
           printf ("Digite o numero: ");
           gets(Tab[total].fone);
           printf ("Digite o E-mail: ");
           gets(Tab[total].email);

           retorno = fwrite (&Tab[total], sizeof(struct Agenda) ,1,fp);

           if (retorno == 1) {
               printf(" \nGravacao ok ! ");
           }
           total++;
           op = Validaresp();
           qtd++;
     }
     fclose (fp);
}

//======================================================================
// ======Valida resposta ===============================================

char Validaresp() {
   char op;
   do {
      printf(" \nDeseja inserir novos dados? [S ou N] ? " );
      scanf("%c",&op);
      printf("\n" );
   } while (op != 's' && op != 'n');
   return op;
}
  
//======================================================================
// ======Lista os contatos cadastrados =================================

void Listar(){
int i = 0, retorno;

    if ((fp = fopen("agenda.db", "r")) == NULL)
    {
    printf ("O arquivo da lista não pode ser aberto!\n");
    printf ("Insira dados!\n");
    system("pause");
    exit(1);
    }

    retorno = fread(&Tab[i], sizeof(struct Agenda), 1, fp);
   // fread retorna a quantidade de itens ...

   while ( retorno == 1) {
      printf("\n Nome ..: %s",   Tab[i].nome);
      printf("\n Fone ..: %s",   Tab[i].fone);
      printf("\n E-mail ..: %s\n",   Tab[i].email); 
      i++;
      retorno = fread(&Tab[i], sizeof(struct Agenda), 1, fp);  
      }
      printf(" \n\n %d Contatos salvos!\n", i);
     system("pause");
      fclose(fp);
}
//======================================================================
// ======DESTRUIR ARQUIVO ==========================================================

int remover(){
     printf("Dados apagados!");
     fp = fopen("agenda.db","w");
     return 0;
     }

//======================================================================
// ======Menu ==========================================================

void menu(void){
char op;
int teste;

if ((fp = fopen("agenda.db", "r")) != NULL){
        qtd = 0;       
        do {
             teste = fread(&Tab, sizeof(struct Agenda), 1, fp);
             qtd++;
        }while ( teste == 1 );
        qtd--;
}

do{
system("cls");
printf("\n(1)Incluir\n(2)Listar\n(3)Apagar Dados\n\n");
scanf("%c",&op);
switch(op){
case '1':
     inclusao();
break;
case '2':
     Listar();
break;
case '3':
     remover();
break;
default:
exit(1);
}
}while (op < 4);
}

int main (){
    int var;

    printf("\n\n\n\n\n\n\n\n\n\n");
    printf("                  .::AGENDA ELETRONICA:.  \n\n");
    printf("  Veja todas as funcoes disponiveis no menu   \n");
    printf("  use os numeros para selecionar a opcao desejada  \n\n\n");
    var = system("pause");
    
    if(var == 27){ exit(1);}
menu();
system("Pause");
}
