import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Calculator Calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("*****************************************************");
            System.out.println("===========================");
            System.out.println("Operations : ");
            System.out.println("1.Square Root Function");
            System.out.println("2.Factorial Function");
            System.out.println("3.Natural Logarithm");
            System.out.println("4.Power Function");
            System.out.println("5.Exit");
            System.out.println("===========================");
            System.out.print("Please enter the choice : ");
            int choice=0;
            int chk=0;
            try {
                choice = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Entry Invalid...");
                sc.nextLine();
                chk = 1;
            }
            if(chk==0) {
                if (choice == 1) {
                    try {
                        System.out.print("Please enter the number : ");
                        int val = sc.nextInt();
                        System.out.println(String.format("Square Root of %d is %f", val, Calculator.SquareRoot(val)));
                    } catch (Exception e) {
                        System.out.println("Entry Invalid...");
                    }
                } else if (choice == 2) {
                    System.out.print("Please enter the number : ");
                    try {
                        int val = sc.nextInt();
                        System.out.println(String.format("Factorial of %d is %d", val, Calculator.Factorial(val)));
                    } catch (Exception e) {
                        System.out.println("Entry Invalid...");
                    }
                } else if (choice == 3) {
                    System.out.print("Please enter the number : ");
                    try {
                        int val = sc.nextInt();
                        System.out.println("================================");
                        System.out.println(String.format("Natural Log of %d is %f", val, Calculator.NaturalLog(val)));
                    } catch (Exception e) {
                        System.out.println("Entry Invalid...");
                    }
                } else if (choice == 4) {
                    try {
                        System.out.print("Please enter the base : ");
                        int val1 = sc.nextInt();
                        System.out.print("Please enter the power : ");
                        int val2 = sc.nextInt();
                        System.out.println(String.format("%d raised to %d is %f", val1, val2, Calculator.PoW(val1, val2)));
                    } catch (Exception e) {
                        System.out.println("Entry Invalid...");
                    }
                } else if (choice == 5) {
                    System.out.println("Bye :)");
                    break;
                } else {
                    System.out.println("Please Enter a valid choice");
                }
            }
        }
    }
}
