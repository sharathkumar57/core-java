public class Books{
String bookname;
int noofPages;
String author;
int price;
int publishedYear;
String publisher;
String type;


Books(String bookname, int noofPages, String author,int price, int publishedYear,String publisher,String type)
{
	this.bookname=bookname;
	this.noofPages=noofPages;
	this.author=author;
	this.price=price;
	this.publishedYear=publishedYear;
	this.publisher=publisher;
	this.type=type;
}
public void booksinfo(){
	
System.out.println("bookname:" +bookname);
System.out.println("noofPages:" +noofPages);
System.out.println("author:" + author);
System.out.println(" price:" + price);
System.out.println("publishedYear:" +publishedYear);
System.out.println(" publisher:" +publisher);
System.out.println("type:" + type);	
}

public static void main(String[] args){
	Books book1=new Books("the intelligent investor",640, "Benjamin Graham", 300,1949,"harper business","stock");
	Books book2=new Books("the water dancer",416,"Ta-Nehisi coates",850,2019,"one world","fiction");
	Books book3=new Books("circle",400,"madeline miller",700,2018,"little","mythology");
	Books book4=new Books("Normal people",288,"Sally Rooney", 600,2016,"hogarth","fiction");
	Books book5=new Books("Becoming",448,"michelle obama",650,2015,"crown Publishing","memoir");
	Books book6=new Books("The silent Patient",330,"alex",400,2019,"celdon","thriller");
	Books book7=new Books("Educated",352,"Tata Westover",1300,2018,"random House","memoir");
	
	
	
	book1.booksinfo();
	book2.booksinfo();
	book3.booksinfo();
    book4.booksinfo();
	book5.booksinfo();
	book6.booksinfo();
    book7.booksinfo();






}
}