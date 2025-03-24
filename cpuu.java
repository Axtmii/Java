import java.util.*;
class cpuu
{
  int price;
  public CPU(int price)
  {
   this.price=price;
   }
   class processor
   {
   int cores;
   String manufacturer;
   processor(int cores,String manufacturer)
   {
   this.cores=cores;
   this.manufacturer=manufacture;
   }
   void display processorInfo()
   {
    System.out.println("processor core:"+cores);
    System.out.println("processor manufacture:"+manufacturer);
    }
   }
   static class RAM
   {
   int memory;
   String manufacture;
   RAM(int memory,String manufacture)
   {
     this.memory=memory;
     this.manufacturer=manufacture;
     }
     void display RAMInfo()
     {
       System.out.println("Memory"+memory+"GB");
       System.out.println("Memory manufacturer:"+manufacturer);
       }
      }
      public static void main(String args[])
      {
        CPU.cpu=new CPU(2500);
        CPU.processor p=CPU new processor(7,"INTEL");
        CPU_RAM ram=new CPU.RAM(16,"abc");
        System.out.println("CPU  price"+cpu.price);
        p.display ProcessorInfo();
        ram.displayRamInfo();
        }
        }
