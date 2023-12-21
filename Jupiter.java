public class Jupiter{

Jupiter()
{
System.out.println("defult constrator");
}
Jupiter(int n)
{
	System.out.println("1st constractor");
}
Jupiter(float f, int n)
{
	System.out.println("2nd constractor");
	
}
Jupiter(float f)
{
	System.out.println("3rd constractor");
}
public static void main (String args[]){
new Jupiter();
	new Jupiter(25);
	new Jupiter(56.98f,87);
	new Jupiter(4.876f);
	
	
}


}