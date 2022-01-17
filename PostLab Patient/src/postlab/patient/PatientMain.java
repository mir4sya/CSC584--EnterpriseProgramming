/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab.patient;

/** Lab 2 PostLab PatientMain(main class)
 * @author amirah hasya *
 * @author USER
 */

import java.util.Scanner;
public class PatientMain 
{
    public static void main( String[] args )
    {
         Room arrRoom[] = new Room[5]; 
       //declare an array of obj to store(50)
       
        Scanner in = new Scanner(System.in);
        int x =1 ;
        for(int i=0;i<arrRoom.length;i++)
          {
          System.out.println(x);
          System.out.print("Enter patient name (e.g. Habib):");    
          String PatientName = in.nextLine();    
          System.out.print("Enter patient number (e.g. 1234):");    
          int PatientNumber=in.nextInt();
          in.nextLine();
          System.out.print("Enter patient address (e.g. Pahang):");    
          String PatientAddress=in.nextLine();    
          System.out.print("Enter type of room (e.g. Diamond,Gold,Silver,Bronze):");
          String typeRoom=in.nextLine();
          System.out.print("Enter no. of day (e.g. 3):");
          int noDay=in.nextInt();
          in.nextLine();
          arrRoom[i]=new Room(PatientName,PatientNumber,PatientAddress,typeRoom,noDay);
          x++;
          }
          
      int count=0;
        for (Room r1 : arrRoom)
        {
            if (r1.getNoDay() > 20)
            {
                count++;
            }
        }
        System.out.println("The number of patient more than 20 day : " +count);  
        
      double totalPayment = 0.0;
      int totalDay = 0;
      double avg = 0.0;
        for (Room r1 : arrRoom) 
        {
            totalPayment = totalPayment + r1.calcPayment();
            totalDay += r1.getNoDay();
        }
      avg = totalPayment / totalDay;
      System.out.println("Average payment: "+avg);
    }    
    
    
}
