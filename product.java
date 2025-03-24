import java.util.Scanner;
class Product
{
 int pcode;
 String pname;
 int price;
 void getdata() 
 {
  System.out.println("enter product code,name,price:");
  Scanner sc=new Scanner(System.in);
  this.pcode=sc.nextInt();
  sc.nextLine();
  this.pname=sc.nextLine();
  this.price=sc.nextInt();
 }
 void display() 
 {
  System.out.println("product code is:"+pcode);
  System.out.println("product name is:"+pname);
  System.out.println("product price is:"+price);
 }
}

public class product
{
 public static void main(String args[])
 {
  Product p1=new Product();
  p1.getdata();
  p1.display();
  Product p2=new Product();
  p2.getdata();
  p2.display();
  Product p3=new Product();
  p3.getdata();
  p3.display();

  if(p1.price<p2.price && p1.price<p3.price)
  {
   System.out.println("product 1 has least price");
  } 
  else if(p2.price<p3.price)
  {
   System.out.println("product 2 has least price");
  }
  else
  {
   System.out.println("product 3 has least price");
  }
 }
}

