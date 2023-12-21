public class Number
{
	Number()
	{
		System.out.println("defult constractor");
	
	}
	Number(float f, int n)
	{
		System.out.println("1constractor");
	}
	Number(char h){
		System.out.println("2nd constractor");
	}
	Number (float f)
	{
		System.out.println("3rd constractor");
	}





public static void main (String[] args){

new Number();
new Number(3.45f,345);
new Number('s');
new Number(57);
}
}