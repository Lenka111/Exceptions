//Elena Voinu
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 12;
        int y = 0;
        System.out.println(divideBYL(x,y));
        System.out.println(divideEAFP(x, y));

       int z = getIntBYL();
       System.out.println("z is " + z);


       int a =  getIntEAFO();
        System.out.println("y is " + a);
    }

    //unhandled user input
    //the program will crash if the user enters something else than a number
    public static int getInt(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            return scanner.nextInt();

    }

    //one way to handle user's input
    public static int getIntBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter a number: ");

        String input = scanner.nextLine();

        //check if input is digits
     
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid){
            //converts the string value to int
            return  Integer.parseInt(input);
        }
        return 0;

    }

    private static int getIntEAFO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            return scanner.nextInt();

        }
        // check if inpit is a number
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try{
            return x/y;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
    private  static int divideBYL(int x, int y){
        if(y!=0){
            return x/y;
        }
        else return 0;
    }
}
