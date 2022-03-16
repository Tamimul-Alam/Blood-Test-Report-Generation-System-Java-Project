


import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import pac.*;
 

public class BloodTestMain extends BloodTestJava {
    
   public static void main (String[] args)
    {
       
        ///User information///
        BloodTestJava b1=new BloodTestJava();
        ///set///
        b1.setName("Tamimul ALam");
        b1.setID(2042215);
        b1.setBloodGroup("Your Blood Group: O+");
        b1.setWhiteBloodCount("Your White Blood Count:3.3");
        b1.setRedBloodCount("Your Red Blood Count:6.6");
        b1.setHemoglobin("Your Hemoglobin Result:12");
        b1.setHepatitis("Your Hepatitis Result: Negative");
        
        File dirFile=new File("UserDirectory");
			dirFile.mkdir();
			
	//copy location///
	String path=dirFile.getAbsolutePath();	
	File user_File=new File(path+"/user.txt");
        //file created//
        System.out.println(dirFile.getAbsolutePath());
	
    try{
        
    Formatter form=new Formatter("user.txt");
    
    form.format("%s","User Name: Tamimul Alam");
    form.format("%s","\nID NO:2042215");
    
    form.close();
    }
catch(Exception e) {

}
  
  File file1=new File(path+"/user.txt");
  try{
   Scanner s=new Scanner(file1); 
   while(s.hasNext())
   {
     int id=s.nextInt();
     String name=s.next();
       System.out.println(id);
       System.out.println(name);
   }
   s.close();
  }
  catch(Exception e) {

}
        
        ///get//
        b1.getName();
        b1.getID();
        b1.getBloodGroup();
        b1.getWhiteBloodCount();
        b1.getRedBloodCount();
        b1.getHimoglobin();
        b1.gethepatitis();
        b1.display();
     
        b1.bloodTestshow();
        
}
}