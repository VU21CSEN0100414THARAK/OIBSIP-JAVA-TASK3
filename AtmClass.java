import java.util.*;
class Atm {
    Scanner k = new Scanner(System.in);
    String id;
    String pass;
    String x;
    String y;
    double bal=0.0;
    ArrayList <String> Wit=new ArrayList<String>();
    
   

    public void create()
    {
        System.out.println("Enter the user id to create");
        this.id=k.next();
        System.out.println("Enter the user pin to create");
       this.pass=k.next();
        System.out.println(" data created");
        return;

    }
}
class Th extends Atm
{
    public void Transh()
    {
        int n=1;
        if(Wit.isEmpty())
        {
            System.out.println(" No transaction history yet");
        }
        else{
            System.out.println("Your transaction history is below");
            for(String j:Wit)
           {
            System.out.println("["+n+"]"+" "+j);
            n=n+1;
           }


        }

        
    }

}
class With extends Th
{

    void Withdraw()
    {
        System.out.println("Enter the amount to withdraw");
        double i=k.nextDouble();
        if(i>bal || bal==0.0){
            System.out.println("insufficient balance");
            System.out.println("Your current balance is="+bal);


        }

        else{
        
            bal=bal-i;
            System.out.println("Withdraw sucessfull");
            System.out.println("Your current balance is="+bal);
            Wit.add(i+"dr");

        }

          
    }

}
class Dep extends With
{

    void Deposit()
    {
        System.out.println("Enter the amount to deposit");
        double l=k.nextDouble();
        bal=bal+l;
        Wit.add(l+"cr");
        System.out.println("Your current balance is="+bal);

    }

}
class Tr extends Dep
{

    void Transfer()
    {
        System.out.println("enter the account number to transfer money");
        long t=k.nextLong();
        System.out.println("Enter the amount to send");
        double p=k.nextDouble();
        bal=bal-p;
        System.out.println("amount transfered to account no:"+t);
        System.out.println("Your current balance is="+bal);
        Wit.add(p+"dr");





    }



    public void login()
    {
        System.out.println("Enter the user id");
        this.x=k.next();
        System.out.println("Enter the user pin");
        this.y=k.next();
        if(x.equals(id)&& y.equals(pass)){
            while(true){
                System.out.println("MENU");
                System.out.println("1] Transaction Histroy");
                System.out.println("2] Withdraw");
                System.out.println("3] Deposit");
                System.out.println("4] Transfer");
                System.out.println("5] Quit");

                int b=k.nextInt();
                switch(b){
                    case 1:Transh();
                           break;
                    case 2:Withdraw();
                           break;
                    case 3:Deposit();
                           break;
                    case 4:Transfer();
                           break;
                    case 5:System.out.println("Thankyou for using the ATM please visit again");
                           return;
                }

            }
        }
        else
        {
            System.out.println("Entered wrong credentials please keep try again");
            System.out.println("if u don't have any account you create now from the below");
            return;

        }



    }

}
public class AtmClass{
    public static void main(String[] args)
     {
        Scanner k = new Scanner(System.in);
        System.out.println("Welcome to Atm ");
        Tr obj=new Tr();
        while(true)
        {
            System.out.println("1.LOGIN");
            System.out.println("2.CREATE ");
            System.out.println("3. Exit ");
            int a=k.nextInt();
            switch(a){
                case 1:obj.login();
                       break;
                case 2:obj.create();
                       break;
                case 3:System.exit(0);
                       break;
                default:System.out.println("wrong choice");
                
            }
           
           
           
       }
    

}

}








































