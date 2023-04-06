import java.text.SimpleDateFormat;  
import java.util.Date;  

//import java.util.Scanner; 
public class Dateformat {  
    public static void main(String[] args) {  
    Date date = new Date();  
    //Scanner sc = new Scanner (System.in);
   

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate = formatter.format(date);  
    System.out.println("Date Format with dd/mm/yyyy : "+strDate);  

    formatter = new SimpleDateFormat("MM-dd-yyyy ");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with MM-dd-yyyy  : "+strDate);  

    formatter = new SimpleDateFormat("yyyy-MM-dd ");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with yyyy-MM-dd : "+strDate);  

    formatter = new SimpleDateFormat(" hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with  hh:mm:ss : "+strDate);  

    formatter = new SimpleDateFormat(" hh:mm:ss a");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with  hh:mm:ss a : "+strDate);  

  

    formatter = new SimpleDateFormat("hh:mm");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with  hh:mm : "+strDate);
    
    formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd-MM-yyyy hh:mm:ss : "+strDate);  

    formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss a");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with MM-dd-yyyy hh:mm:ss a : "+strDate);  

    formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with yyyy-MM-dd hh:mm: "+strDate);  
}
}
//javac Dateformat.java

// java Dateformat      
// Date Format with dd/mm/yyyy : 05/04/2023
// Date Format with MM-dd-yyyy  : 04-05-2023
// Date Format with yyyy-MM-dd : 2023-04-05
// Date Format with  hh:mm:ss :  10:35:07
// Date Format with  hh:mm:ss a :  10:35:07 PM
// Date Format with  hh:mm : 10:35
// Date Format with dd-MM-yyyy hh:mm:ss : 05-04-2023 10:35:07
// Date Format with MM-dd-yyyy hh:mm:ss a : 04-05-2023 10:35:07 PM
// Date Format with yyyy-MM-dd hh:mm: 2023-04-05 10:35