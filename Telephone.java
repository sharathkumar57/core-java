public class Telephone{

Telephone()
{
System.out.println("defult constrator");
}
Telephone(char h)
{
	System.out.println("1st method");
}
Telephone(short s, int n)
{
	System.out.println("2nd method");
	
}
Telephone (short s)
{
	System.out.println("3rd method");
}
public static void main (String args[]){
	short value=45;
	new Telephone('a');
	new Telephone(value,87);
	new Telephone(value);
	
	
}


}