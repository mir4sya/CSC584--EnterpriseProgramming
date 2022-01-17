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
public abstract class ZooTaiping 
{
    private String visitorName;
    private String icNumber;
    private boolean govServant;
    
    public ZooTaiping(String name, String ic, boolean govServ)
    {
      visitorName = name;
      icNumber = ic;
      govServant = govServ;
    }
    
    public ZooTaiping ()
    {
      visitorName = null;
      icNumber = null;
      govServant = true;
    }
    
    void setZooTaiping (String name, String ic, boolean govServ)
    {
      visitorName = name;
      icNumber = ic;
      govServant = govServ;   
    }
    
    public String getVisitorName(){return visitorName;}
    public String getIcNumber(){return icNumber;}
    public boolean getGovServant(){return govServant;}
    
    public abstract double totalCharges();
   
    public String toString()
    {
        return "Visitor's Name: "+ visitorName + "\nIC Number: "+icNumber+"\nGoverment Servant Status: "+ govServant;
    }
}

class DayVisit extends ZooTaiping
{
    private String category;
    
    public DayVisit()
    {
        category = null;   
    }
 
    public DayVisit(String name, String ic, boolean govServ, String cat)
    {
        super(name, ic, govServ);
        category = cat;   
    }
    
    void setDayVisit(String name, String ic, boolean govServ, String cat)
    {
        super.setZooTaiping (name, ic, govServ);
        category = cat;
    }
    
    public String getCategory(){return category;}
  
    public double totalCharges()
    {
        double charge = 0.0;
        
        if (getGovServant() == true)
        {
            if (category.equalsIgnoreCase("A"))
            {
                charge = 25 * 0.85;
            }
            else if (category.equalsIgnoreCase("C"))
            {
                charge = 15.00 * 0.85;
            }
        }
        else 
        {
            if (category.equalsIgnoreCase("A"))
            {
                charge = 25.00;
            }
            else if (category.equalsIgnoreCase("C"))
            {    
                charge = 15.00;
            }
        }  
       return charge;     
    }
    
    public String toString()
    {
        return super.toString()+"\nCategory :"+ getCategory();
    }
}

class NightVisit extends ZooTaiping
{
    private boolean packageA;
    private boolean packageB;
    private boolean packageC;
   
    public NightVisit(String name, String ic, boolean govServ, boolean A, boolean B, boolean C)
    {
        super(name, ic, govServ);
        packageA = A; 
        packageB = B;
        packageC = C; 
    }
    
    void setNightVisit(String name, String ic, boolean govServ, boolean A, boolean B, boolean C)
    {
        super.setZooTaiping (name, ic, govServ);
        packageA = A; 
        packageB = B;
        packageC = C; 
    }
   
    public boolean getPackageA(){return packageA;}
    public boolean getPackageB(){return packageB;}
    public boolean getPackageC(){return packageC;}
    
    public double totalCharges()
    {
        double price = 0.0;
    
        if(getGovServant() == true)
        {
            if (packageA == true)
                price = 50.00 * 0.85;
            else if (packageB == true)
                price = 75.00 * 0.85;
            else if (packageC == true)
                price = 100.00 * 0.85;
        }
        else 
        {
            if (packageA == true)
                price = 50.00;
            else if (packageB == true)
                price = 75.00;
            else if (packageC == true)
                price = 100.00;
        }
        return price;
    }
    public String toString()
    {
        return super.toString()+"\nPackage A :"+ getPackageA()+"\nPackage B :"+ getPackageB()+"\nPackage C :"+ getPackageC();
    }
}


    

