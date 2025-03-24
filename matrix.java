import java.util.*;
class matrix
{
 public static void main(String args[])
 {
  int r,c,i,j,k;
  int[][] mat1=new int[5][5];
  int[][] mat2=new int[5][5];
  int[][] mat3=new int[5][5];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows and columns:");
  r=sc.nextInt();
  c=sc.nextInt();
  System.out.println("Enter the elements of 1st matix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    mat1[i][j]=sc.nextInt();
   }
  }  
  System.out.println("Enter the elements of 2nd matix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    mat2[i][j]=sc.nextInt();
   }
  }  
  System.out.println("Sum of 2 matrix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    mat3[i][j]=mat1[i][j]+mat2[i][j];
   }
  }  
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    System.out.print(mat3[i][j]+"");
   }
    System.out.println();
  }
  System.out.println("Multiplication of 2 matrix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    mat3[i][j]=0;
    for(k=0;k<c;k++)
    {
     mat3[i][j]=mat3[i][j]+mat1[i][k]*mat2[k][j];
    }
   }
  }
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    System.out.print(mat3[i][j]+"");
   }
   System.out.println();
  }
 }
}
 
