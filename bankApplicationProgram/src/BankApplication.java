
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name and CustomerId of your Bank Account:");
        String name = sc.nextLine();
        String customerId = sc.nextLine();
        BankAccount obj = new BankAccount(name, customerId);
        obj.menu();
    }
}

class BankAccount{
        double balance;
        double previousTransfer;
        String customerName;
        String customerId;

        BankAccount(String customerName,String customerid){
            this.customerName=customerName;
            this.customerId=customerid;
        }

        void deposit(double amount){
            if(amount!=0){
                balance +=amount;
                previousTransfer = amount;
            }
        }

        void withdraw(double amt){
            if(amt!=0 && balance>=amt){
                balance -=amt;
                previousTransfer -=amt;
            }
            else if(balance <amt){
                System.out.println("Bank balance insufficient");
            }
        }

        void getPreviousTransfer(){
            if(previousTransfer>0){
                System.out.println("Deposited: "+previousTransfer );
            }
            else if(previousTransfer<0){
                System.out.println("Withdraw: "+Math.abs(previousTransfer));
            }
            else{
                System.out.println("No transaction occured");
            }
        }



        void menu(){
            char option;
            Scanner sc=new Scanner(System.in);
            System.out.println("Welcome "+customerName);
            System.out.println("your ID:"+customerId);
            System.out.println("\n");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) previous Transfer");
            System.out.println("e) Exit");

            do{
                System.out.println("****************************************");
                System.out.println("choose an option");
                option = sc.next().charAt(0);
                System.out.println("\n");

                switch (option){
                    case 'a':
                        System.out.println("......................................");
                        System.out.println("Balance ="+balance);
                        System.out.println(".......................................");
                        System.out.println("\n");
                        break;

                    case 'b':
                        System.out.println("........................................");
                        System.out.println("enter a amount to deposit");
                        System.out.println("........................................");
                        double amt=sc.nextDouble();
                        deposit(amt);
                        System.out.println("\n");
                        break;

                    case 'c':
                        System.out.println(".........................................");
                        System.out.println("enter a amount to withdraw");
                        double amtW=sc.nextDouble();
                        withdraw(amtW);
                        System.out.println("\n");
                        break;

                    case 'd':
                        System.out.println("........................................");
                        System.out.println("previous Transaction:");
                        getPreviousTransfer();
                        System.out.println("........................................");
                        System.out.println("\n");
                        break;

                    case 'e':
                        System.out.println(".........................................");
                        break;

                    default:
                        System.out.println("choose a correct option to proceed");
                        break;
                }
            }
            while (option !='e');

            System.out.println("Thank you for using our banking services");
        }

}
