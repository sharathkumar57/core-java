public class Time{

Time()
{
System.out.println("defult constrator");
}
Time(short s)
{
	System.out.println("1st method");
}
Time(short s, int n)
{
	System.out.println("2nd method");
	
}
Time (float f)
{
	System.out.println("3rd method");
}
public static void main (String args[]){
	short value=77;
	new Time(value);
	new Time(value,87);
	new Time(3.67f);
	
	
}


}