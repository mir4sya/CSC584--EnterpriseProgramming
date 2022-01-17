/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab.zootaiping.pkg2;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class TestZoo 
{
    public static void main(String[] args)
    {   
       Scanner s1 = new Scanner(System.in);//String input
       Scanner s2 = new Scanner(System.in);//boolean input

       int count = 0;
       int count1 = 0;
       double totDA = 0.0;
       double totDC = 0.0;
       double totNA = 0.0;
       double totNB = 0.0;
       double totNC = 0.0;
       double totinc = 0.0;
       
       
       ZooTaiping[] zoo = new ZooTaiping[4];
       
       for(int i=0; i<zoo.length; i++)
       {
           System.out.println ("Visitor's Name: ");
           String visitorName = s1.nextLine();
           System.out.println ("IC Number: ");
           String icNumber = s1.nextLine();
           System.out.println ("status Government Servant (true | false): ");
           boolean govServant = s2.nextBoolean();
           System.out.println ("Visit Type (N-Night | D-Day): ");
           String catVisit = s1.nextLine();
          
           if(catVisit.equals("D"))
           {
               System.out.println ("Category (A-Adult | C-Children): ");
               String category = s1.nextLine();
               System.out.println("\n\n");
               zoo[i]= new DayVisit ( visitorName, icNumber, govServant, category);
             
               if(zoo[i] instanceof DayVisit)
               {
                   DayVisit dv = (DayVisit) zoo[i];
                   {
                       if (dv.getCategory().equals("A"))
                       totDA += zoo[i].totalCharges();
                       else if (dv.getCategory().equals("C"))
                       totDC += zoo[i].totalCharges(); 
                   }
                   count++;
               }
           }
           else if (catVisit.equals("N"))
           {
               System.out.println ("Choose Package A (true | false): ");
               boolean packageA = s2.nextBoolean();
               System.out.println ("Choose Package B (true | false): ");
               boolean packageB = s2.nextBoolean();
               System.out.println ("Choose Package C (true | false): ");
               boolean packageC = s2.nextBoolean();
               System.out.println("\n\n");
               zoo[i] = new NightVisit(visitorName, icNumber, govServant, packageA, packageB, packageC);
                
               if(zoo[i] instanceof NightVisit)
               {
                   NightVisit nv = (NightVisit) zoo[i];
                   {
                       if (nv.getPackageA() == true)
                           totNA += zoo[i].totalCharges();
                       else if (nv.getPackageB() == true)
                           totNB += zoo[i].totalCharges();
                       else if (nv.getPackageC() == true)
                       {
                           totNC += zoo[i].totalCharges();
                           System.out.println(zoo[i].toString()+"\ntotal cost is RM"+ zoo[i].totalCharges());
                           System.out.println("\n\n");
                       }
                       count1++;
                   }
               }
           }
           totinc=totDA+totDC+totNA+totNB+totNC;
       }
      
       System.out.println("Number of visitor at day : " + count); 
       System.out.println("Number of visitor at night : " + count1);
       System.out.println("Total income for Zoo Taiping : RM" +totinc );   
    }
    
}
