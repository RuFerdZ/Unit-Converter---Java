import java.util.Scanner;
public class Nutrition {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("         BMI Finder");
        System.out.println("============================");
        System.out.print("Enter Weight (kg) : ");
        double weight=validateInputs();
        System.out.print("Enter Height (m) : ");
        double height=validateInputs();
        System.out.println("----------------------------");
        double bmi=weight/(height*height);
        bmi=roundOff(bmi);
        System.out.println("BMI : " + bmi);
        System.out.println("============================");
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

