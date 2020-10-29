import java.util.Scanner;

public class Budget
{
    public void methodbudget()
    {
        System.out.println("Enter your budget range and it should not be less than 5");
       wed w = new wed();
        w.amounts();
    }
}
    class wed
    {
    void amounts()
    {
    int CHOICE5 =0;
    int CHOICE6=0;
       if(CHOICE6 == 0);
        {
        
        Scanner scanner = new Scanner(System.in);
         CHOICE5 = scanner.nextInt();
         
       if(CHOICE5==0 || CHOICE5<=4) 
       {
        System.out.println("Invalid budget range") ;
        
        }
       else if(CHOICE5 > 5 && CHOICE5 <=10)
       {
           bud bd = new bud();
           bd.range();
       }
       else if(CHOICE5 >10 && CHOICE5 <=15)
       {
           bud b1 = new bud();
           b1.range2();
       }
       else if(CHOICE5 > 15 && CHOICE5 <=20)
       {
        bud b2 = new bud();
           b2.range3();
       }

       else
       {
        bud b3 = new bud();
           b3.range4();
        }
      }
     }
    }
     

    class bud
    {
        void range()
        {

            System.out.println("Caterers under this budget range are:\n1)\tJoshi Caterers(350/Person)\n2)\tBrar Caterers(500/Person)\n3)\tCreative ChefCaterers(450/Person)\n4)\tHotel Mountview(600/Person)");
             System.out.println("\nselect the caterers you want:");
            Scanner s = new Scanner(System.in);
            String cater = s.next();

            System.out.println("\nVenues under this budget range are:\n1)\tVirasat Villa\n2)\tOrchid Farms\n3)\tHotel Amar\n4)\tJaggi Resorts");

            System.out.println("\nSPECIAL DECORATION OF:\nWhite Flowers and Curtain String Light");
             System.out.println("\nselect the venue you want:");
            Scanner c = new Scanner(System.in);
            String ven = c.next();

            System.out.println("\nInvitation card maker under this budget range are:\n1)\tThe Pink Umbrella\n2)\tShri Ganesh Graphics\n3)\tTaj Printers\n4)\tSajawat");
           System.out.println("\nselect the invitation card maker you want:");
            Scanner i = new Scanner(System.in);
            String inv = i.next();
           
            System.out.println("---------------------------------------------------");
           
           
            
        }

        void range2()
        {
            System.out.println("Caterers under this budget range are:\n1)\tAone Caterers(800/Person)\n2)\tBatra Caterers(900/Person)\n3)\tAura Events and Caterers(850/Person)\n4)\tVivaah Orchid Catering(800/Person)");
             System.out.println("\nselect the caterers you want:");
            Scanner s = new Scanner(System.in);
            String cater = s.next();

            System.out.println("\nVenues under this budget range are:\n1)\tHotel ALG International\n2)\tThe Gaur\n3)\tDream Palm Resort\n4)\tAura Garden");

            System.out.println("\nSPECIAL DECORATION OF:\nRed Flowers, Table Pearle and Flower Market Bucket");
            System.out.println("\nselect the venue you want:");
            Scanner c = new Scanner(System.in);
            String ven = c.next();


            System.out.println("\nInvitation card maker under this budget range are:\n1)\tNimantran Wedding Card\n2)\tNaina Graphics\n3)\tVerma Siyaahi\n4)\tEssence Invitations");
            System.out.println("\nselect the invitation card maker you want:");
            Scanner i = new Scanner(System.in);
            String inv = i.next();
             System.out.println("---------------------------------------------------");
        }
           

            
           

        void range3()
        {
            System.out.println("Caterers under this budget range are:\n1)\tCuisine Express(1000/Person)\n2)\tChefs and Cuisine Catering(1300/Person)\n3)\tArista Catering(1000/Person)\n4)\tCater to Cater(1500/Person)");
            System.out.println("\nselect the caterers you want:");
            Scanner s = new Scanner(System.in);
            String cater = s.next();


            System.out.println("\nVenues under this budget range are:\n1)\tArista Palace\n2)\tLaguna Banquet\n3)\tThe Grand Resort\n4)\tCrystal Resort");

            System.out.println("\nSPECIAL DECORATION OF:\nMirror Centerpieces, Silk Rose Petals and Bar Signage");
            System.out.println("\nselect the venue you want:");
            Scanner c = new Scanner(System.in);
            String ven = c.next();


            System.out.println("\nInvitation card maker under this budget range are:\n1)\tTagore Graphics\n2)\tSanjog\n3)\tBlue Bird Art Press\n4)\tArjana Printers");
            System.out.println("\nselect the invitation card maker you want:");
            Scanner i = new Scanner(System.in);
            String inv = i.next();
            System.out.println("---------------------------------------------------");
            
           
           
        }

         void range4()
         {
            System.out.println("Caterers under this budget range are:\n1)\tChef and Butler(2000/Person)\n2)\tVintage Caterers(2200/Person)\n3)\tGID Caterers(2500/Person)\n4)\tKing Chef Caterers(2000/Person)");
            System.out.println("\nselect the caterers you want:");
            Scanner s = new Scanner(System.in);
            String cater = s.next();
            System.out.println("\nVenues under this budget range are:\n1)\tApple Resort\n2)\tChitvan Resort\n3)\tThe Grand Romania\n4)\tThe Cove");

            System.out.println("\nSPECIAL DECORATION OF:\nCeremony Poster and Flameless Tea Lights");
             System.out.println("\nselect the venue you want:");
            Scanner c = new Scanner(System.in);
            String ven = c.next();


            System.out.println("\nInvitation card maker under this budget range are:\n1)\tAnant Invitation\n2)\tVandhan Cards\n3)\tWish N Wed Invites\n4)\tH N Graphics");
            System.out.println("\nselect the invitation card maker you want:");
            Scanner i = new Scanner(System.in);
            String inv = i.next();
            System.out.println("---------------------------------------------------");
            
           
           
        }
    }
