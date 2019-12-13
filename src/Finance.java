import java.util.Scanner;
public class Finance {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("       Interest Calculator");
        System.out.println("==================================");
        System.out.print("Enter Amount ($) : ");
        double amount=validateInputs();
        System.out.print("Enter Annual Interest Rate (%) : ");
        double rate=validateInputs();
        System.out.print("Enter Time period (Years) : ");
        double time=validateInputs();
        System.out.println("----------------------------------");
        double interest=amount*(rate/100)*time;
        interest=roundOff(interest);
        System.out.println("Interest: $ " + interest );
        System.out.println("==================================");
    }
    private static double validateInputs(){
        Scanner sc= new Scanner(System.in); //initialising scanner object
        double validatedValue=0;

        boolean valid=false;
        while (!valid){
            try{
                String value=sc.next();
                validatedValue=Double.parseDouble(value);
                valid=true;
            }catch (NumberFormatException ex){     // if user input is invalid it goes to catch block
                System.out.print("Invalid choice...Please re-enter :  ");
            }
        }
        return validatedValue; //the validated user input value is returned to the main program
    }
    private static double roundOff(double num){
        double convertedValue;
        convertedValue=Math.round(num*100);
        convertedValue=convertedValue/100;
        return convertedValue;
    }
}
