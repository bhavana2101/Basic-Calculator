import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation, number1, number2;
        int[] array = {1,2,3,4};
        while(true){
            try{
                System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication or 4 for division : ");
                operation = sc.nextInt();
                for(int x : array){
                    if(operation==x){
                        System.out.println("Enter numbers: ");
                        System.out.println("Enter first number : ");
                        number1 = sc.nextInt();
                        System.out.println("Enter second number : ");
                        number2 = sc.nextInt();
                        calci(number1,number2,operation);
                    }
                }
            }
            catch(InputMismatchException e){
                System.out.println("The input you entered is not valid...!");
                break;
            }
        }
    }
    public static void calci(int num1,int num2,int operation){
        if(operation==1){
            System.out.println("Performing Addition...");
            System.out.println("The result is : "+(num1+num2));
        }
        else if(operation==2){
            System.out.println("Performing Subtraction...");
            System.out.println("The result is : "+(num1-num2));
        }
        else if(operation==3){
            System.out.println("Performing Multiplication...");
            System.out.println("The result is : "+(num1*num2));
        }
        else if(operation==4){
            System.out.println("Performing Division...");
            System.out.println("The result is : "+(num1/num2));
        }
        else{
            System.out.println("Enter valid number ");
        }
    }
}
