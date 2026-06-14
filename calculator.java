import  java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " ====  SimpleCalculator===" );

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second value: ");
        double num2 = scanner.nextDouble();


        System.out.println("Choose operation");
        System.out.println("1. Addition (+)");
        System.out.println("2 .Subraction (-)");
        System.out.println("3 .Multiplication (*)");
        System.out.println("4 .Division (/)");
        System.out.print("Enter your choice (1-4):  ");

        double result;
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                result = num1+num2 ;
                System.out.println("Result: " + result);
                break;

            case 2 :
                result = num1 - num2;
                System.out.println("Result: " +result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0){
                    result = num1/num2 ;
                    System.out.println("Result: " + result);
                }else{
                    System.out.println("Cannot divide value by zero");
                }
                break;

                    
            default:
                System.out.println("Invalid choice!/ Error");        

        }        

        
    }
}