

package pac;
import java.io.File;
import java.util.*;


public class BloodTestJava extends Abstract
{
   
  ///datatypes and variables//
    

    
     int id;
    String name;
    String bloodGroup;
    String whiteBloodCount;
    String redBloodCount;
    String hemoglobin;
    String hepatitis;
    static int i; 
  
  ///Static block initialization///
   static
          {
              i=0;
          }
  
  ///default constructor
public BloodTestJava()
  {
      i++;
   
  }

///Setter method method///
public void setID(int id)
{
    this.id=id;
}

public void setName(String name)
{
   this.name=name;
}

public void setBloodGroup(String bloodGroup)
{
    this.bloodGroup=bloodGroup;
}

public void setWhiteBloodCount(String whiteBloodCount)

{
    this.whiteBloodCount=whiteBloodCount;
}
public void setRedBloodCount(String redBloodCount)

{
    this.redBloodCount=redBloodCount;
}
public void setHemoglobin(String hemoglobin)

{
    this.hemoglobin=hemoglobin;
}
public void setHepatitis(String hepatitis)

{
    this.hepatitis=hepatitis;
}
///getter method///

public String getName()
{
    return name;
}
public int getID()
{
    return id;
}
public String getBloodGroup()
{
    return bloodGroup;
}
public String getWhiteBloodCount()
{
    return whiteBloodCount;
}
public String getRedBloodCount()
{
    return redBloodCount;
}
public String getHimoglobin()
{
    return hemoglobin;
}
public String gethepatitis()
{
    return hepatitis ;
}

     @Override
 public void bloodTestshow()
    {
    System.out.println("....Blood Test Report....");
    System.out.println(" 'A'-> To Know your Blood Group");
    System.out.println(" 'B'-> To Know your White Blood Count");
    System.out.println(" 'C'-> To Know your Red   Blood Count");
    System.out.println(" 'D'-> To Know your Hemoglobin");
    System.out.println(" 'E'-> To Know your Hepatitis Result");
    
}
 
     @Override
  public void display()
  {
        Scanner acc=new Scanner(System.in);
        System.out.print("User Name: ");
        String Name=acc.nextLine();
        String s2="Tamimul Alam";
        
        ///Serial Number///
        System.out.print("ID NO:");
        String ID=acc.nextLine();
        String s9="2042215";
        
        if(Name.equalsIgnoreCase(s2)&&ID.equals(s9))
        {
            bloodTestshow();
            
        }
        else{
            System.out.println("");
            System.out.println("Sorry Your ID Number Is Wrong");
           }
        while(true){
            Scanner input=new Scanner(System.in);
            String s1=input.nextLine();
            
            String s3="A";
            if(s1.equalsIgnoreCase(s3))
            {
                System.out.println(getBloodGroup());
                
            }
            String s4="B";
            if(s1.equalsIgnoreCase(s4))
            {
                System.out.println(getWhiteBloodCount());
            }
             String s6="C";
            if(s1.equalsIgnoreCase(s6))
            {
                System.out.println(getRedBloodCount());
            }
            
             String s7="D";
            if(s1.equalsIgnoreCase(s7))
            {
                System.out.println(getHimoglobin());
            }
         String s8="E";
            if(s1.equalsIgnoreCase(s8))
            {
                System.out.println(gethepatitis());
            }
    }
    }
  


}

