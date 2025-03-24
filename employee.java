import java.util.*;
class employees
{
 int eNo;
 String eName;
 double Salary;
 employees(int no,String name,double salary)
 {
  eNo=no;
  eName=name;
  Salary=salary;
 }
 void display()
 {
  System.out.println("Employee number:"+eNo);
  System.out.println("Employee name:"+eName);
  System.out.println("Employee salary:"+Salary);
 } 
}
class employee
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of employees:");
  int n=sc.nextInt();
  employees[] emp=new employees[n];
  for (int i=0;i<n;i++)
  {
   System.out.println("\nEnter the details for employee"+(i+1)+":");
   int eNo=sc.nextInt();
   sc.nextLine();
   System.out.println("Employee name:");
   String eName=sc.nextLine();
   System.out.println("Employee salary:");
   Double Salary=sc.nextDouble();
   emp[i]=new employees(eNo,eName,Salary);
  }
  System.out.print("Enter the employee id to search:");
  int searchNo=sc.nextInt();
  boolean found =false;
  for (employees emps:emp)
  {
   if (emps.eNo==searchNo)
   {
    System.out.println("Employee details founds");
    emps.display();
    found=true;
    break;
   }
  }
  if (!found)
  {
   System.out.println("Employee with id"+searchNo+"Not found");
  }
 }
}


                  
