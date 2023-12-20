public class Car{
String brandName;
String colour;
int price;
int mileage;
int enginecapacity;
int numberofairbags;
int topspeed;
boolean havingAc;


public Car(String brandName, String colour, int price, int engineCapacity, int numberofairbags, int topspeed, boolean havingAc)
{
	this.brandName=brandName;
	this.colour=colour;
	this.price=price;
	this.mileage=mileage;
	this.enginecapacity=enginecapacity;
	this.numberofairbags=numberofairbags;
	this.topspeed=topspeed;
	this.havingAc=havingAc;
}
public static void main(String args[]){
	Car car1=new Car("Toyota", "black", 60000, 45,7,180,true);
	System.out.println(car1.brandName);
	System.out.println(car1.colour);
	System.out.println(car1.price);
	System.out.println(car1.enginecapacity);
	System.out.println(car1.numberofairbags);
	System.out.println(car1.topspeed);
	System.out.println(car1.havingAc);
	
	Car car2=new Car("honda", "silver", 70000, 25,6,140,true);
	System.out.println(car2.brandName);
	System.out.println(car2.colour);
	System.out.println(car2.price);
	System.out.println(car2.enginecapacity);
	System.out.println(car2.numberofairbags);
	System.out.println(car2.topspeed);
	System.out.println(car2.havingAc);
	
	Car car3=new Car("ford", "blue", 90000, 26,4,130,true);
	System.out.println(car3.brandName);
	System.out.println(car3.colour);
	System.out.println(car3.price);
	System.out.println(car3.enginecapacity);
	System.out.println(car3.numberofairbags);
	System.out.println(car3.topspeed);
	System.out.println(car3.havingAc);
	
	
	Car car4=new Car("volkswagen", "red", 2000000, 25,7,140,true);
	System.out.println(car4.brandName);
	System.out.println(car4.colour);
	System.out.println(car4.price);
	System.out.println(car4.enginecapacity);
	System.out.println(car4.numberofairbags);
	System.out.println(car4.topspeed);
	System.out.println(car4.havingAc);
	
	
	
	Car car5=new Car("Mercedes Benz", "white", 5000000, 4,9,180,true);
	System.out.println(car5.brandName);
	System.out.println(car5.colour);
	System.out.println(car5.price);
	System.out.println(car5.enginecapacity);
	System.out.println(car5.numberofairbags);
	System.out.println(car5.topspeed);
	System.out.println(car5.havingAc);
	
	
	
		
	
		
	
	
}




}