// import java.util.*;
// class Atm {
//     Scanner k = new Scanner(System.in);
//     String id;
//     String pass;
//     String x;
//     String y;
//     double bal=0.0;
//     ArrayList <String> Wit=new ArrayList<String>();
    
   

//     public void create()
//     {
//         System.out.println("Enter the user id to create");
//         this.id=k.next();
//         System.out.println("Enter the user pin to create");
//        this.pass=k.next();
//         System.out.println(" data created");
//         return;

//     }
// }
// class Th extends Atm
// {
//     public void Transh()
//     {
//         int n=1;
//         if(Wit.isEmpty())
//         {
//             System.out.println(" No transaction history yet");
//         }
//         else{
//             System.out.println("Your transaction history is below");
//             for(String j:Wit)
//            {
//             System.out.println("["+n+"]"+" "+j);
//             n=n+1;
//            }


//         }

        
//     }

// }
// class With extends Th
// {

//     void Withdraw()
//     {
//         System.out.println("Enter the amount to withdraw");
//         double i=k.nextDouble();
//         if(i>bal || bal==0.0){
//             System.out.println("insufficient balance");
//             System.out.println("Your current balance is="+bal);


//         }

//         else{
        
//             bal=bal-i;
//             System.out.println("Withdraw sucessfull");
//             System.out.println("Your current balance is="+bal);
//             Wit.add(i+"dr");

//         }

          
//     }

// }
// class Dep extends With
// {

//     void Deposit()
//     {
//         System.out.println("Enter the amount to deposit");
//         double l=k.nextDouble();
//         bal=bal+l;
//         Wit.add(l+"cr");
//         System.out.println("Your current balance is="+bal);

//     }

// }
// class Tr extends Dep
// {

//     void Transfer()
//     {
//         System.out.println("enter the account number to transfer money");
//         long t=k.nextLong();
//         System.out.println("Enter the amount to send");
//         double p=k.nextDouble();
//         bal=bal-p;
//         System.out.println("amount transfered to account no:"+t);
//         System.out.println("Your current balance is="+bal);
//         Wit.add(p+"dr");





//     }



//     public void login()
//     {
//         System.out.println("Enter the user id");
//         this.x=k.next();
//         System.out.println("Enter the user pin");
//         this.y=k.next();
//         if(x.equals(id)&& y.equals(pass)){
//             while(true){
//                 System.out.println("MENU");
//                 System.out.println("1] Transaction Histroy");
//                 System.out.println("2] Withdraw");
//                 System.out.println("3] Deposit");
//                 System.out.println("4] Transfer");
//                 System.out.println("5] Quit");

//                 int b=k.nextInt();
//                 switch(b){
//                     case 1:Transh();
//                            break;
//                     case 2:Withdraw();
//                            break;
//                     case 3:Deposit();
//                            break;
//                     case 4:Transfer();
//                            break;
//                     case 5:System.out.println("Thankyou for using the ATM please visit again");
//                            return;
//                 }

//             }
//         }
//         else
//         {
//             System.out.println("Entered wrong credentials please keep try again");
//             System.out.println("if u don't have any account you create now from the below");
//             return;

//         }



//     }

// }
// public class AtmClass{
//     public static void main(String[] args)
//      {
//         Scanner k = new Scanner(System.in);
//         System.out.println("Welcome to Atm ");
//         Tr obj=new Tr();
//         while(true)
//         {
//             System.out.println("1.LOGIN");
//             System.out.println("2.CREATE ");
//             System.out.println("3. Exit ");
//             int a=k.nextInt();
//             switch(a){
//                 case 1:obj.login();
//                        break;
//                 case 2:obj.create();
//                        break;
//                 case 3:System.exit(0);
//                        break;
//                 default:System.out.println("wrong choice");
                
//             }
           
           
           
//        }
    

// }

// }








































import java.util.*;

public class AtmClass {
	
   Scanner sc= new Scanner(System.in);
   String user;
   String pwd;
   String a;
   String b;
   double balance=0.0;
   ArrayList <String> TransactionHistory= new ArrayList<String>();

   public void createAccount() {
	   System.out.println("Enter new user ID:");
	   user=sc.nextLine();
	   System.out.println("Enter new password");
	   pwd=sc.nextLine();
	   System.out.println("Account created!");
   }
   
   public void login() {
	   System.out.println("Enter user ID:");
	   a=sc.nextLine();
	   System.out.println("Enter password");
	   b=sc.nextLine();
	   if(a.equals(user) && b.equals(pwd)) {
		   while(true) {
			   System.out.println("  M E N U  ");
			   System.out.println("1. Transaction History");
			   System.out.println("2. Withdraw");
			   System.out.println("3. Deposit");
			   System.out.println("4. Transfer");
			   System.out.println("5. Quit");
			   
			   int k= sc.nextInt();
			   switch(k) {
			   case 1: 
				     TransHistory t= new TransHistory();
				     t.printTransactionHistory();
				     break;
			   case 2:
				    Withdraw w= new Withdraw();
				    w.withdraw();
				    break;
			   case 3:
				    Deposit d= new Deposit();
				    d.deposit();
				    break;
			   case 4:
				    Transfer tr= new Transfer();
				    tr.transfer();
				    break;
			   case 5:
				   System.out.println("Thank you!");
				   return;
			   default:
				   System.out.println("Incorrect choice!");
		   }
		   }
	   }
       else{
        System.out.println("Incorrect login credentials!");
        return;
       }
   }
   public static void main(String args[]) {
	   
	   AtmClass obj= new AtmClass();
       Scanner scan= new Scanner(System.in);

	  while(true) {
          
		  System.out.println();
		  System.out.println("1. Create Account");
		  System.out.println("2. Login if existing user");
		  System.out.println("3. Exit");
		  
		  int option=scan.nextInt();
		  
		  switch(option) {
		    case 1: obj.createAccount();
		    		break;
		    case 2: obj.login();
		    		break;
		    case 3: System.exit(0);
		    		break;
		    default: System.out.println("Incorrect choice!");
		  }
		 
		  
	  }
	  
	  
   }
}
class TransHistory extends AtmClass{
    
	public void printTransactionHistory() {
       
       if(TransactionHistory.isEmpty()){
        System.out.println("No Transaction History yet");

       }
       else{
        System.out.println("Transaction History");
        for(String i: TransactionHistory) {
            System.out.println(i);
        }
       }
	   
	}
	
}
class Withdraw extends AtmClass{
     
	public void withdraw() {
		System.out.println("Enter amount to withdraw: ");
		double withAmount= sc.nextDouble();
		if(balance<withAmount || balance==0.0) 
        {
			System.out.println("Insufficient balance!");
            System.out.println("Current balance: "+balance);

		}
		else {
			balance-=withAmount;
			TransactionHistory.add(withAmount+ "Debited");
		}
	}
}
class Deposit extends AtmClass{
	
	public void deposit() {
		System.out.println("Enter amount to deposit: ");
	    double depAmount= sc.nextDouble();
	    
	    balance+=depAmount;
        System.out.println("Current balance: "+balance);
	    TransactionHistory.add(depAmount+ "Credited");
	}

}
class Transfer extends AtmClass{
	
	public void transfer() {
		System.out.println("Enter account number to transfer to: ");
		String acc= sc.next();
		
		System.out.println("Enter the amount to transfer: ");
		double transferAmount= sc.nextDouble();
		
		balance-=transferAmount;
		TransactionHistory.add(transferAmount+ "Debited for transfer to account number: "+acc);
	}
}