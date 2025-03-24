import java.util.*;
class menu
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String arr[]={"Apple","Mango","Orange","Cherry","kiwi","Guava"};
  int choice;
  do
  {
   System.out.println("\n menu:");
   System.out.println("1. Search for a string:");
   System.out.println("2. Sort the array:");
   System.out.println("3. Exit");
   System.out.println("Enter your choice:");
   choice=sc.nextInt();
   sc.nextLine();
    
   switch(choice)
   {
    case 1:System.out.print("Enter a string to search:");
    	   String searchStr=sc.nextLine();
    	   boolean found = false;
    	   
    	   for(String str:arr)
    	   {
    	    if(str.equalsIgnoreCase(searchStr))
            {
             found = true;  
             break;
            }
           }
           if(found)
           System.out.println(searchStr +" Found ");	 
           else
           System.out.println(searchStr +" Not found ");
           break;
    case 2:Arrays.sort(arr);
           System.out.println("Sorted array:"+Arrays.toString(arr));
           break;
    case 3:System.out.println("Exiting...");	
    	   break;
    default:System.out.println("Invalid option...Provide a valid option");
           break;
   }	  	 	   
  }
 while(choice!=3);
 }
 
 
 
}
