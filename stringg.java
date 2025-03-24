import java.util.*;
class string
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string:");
    String str1=sc.nextLine();
    System.out.println("Enter the second string:");
    String str2=sc.nextLine();
    String copystr1=str1;
    System.out.println("Copied string");
    System.out.println("Copy of first string"+copystr1);
    System.out.println("Comparison of strings:");
    if (str1.equals(str2))
    {
      System.out.println("Both strings are equal");
    }
    else
   {
     System.out.println("Both strings are not equal");
    }
    System.out.println("Length of the first string :"+str1.length());
    System.out.println("Length of the second string:"+str2.length());
    System.out.println("Concatenating two strings:"+str1.concat(str2));
    }
  }  
        
  
