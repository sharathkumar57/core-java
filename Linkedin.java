public class Linkedin{
Linkedin()
{
System.out.println("defult constrator");
}
Linkedin(long h)
{
	System.out.println("1st constractor");
}
Linkedin(int n,short h)
{
	System.out.println("2nd constractor");
	
}
Linkedin(short h)
{
	System.out.println("3rd constractor");
}
public static void main (String args[]){
short value=657;
long val=78867;
new Linkedin();
	new Linkedin(val);
	new Linkedin(87,value);
	new Linkedin(value);
	
	
}


}