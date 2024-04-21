package Java.Java-LLDprojects.Atm_Project;

import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Option;
        int pin = 1234;
        int balance = 10000;

        int Deposit = 0;
        int Wihtdraw = 0;
        String name;
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Welcome "+ name);

        System.out.print("Enter the pin number : ");
        int password = sc.nextInt();

        if(password == pin)
        {
            while (true)
            {
                System.out.println("----------------------------------------------------");
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to Deposit");
                System.out.println("Press 3 to Withdraw");
                System.out.println("Press 4 to take respit");
                System.out.println("Press 5 to exit");
                System.out.println("----------------------------------------------------");

                System.out.println("Enter your option");
                Option = sc.nextInt();

                switch (Option)
                {
                    case 1:
                        System.out.println("Your Current account balance is : "+balance);
                        break;
                    case 2:
                        System.out.print("Enter the amount to be deposit : ");
                        Deposit = sc.nextInt();
                        System.out.println("Sucessfully Credited");
                        balance += Deposit;
                        break;
                    case 3:
                        System.out.print("Enter the amount to be Wihtdraw : ");
                        Wihtdraw = sc.nextInt();
                        if(Wihtdraw > balance)
                        {
                            System.out.println("Your balance is insufficient");
                            break;
                        }
                        else
                        {
                            System.out.println("Succesfully Wihtdrawed");
                            balance -= Wihtdraw;
                            break;
                        }
                    case 4:
                        System.out.println("Welcome BANK OF INDIA");
                        System.out.print("Available balance : "+ balance);
                        System.out.println();
                        System.out.print("Amount credited : "+ Deposit);
                        System.out.println();
                        System.out.print("Amount Wihtdrawed "+ Wihtdraw);
                        System.out.println();
                        System.out.println("Thank You for visiting our bank");
                    case 5:
                        System.out.println("Thank you");
                        break;
                }
                if(Option == 5)
                {
                    break;
                }
            }
        }

        else
        {
            System.out.println("Pin is INVALID");
        }
    }
}
