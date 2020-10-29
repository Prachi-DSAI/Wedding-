import java.util.Scanner;
public class Customer 
{
    public void personalinfo()
    {
        char CHOICE2='\0';
    System.out.println("Please enter your name");
    Scanner namecustomer = new Scanner(System.in);
    String NAMECUSTOMER = namecustomer.next();
    System.out.println("Hi "+NAMECUSTOMER );
     

    System.out.println("Enter your relation with Groom (Enter none if you are from Bride side): ");
    Scanner relationgroom = new Scanner(System.in);
    String RELATIONGROOM = relationgroom.next();
     


    System.out.println("Enter your relation with Bride (Enter none if you are from Groom side): ");
    Scanner relationbride = new Scanner(System.in);
    String RELATIONBRIDE = relationbride.next();
    

    System.out.println("Please enter the name of Groom: ");
    Scanner groom = new Scanner(System.in);
    String GROOM = groom.next();
    

    System.out.println("Please enter the name of Bride: ");
    Scanner bride = new Scanner(System.in);
    String BRIDE = bride.next();
 

    System.out.println("Please enter phone number from Groom Side : ");
    Scanner groomphone = new Scanner(System.in);
    long GROOMPHONE = groomphone.nextLong();
     

    System.out.println("Please enter phone number from Bride Side : ");
    Scanner bridephone = new Scanner(System.in);
    long BRIDEPHONE = bridephone.nextLong(); 


    System.out.println("Please enter address of Groom : ");
    Scanner groomaddress = new Scanner(System.in);
    String GROOMADDRESS = groomaddress.next();
    
    
    System.out.println("Please also enter the pin-code : ");
    Scanner groompincode = new Scanner(System.in);
    int GROOMPINCODE = groompincode.nextInt();
   

    System.out.println("Please enter address of Bride : ");
    Scanner brideaddress = new Scanner(System.in);
    String BRIDEADDRESS = brideaddress.next();
     

    System.out.println("Please also enter the pin-code : ");
    Scanner bridepincode = new Scanner(System.in);
    int BRIDEPINCODE = bridepincode.nextInt();
   

    System.out.println("Please enter email-id of Groom : ");
    Scanner groomemail = new Scanner(System.in);
    String GROOMEMAIL = groomemail.next();


    System.out.println("Please enter email-id of Bride : ");
    Scanner brideemail = new Scanner(System.in);
    String BRIDEEMAIL = brideemail.next(); 
  
           
    System.out.println("Enter 'a' if you want to check the personal information filled by you else tybe 'b'");
    Scanner choice2 = new Scanner(System.in);
        CHOICE2 = choice2.next().charAt(0);
    System.out.println("a is "+CHOICE2);
    if(CHOICE2==97|| CHOICE2==65)
{

    System.out.println();
    System.out.println();
    System.out.println("Client name : "+ NAMECUSTOMER);
    System.out.println("Your relation with Groom : "+ RELATIONGROOM);
    System.out.println("Your relation with Bride : "+ RELATIONBRIDE);
    System.out.println("Name of Groom: "+ GROOM);
    System.out.println("Name of Bride: "+ BRIDE);
    System.out.println("Contact number from Groom side: "+ GROOMPHONE );
    System.out.println("Contact number from Bride side: "+ BRIDEPHONE );
    System.out.println("Groom address (including pin-code): " + GROOMADDRESS + "(" + GROOMPINCODE + ")");
    System.out.println("Bride address (including pin-code): " + BRIDEADDRESS + "(" + BRIDEPINCODE + ")");
    System.out.println("Groom email-id: " + GROOMEMAIL );
    System.out.println("Bride email-id: " + BRIDEEMAIL );   
}

    } 
}
