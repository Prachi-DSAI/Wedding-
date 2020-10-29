import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Hi,welcome to ..... wedding planner. ");
        System.out.println("1) Please enter A to fill personal information  and to view to personal information filled by you");
        System.out.println("2) Please enter F to checkout the functions according to your religion");
        System.out.println("3) Please enter B to check the range of the budget ");
        System.out.println("4) Please enter G to check or add guest ");
        System.out.println("Type E when you want to exit!");
       wedding w = new wedding();
        w.choices();
        
    }
    
}

 class wedding{
     void choices()
     {
        char CHOICE='\0';
          
        do{
        
        Scanner scanner = new Scanner(System.in);
        CHOICE = scanner.next().charAt(0);
        switch(CHOICE)
        {
            case 'A':
            System.out.println("--------------------------------------------------");
            Customer c = new Customer();
            c.personalinfo();
            System.out.println("1) Please enter A to fill personal information and to view to personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist ");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;

            case 'a':
            System.out.println("--------------------------------------------------");
            Customer c1 = new Customer();
            c1.personalinfo();
            System.out.println("1) Please enter A to fill personal information and to view to personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'B':
            System.out.println("--------------------------------------------------");
            Budget b = new Budget();
            b.methodbudget();
            System.out.println("1) Please enter A to fill personal information and to view to personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist ");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'b':
            System.out.println("--------------------------------------------------");
            Budget b1 = new Budget();
            b1.methodbudget();
            System.out.println("1) Please enter A to fill personal information and to view to personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
             case 'F':
            System.out.println("--------------------------------------------------");
             Func f = new Func();
             f.info();
            System.out.println("1) Please enter A to fill personal information and to view personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check  guestlist");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'f':
            System.out.println("--------------------------------------------------");
             Func f1 = new Func();
             f1.info();
            System.out.println("1) Please enter A to fill personal information and to view personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist ");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'g':
            System.out.println("--------------------------------------------------");
            Guestlist g = new Guestlist();
             g.methodguest();
            System.out.println("1) Please enter A to fill personal information and to view personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check  guestlist");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'G':
            System.out.println("--------------------------------------------------");
            Guestlist g1= new Guestlist();
             g1.methodguest();
            System.out.println("1) Please enter A to fill personal information and to view personal information filled by you");
            System.out.println("2) Please enter F to checkout the functions according to your religion");
            System.out.println("3) Please enter B to check the range of the budget ");
            System.out.println("4) Please enter G to check guestlist ");
            System.out.println("Type E when you want to exit!");
            System.out.println("---------------------------------------------------");
            break;
            
            case 'E':
            System.out.println("---------------------------------------------------");
            break;
            
            case 'e':
            System.out.println("---------------------------------------------------");
            break;

            default:
            System.out.println("Invalid Option!! Please enter again");
            break;
        }
    }
        while(CHOICE  != 'E');
        
        System.out.println("ThankYou for using our services!");
        System.out.println("**"); 
    }
  }  
