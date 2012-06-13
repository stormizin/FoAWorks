#include<stdio.h>
#include<conio.h>
#include<math.h>

int OP;
float CUB, TRAP, CIL, AREA, VOL, A, ALTURA, BMAIOR, BMENOR, RAIO, RAD, RAIZ;

float CUBICA (float radicando)
{
float RAIZ;
RAIZ=cbrt (radicando);
return (RAIZ);
}

float TRAPEZIO (float B1, float B2, float H1){
	float TRAPE;
	TRAPE=(B1+B2)*H1/2;
	return (TRAPE);
	}
float CILINDRO (float R2, float H1){
	float CILIND;
	(CILIND=3.14*R2, 2)*H1;
	return (CILIND);
	}
float AREAESFE (float R2){
	float AREA;
	(AREA=4*3.14*R2, 2);
	return (AREA);
	}
float VOLUMEESFE (float R3){
	float VOLUME;
	(VOLUME=(4*3.14*R3, 3))/3;
	return (VOLUME);
	}

main()
{
//inicio
do
{
//clrscr();
printf("\n\n");
printf("...:::MENU PRINCIPAL:::...\n\n\n\n");
printf("(1) Raiz Cubica\n\n");
printf("(2) Area do Trapezio\n\n");
printf("(3) Volume do Cilindro\n\n");
printf("(4) Area da Esfera\n\n");
printf("(5) Volume da Esfera\n\n");
printf("(6) Sair\n\n");

do
{
printf("Entre com a opcao desejada:");
scanf("%i", &OP);
}while ((OP<1)&&(OP>6));
switch(OP)
{
case 1:
printf("\n ...:::Raiz Cubica:::...\n\n");
printf("Entre com um numero:");
scanf("%f",&RAD);
RAIZ=CUBICA (RAD);
printf("\n\n A Raiz Cubica do numero informado: %f", RAIZ);
printf("\n\n Prescione qualquer tecla...");
getch();
break;

case 2:
printf("\n ...:::Area do Trapezio:::... \n\n");
printf(" Entre com a base maior:");
scanf("%f", &BMAIOR);
printf("Entre com a altura");
scanf("%f", &ALTURA);
TRAP=TRAPEZIO(BMAIOR, BMENOR, ALTURA);
printf("\n\n Area do Trapezio: %.2f", TRAP);
printf("\n\n Pressione qualquer tecla...");
getch();
break;

case 3:
printf("\n ...:::Volume do Cilindro:::... \n\n");
printf("Entre com o Raio do Cilindro:");
scanf("%f",&RAIO);
printf("Entre com a Altura do Cilindro");
scanf("%f", &ALTURA);
CIL=CILINDRO(RAIO, ALTURA);
printf("\n\n O Volume do CIlindro: %.2f", CIL);
printf("\n\n Pressione qualquer tecla...");
getch();
break;

case 4:
printf("\n ...:::Area da Esfera:::... \n\n");
printf("Entre com o Raio da Esfera:");
scanf("%f", &RAIO);
AREA=AREAESFE(RAIO);
printf("\n\n Area da Esfera: %.2f", AREA);
printf("\n\n Pressione qualquer tecla...");
getch();
break;

case 5:
printf("\n ...:::Volume da Esfera:::... \n\n");
printf("Entre com o Raio da Esfera:");
scanf("%f", &RAIO);
VOL=VOLUMEESFE(RAIO);
printf("\n\n O Volume da Esfera: %.2f", VOL);
printf("\n\n Pressione qualquer tecla...");
getch();
break;

case 6:
printf("\n\n Pressione qualquer tecla para sair...");
getch();
break;
}
}while (OP!=6);
}
