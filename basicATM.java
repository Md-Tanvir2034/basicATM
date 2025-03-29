        import java.util.*;

        class ATM{

            private int pin = 5566;
            private double balance;
            Scanner sc = new Scanner(System.in);

            public ATM(){
            
            while(true){
                System.out.print("Enter your pin number (default pin 5566): ");
            
                int enteredPin = sc.nextInt();

                if(pin == enteredPin){
                    System.out.println("Your pin is correct.");
                    menu();
                    break;
                }

                else{
                    System.out.println("You have entered wrong pin number.");
                    
                }
            }

            }

            public void menu (){
                System.out.println();
                System.out.println("press 1 to Check A/C Balance");
                System.out.println("press 2 to Withdraw Money");
                System.out.println("press 3 to Deposit Money");
                System.out.println("press 4 to Exit");
                System.out.print("Enter your pereferable choice integer number given below :");

                

                int opt = sc.nextInt();

                if(opt == 1 ){
                    checkBalance();
                }
                else if(opt == 2){
                    WithdrawMoney();
                }
                else if(opt == 3){
                    depositMoney();
                }
                else if(opt == 4){
                    System.out.println();
                System.out.println("Thank you for using our ATM.");
                return ;
                }
                else{System.out.println("You have pressed invalid number.");}
            }

            public void checkBalance(){
                System.out.println(" ");
                System.out.println("Balance: " + balance);
                System.out.println();
                menu();
            }

            public void WithdrawMoney(){
                System.out.println(" ");
                System.out.print("Enter amout to withdraw : ");
                float amount = sc.nextFloat();

                if(amount > balance){
                    System.out.println("Insufficient Balance. please try again.");
                }
                else{
                    balance = balance - amount ;
                    System.out.println("Money withdrawl successful");
                    System.out.println("Your new Balance is " + balance);
                }
                System.out.println();
                
                menu();
            }

            public void depositMoney(){
                System.out.println(" ");
                System.out.print("Enter the amount : ");
                float amount = sc.nextFloat();
            balance = balance + amount ;
            System.out.println(amount + " Deposited successfully.");
            System.out.println("Your new Balance is " + balance);

            System.out.println();
            System.out.println();
            
            menu();
            }




        }




        public class basicATM {
            public static void main(String [] args){

                ATM atm1 = new ATM();


            }
            
        }
