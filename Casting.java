public class Casting{
public static void main(String[]args){

byte num=77;
short num1=num;
System.out.println(num1);

short val=45;
int val1=val;
System.out.println(val1);

int val2=23;
long val3=val2;
System.out.println(val3);

float val4=4.78f;
double val5=val4;
System.out.println(val5);

char val6='a';
int val7=val6;
System.out.println(val7);



long num1=988776655;              //down casting
int num2=(int)num1;
System.out.println(num2);

int num3=787667677;
short num4=(short)num3;
System.out.println(num4);


short num5=234;
byte num6=(byte)num5;
System.out.println(num6);


double num7=56.7655677;
float num8=(float)num7;
System.out.println(num8);

int num9=94;
char num10=(char)num9;
System.out.println(num10);


char value5='s';
int value6=value5-30;
char uppercase=(char)value6;
System.out.println(uppercase);

char value7='A';
int value8=value5+67;
char lowercase=(char)value8;
System.out.println(lowercase);









































}


















}