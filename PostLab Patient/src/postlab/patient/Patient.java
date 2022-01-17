/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postlab.patient;

/**
* Lab 2 PostLab Patient
 * @author amirah hasya
 */
public class Patient 
{
    public String patientName;
    public int patientNumber;
    public String patientAddress;
    
    //constructor
    public Patient( String patientName, int patientNumber, String patientAddress )
    {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
    }
    
     //
    public void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }
    public void setPatientNumber(int patientNumber )
    {
        this.patientNumber = patientNumber;
    }
    public void setPatientAddress(String patientAddress )
    {
        this.patientAddress = patientAddress;
    }
  
    
    //
    public String getPatientName()
    {
        return patientName;
    }
    public int getPatientNumber()
    {
        return patientNumber;
    }
    public String getPatientAddress()
    {
        return patientAddress;
    }
    
}
    
    

    
