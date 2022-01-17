/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab.patient;

/**
* Lab 2 PostLab Room
 * @author amirah hasya
 */
public class Room extends Patient
{
    public String typeRoom;
    public int noDay;
    
    public Room( String patientName, int patientNumber, String patientAddress, String typeRoom, int noDay )
    {
        super( patientName, patientNumber, patientAddress );
        this.typeRoom = typeRoom;
        this.noDay = noDay;
    }
    
    public String getTypeRoom()
    {
        return typeRoom;
    }
    public int getNoDay()
    {
        return noDay;
    }
    
    public double calcPayment()
    {
        double totalFee = 0.0;
        double payment = 0.0;
        if(noDay > 20)//if more than 20 days
        {
            if(typeRoom.equals("Diamond"))
            {
                totalFee = ( 200*noDay);
                payment = totalFee-(totalFee*0.25);
            }
            else if(typeRoom.equals("Gold"))
            {
                totalFee = ( 100*noDay);
                payment = totalFee-(totalFee*0.25);
            }
            else if(typeRoom.equals("Silver"))
            {
                totalFee = ( 80*noDay );
                payment = totalFee-(totalFee*0.25);
            }
            else if(typeRoom.equals("Bronze"))
            {
                totalFee = ( 50*noDay);
                payment = totalFee - (totalFee*0.25);
            }
        }
        else if(noDay >= 1 && noDay <= 20)//if less than 20 days
        {
            if(typeRoom.equals("Diamond"))
            {
                totalFee = ( 200*noDay);
                payment = totalFee;
            }
            else if(typeRoom.equals("Gold"))
            {
                totalFee = ( 100*noDay);
                payment = totalFee;
            }
            else if(typeRoom.equals("Silver"))
            {
                totalFee = ( 80*noDay );
                payment = totalFee;
            }
            else if(typeRoom.equals("Bronze"))
            {
                totalFee = ( 50*noDay );
                payment = totalFee;
            }
        }
       return payment;
        
    
    }
    
}
