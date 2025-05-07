package graphics;
import java.util.*;
public class traingle
{
 int h,b;
 double a;
 Scanner sc=new Scanner(System.in);
 public void area()
 {
  System.out.println("Enter the height:");
  h=sc.nextInt();
  System.out.println("Enter the base:");
  b=sc.nextInt();
  a=0.5*h*b;
 }
 public void display()
 {
  System.out.println("Area of traingle:"+a);
 }
}
