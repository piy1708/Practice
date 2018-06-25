import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args){
        int amt = 0;
        while(true){

            System.out.println("Banking System");
            System.out.println("Choose from below:");
            System.out.println("1. Create Account\n2. Credit\n3. Debit\n4.Exit");

            Scanner sc = new Scanner(System.in);

            String ch = sc.nextLine();


            if(ch.equals("1")){
                System.out.println("Account Created");
                continue;
            }
            else if (ch.equals("2")){
                System.out.print("Enter amount: ");
                Scanner am = new Scanner(System.in);
                amt = amt+am.nextInt();
                System.out.println("Updated amount is: " + amt);
                continue;
            }
            else if (ch.equals("3")){
                System.out.print("Enter amount: ");
                Scanner am = new Scanner(System.in);
                amt = amt - am.nextInt();
                System.out.println("Updated amount is: " + amt);
                continue;
            }
            else
                break;

        }

    }
}
