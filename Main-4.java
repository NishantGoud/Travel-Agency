import java.util.*;
class Main
{
    
    public static void Passenger(int t)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        int  age[]=new int[5];
        long phno[]=new long[5];
        for(int i=0;i<t;i++)
        {System.out.println("\nPassenger-"+ i+" details:");
        System.out.println("Enter your name");
        name[i]=sc.nextLine();
        System.out.println("Enter your age");
        age[i]=sc.nextInt();
        System.out.println("Enter your phno");
        phno[i]=sc.nextLong();
        sc.nextLine();
        }
        for(int i=0;i<t;i++)
        { int j=1;
            System.out.println("\nPassenger-"+ j);
            System.out.println("Name \t \t Age \t \t Phone No");
            System.out.println(name[i]+"\t \t"+age[i]+"\t \t"+phno[i]);
            j++;
        /*System.out.println("name: "+name[i]);
        System.out.println("age; "+age[i]);
        System.out.println("phno: "+phno[i]);*/
        }
        
    }
    
    public static void Flight()
    { 
        Scanner sc=new Scanner(System.in);
        String s[]={"1: Hyd-Ban","2: Ban-Mum","3: Mum-Hyd"};
        int p[]={2000, 3000, 2500};
        //int ti[]={12001310;15151700;13451500};
        System.out.println("\n "+"sor-des"+"\t"+"price");
        for(int i=0;i<s.length;i++)
        System.out.println(s[i]+"\t"+p[i]+"\t");//+ti[i]);
        System.out.println("\nChoose your source and destination");
        int ch=sc.nextInt();
        System.out.println("enter no of tcikets");
         int t=sc.nextInt();
        Passenger(t);
         System.out.println("\nTotal price- "+p[ch]*t);
        System.out.println("Your order is confirmed");
        
        
      
    }
    
public static void main (String[] args)
{ 
    Scanner sc=new Scanner(System.in);
    String ans="";
 
    do{
    
    System.out.println("\n      Totem Travels        ");
    System.out.println("1-Flight" +"\n" + "2-Bus" +"\n"+ "3-Cabs" +"\n"+ "4-Exit");
    System.out.println("Enter your choice");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1:System.out.println("Welcome to FLight booking");
               Flight();
               break;
        case 2: System.out.println("Welocme to Bus booking");
               //Bus();
               break;
        case 3:System.out.println("Welcome to Cab booking");
               //Cab();
               break;
        case 4:System.out.println("no");
            //exit();
        
        default: System.out.println("Invalid choice");
    }
    
    System.out.println("do you want to continue?");
    ans=sc.next();
    
    }
    while(ans=="y");

    
}
}
