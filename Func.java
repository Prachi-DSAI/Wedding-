import java.util.Scanner;
public class Func 
{
    public void info()
    {
        int FUNCTIONCOUNT;
        int DATE;
        int MONTH;
        int YEAR;
        int HOURS;
        int MIN;
        System.out.println("\n\nPlease enter further details for functions and dates of functions");
        System.out.println("\nPlease enter your religion and related functions");
        Scanner religion = new Scanner(System.in);
        String RELIGION = religion.next();


        if(RELIGION.equals("hindu")||RELIGION.equals("Hindu"))
        {
             System.out.println("Functions in hindu religion are:");
              System.out.println("1.\tRoka Ceremony\n2.\tEngagement Ceremony\n3.\tSangeet Ceremony\n4.\tWedding\n\n");
            System.out.println("\nPlease enter how many functions you want!");
            Scanner functioncount = new Scanner(System.in);
            FUNCTIONCOUNT= functioncount.nextInt();

            System.out.println("Please enter names of functions you want.");
            Scanner  namesoffunctions = new Scanner(System.in);

            String[] NAMESOFFUNCTIONS= new String[FUNCTIONCOUNT];
           
            Scanner date=new Scanner(System.in);
            Scanner month=new Scanner(System.in);
            Scanner year=new Scanner(System.in);
            Scanner hours=new Scanner(System.in);
            Scanner min=new Scanner(System.in);
            
            for(int i=0;i<FUNCTIONCOUNT;i++)
            {
              System.out.println("enter name of "+(i+1)+" function");

              NAMESOFFUNCTIONS[i] = namesoffunctions.nextLine();
              System.out.println("Enter date of " + NAMESOFFUNCTIONS[i]+" Ceremony");
              System.out.println("Date:");
              DATE=date.nextInt();
              System.out.println("Month:");
              MONTH=month.nextInt();
              System.out.println("Year:");
              YEAR=year.nextInt();
              System.out.println("Enter time of the Ceremony(for eg: 23 hours 27 mins i.e complete clock)");
              System.out.println("Hours:");
              HOURS=hours.nextInt();
              System.out.println("Minutes:");
              MIN=min.nextInt();
            }
        }
        else if(RELIGION.equals("muslim")||RELIGION.equals("Muslim"))
        {
             System.out.println("Functions in muslim religion are:");
              System.out.println("1.\tMngni\n2.\tManjha\n3.\tMehendi\n4.\tBaraat\n5.\tNikah\n");
             System.out.println("Please enter how many functions you want!");
            Scanner functioncount = new Scanner(System.in);
            FUNCTIONCOUNT= functioncount.nextInt();

            System.out.println("Please enter names of functions you want.");
            Scanner  namesoffunctions = new Scanner(System.in);

            String[] NAMESOFFUNCTIONS= new String[FUNCTIONCOUNT];
            
            Scanner date=new Scanner(System.in);
            Scanner month=new Scanner(System.in);
            Scanner year=new Scanner(System.in);
            Scanner hours=new Scanner(System.in);
            Scanner min=new Scanner(System.in);

            for(int i=0;i<FUNCTIONCOUNT;i++)
            {
              System.out.println("enter name of "+(i+1)+" function");

              NAMESOFFUNCTIONS[i] = namesoffunctions.nextLine();
              System.out.println("enter date of " + NAMESOFFUNCTIONS[i]);
              System.out.println("Date:");
              DATE=date.nextInt();
              System.out.println("Month:");
              MONTH=month.nextInt();
              System.out.println("Year:");
              YEAR=year.nextInt();
              
               System.out.println("Enter time of the Ceremony(for eg: 23 hours 27 mins i.e complete clock)");
              System.out.println("Hours:");
              HOURS=hours.nextInt();
              System.out.println("Minutes:");
              MIN=min.nextInt();
            }
        }
        else if(RELIGION.equals("parsi")||RELIGION.equals("Parsi"))
        {
        System.out.println("Functions in parsi religion are:");
        System.out.println("1.\tMadhavsaro\n2.\tRupia Peravanu\n3.Wedding\n\n");
          System.out.println("Please enter how many functions you want!");
          Scanner functioncount = new Scanner(System.in);
          FUNCTIONCOUNT= functioncount.nextInt();

          System.out.println("Please enter names of functions you want.");
          Scanner  namesoffunctions = new Scanner(System.in);

          String[] NAMESOFFUNCTIONS= new String[FUNCTIONCOUNT];
          
          Scanner date=new Scanner(System.in);
          Scanner month=new Scanner(System.in);
          Scanner year=new Scanner(System.in);
          Scanner hours=new Scanner(System.in);
          Scanner min=new Scanner(System.in);

          for(int i=0;i<FUNCTIONCOUNT;i++)
          {
            System.out.println("enter name of "+(i+1)+" function");

            NAMESOFFUNCTIONS[i] = namesoffunctions.nextLine();
            System.out.println("enter date of " + NAMESOFFUNCTIONS[i]);
            System.out.println("Date:");
            DATE=date.nextInt();
            System.out.println("Month:");
            MONTH=month.nextInt();
            System.out.println("Year:");
            YEAR=year.nextInt();
            
            
            System.out.println("Enter time of the Ceremony(for eg: 23 hours 27 mins i.e complete clock)");
            System.out.println("Hours:");
            HOURS=hours.nextInt();
            System.out.println("Minutes:");
            MIN=min.nextInt();
          }
        }
        else if(RELIGION.equals("christian")||RELIGION.equals("Christian"))
        {
             System.out.println("Functions in christian religion are:");
              System.out.println("1.\tRoce Ceremony\n2.\tBachelor Party\n3.\tBridal Shower\n4.\tWedding\n\n");
          System.out.println("Please enter how many functions you want!");
          Scanner functioncount = new Scanner(System.in);
          FUNCTIONCOUNT= functioncount.nextInt();

          System.out.println("Please enter names of functions you want.");
          Scanner  namesoffunctions = new Scanner(System.in);

          String[] NAMESOFFUNCTIONS= new String[FUNCTIONCOUNT];
          
          Scanner date=new Scanner(System.in);
          Scanner month=new Scanner(System.in);
          Scanner year=new Scanner(System.in);
          Scanner hours=new Scanner(System.in);
          Scanner min=new Scanner(System.in);

          for(int i=0;i<FUNCTIONCOUNT;i++)
          {
            System.out.println("enter name of "+(i+1)+" function");

            NAMESOFFUNCTIONS[i] = namesoffunctions.nextLine();
            System.out.println("enter date of " + NAMESOFFUNCTIONS[i]);
            System.out.println("Date:");
            DATE=date.nextInt();
            System.out.println("Month:");
            MONTH=month.nextInt();
            System.out.println("Year:");
            YEAR=year.nextInt();
            
            System.out.println("Enter time of the Ceremony(for eg: 23 hours 27 mins i.e complete clock)");
            System.out.println("Hours:");
            HOURS=hours.nextInt();
            System.out.println("Minutes:");
            MIN=min.nextInt();
          }
        }
        else if(RELIGION.equals("Sikh")||RELIGION.equals("Sikh"))
        {
             System.out.println("Functions in sikh religion are:");
              System.out.println("1.\tRokka\n2.\tKurmai\n3.\tDholki\n4.\tMehndi\n5.\tWedding\n");
          System.out.println("Please enter how many functions you want!");
          Scanner functioncount = new Scanner(System.in);
          FUNCTIONCOUNT= functioncount.nextInt();

          System.out.println("Please enter names of functions you want.");
          Scanner  namesoffunctions = new Scanner(System.in);

          String[] NAMESOFFUNCTIONS= new String[FUNCTIONCOUNT];
          
          Scanner date=new Scanner(System.in);
          Scanner month=new Scanner(System.in);
          Scanner year=new Scanner(System.in);
          Scanner hours=new Scanner(System.in);
          Scanner min=new Scanner(System.in);

          for(int i=0;i<FUNCTIONCOUNT;i++)
          {
            System.out.println("enter name of "+(i+1)+" function");

            NAMESOFFUNCTIONS[i] = namesoffunctions.nextLine();
            System.out.println("enter date of " + NAMESOFFUNCTIONS[i]);
            
            System.out.println("Date:");
            DATE=date.nextInt();
            System.out.println("Month:");
            MONTH=month.nextInt();
            System.out.println("Year:");
            YEAR=year.nextInt();
            
            System.out.println("Enter time of the Ceremony(for eg: 23 hours 27 mins i.e complete clock)");
            System.out.println("Hours:");
            HOURS=hours.nextInt();
            System.out.println("Minutes:");
            MIN=min.nextInt();
          }
        }
        else
        {
            System.out.println("Sorry!! we don't know much about this religion");
        }
        
    }
}
