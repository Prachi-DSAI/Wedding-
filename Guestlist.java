class groom 
{ 
    String name; 
    String address;
   
    groom(String name,String address) 
    
    { 
        this.name = name; 
        this.address =address;
    } 
} 
  class bride 
{ 
    String n; 
    String add;
   
    bride(String n,String add) 
    
    { 
        this.n = n; 
        this.add = add;
    } 
} 
 
public class Guestlist
{ 
    public void methodguest()
    { 
       
        groom[] arr; 
  
        arr = new groom[40]; 
  
       
        arr[0] = new groom("Kartik","Jaipur"); 
        arr[1] = new groom("Vaibhav","Jalandhar"); 
        arr[2] = new groom("Shikar","Zirakpur"); 
        arr[3] = new groom("Dharmesh","Solan"); 
        arr[4] = new groom("Mohit","Dera Bassi"); 
        arr[5] = new groom("Preeti","Shimla"); 
        arr[6] = new groom("Sania","Zirakpur"); 
        arr[7] = new groom("Sonal","Gujarat"); 
        arr[8] = new groom("Aditi","Jind"); 
        arr[9] = new groom("Siya","Patiala");
        arr[10] = new groom("Vihaan","Kanpur"); 
        arr[11] = new groom("Mohammed","Ghaziabad"); 
        arr[12] = new groom("Aarav","Meerut"); 
        arr[13] = new groom("Ishaan","Varanasi"); 
        arr[14] = new groom("Dhruv","Aligarh"); 
        arr[15] = new groom("Shaurya","Agra"); 
        arr[16] = new groom("Ananya","Sangrur"); 
        arr[17] = new groom("Sambhav","Jalandhar"); 
        arr[18] = new groom("Charu","Gurdaspur"); 
        arr[19] = new groom("Bhumika","Muktsar"); 
        arr[20] = new groom("Raghav","Moga"); 
        arr[21] = new groom("Sourav","Bathinda"); 
        arr[22] = new groom("Nandini","Abohar"); 
        arr[23] = new groom("Shifali","Mohali"); 
        arr[24] = new groom("Chetan","Malerkotla"); 
        arr[25] = new groom("Advik","Khanna"); 
        arr[26] = new groom("Aarushi","Barnala"); 
        arr[27] = new groom("Teena","Firozpur"); 
        arr[28] = new groom("Aryan","Kapurthala"); 
        arr[29] = new groom("Simran","Fazilka"); 
        arr[30] = new groom("Kartik","Pathankot"); 
        arr[31] = new groom("Abhishek","Batala"); 
        arr[32] = new groom("Suhab","Amritsar"); 
        arr[33] = new groom("Rashmeet","Rajpura"); 
        arr[34] = new groom("Taran","Sunam"); 
        arr[35] = new groom("Sonal","Ludhiana"); 
        arr[36] = new groom("Kabir","Noida"); 
        arr[37] = new groom("Atharv","Jhansi"); 
        arr[38] = new groom("Raman","Gorakhpur"); 
        arr[39] = new groom("Harpreet","Delhi"); 
        
         bride[] a; 
  
        a = new bride[40]; 
  
        
        a[0] = new bride("Aarti","Ludhiana"); 
        a[1] = new bride("Vaibhav","Delhi"); 
        a[2] = new bride("Shikhar","Zirakpur"); 
        a[3] = new bride("Deepankar","Solan"); 
        a[4] = new bride("Mohit","Dera Bassi"); 
        a[5] = new bride("Preeti","Shimla"); 
        a[6] = new bride("Pragati","Zirakpur"); 
        a[7] = new bride("Sonali","Pune"); 
        a[8] = new bride("Aditi","Jind"); 
        a[9] = new bride("Siya","Patiala"); 
        a[10] = new bride("Tejas","Nagpur"); 
        a[11] = new bride("Abeer","Lucknow"); 
        a[12] = new bride("Samarth","Jaipur"); 
        a[13] = new bride("Darsh","Surat"); 
        a[14] = new bride("Yash","Faridabad"); 
        a[15] = new bride("Samar","Bhopal"); 
        a[16] = new bride("Abdul","Rajkot"); 
        a[17] = new bride("Avneet","Pune"); 
        a[18] = new bride("Jashan","Hyderabad"); 
        a[19] = new bride("Devansh","Kolkata"); 
        a[20] = new bride("Pratyush","Kochi"); 
        a[21] = new bride("Rohan","Patna"); 
        a[22] = new bride("Varun","Indore"); 
        a[23] = new bride("Neel","Dehradun"); 
        a[24] = new bride("Gautam","Jodhpur"); 
        a[25] = new bride("Manan","Udaipur"); 
        a[26] = new bride("Kunal","Ghaziabad"); 
        a[27] = new bride("Sarthak","Kanpur"); 
        a[28] = new bride("Vivaan","Ranchi"); 
        a[29] = new bride("Ankur","Guwahati"); 
        a[30] = new bride("Tarun","Patiala"); 
        a[31] = new bride("Samendra","Chandigarh"); 
        a[32] = new bride("Javed","Bhopal"); 
        a[33] = new bride("Ansh","Saharanpur"); 
        a[34] = new bride("Aditya","Firozabad"); 
        a[35] = new bride("Arpita","Gurugram"); 
        a[36] = new bride("Anu","Bareilley"); 
        a[37] = new bride("Karan","Ayodhya"); 
        a[38] = new bride("Harsh","Amritsar"); 
        a[39] = new bride("Jain","Jaipur"); 
        
         int j=1;
       System.out.println("Groom side:");
       int i;
       for( i = 0; i < arr.length; i++) 
        {
           
            System.out.print(j+"\tName : " + arr[i].name+"\n"); 
            System.out.println("\tAddress : "+arr[i].address);
            System.out.println();
            j++;
        }
        
        System.out.println("\n\n\n");
        System.out.println("Bride side:");
        int x=1;
        for (int k = 0; k < a.length; k++) 
        {
           
            System.out.print(x+"\tName : " + a[k].n+"\n"); 
            System.out.println("\tAddress : "+a[k].add);
            System.out.println();
            x++;
        }
    } 
}
