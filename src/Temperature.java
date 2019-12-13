import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("==============================================");
        System.out.println("             Temperature Converter");
        System.out.println("==============================================");
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit ");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius ");
        System.out.println("----------------------------------------------");

        System.out.print("Enter choice : "); //asks the user for his/her conversion choice
        boolean wrong = true; //this controls the while loop below
        String choice = input.nextLine(); //this stores the user's conversion choice

        while (wrong) {   //checks whether the user input choice is valid ( 1 or 2 )

            String valueToConvert_String; //variable to store user input as string( i.e. the value to be converted)
            double convertedValue; //variable to store resulting output ( i.e. the converted value)
            double valueToConvert=0; //variable which stores the validated user input value
            boolean checkNumber=false;//controls the validation while loop

            switch (choice) {
                //if choice is 1
                case "1":
                    System.out.println("----------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Temperature in Celsius : ");
                    while(!checkNumber) {
                        try {
                            valueToConvert_String = input.next();
                            valueToConvert=Double.parseDouble(valueToConvert_String);
                            checkNumber=true;
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("You have entered an invalid Value!!!....Please re-enter : ");
                        }
                    }

                    //Do the conversion
                    convertedValue = (valueToConvert * (9.0/5.0))+32;

                    //Get the converted value to 3 decimal places
                    convertedValue=Math.round(convertedValue*1000);
                    convertedValue=convertedValue/1000;

                    //Display the converted value to the user
                    System.out.println("Temperature in Fahrenheit : " + convertedValue + " F");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("----------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Temperature in Fahrenheit : ");
                    while(!checkNumber) {
                        try {
                            valueToConvert_String = input.next();
                            valueToConvert=Double.parseDouble(valueToConvert_String);
                            checkNumber=true;
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("You have entered an invalid Value!!!....Please re-enter : ");
                        }
                    }

                    //Do the conversion
                    convertedValue = (valueToConvert -32)*(5.0/9.0);

                    //Get the converted value to 3 decimal places
                    convertedValue=Math.round(convertedValue*1000);
                    convertedValue=convertedValue/1000;

                    //Display the converted value to the user
                    System.out.println("Temperature in Celsius : " + convertedValue + " C");
                    wrong = false;
                    break;

                //if choice is invalid
                default:
                    //asks the user to input the choice again in-case the choice is invalid
                    System.out.print("Invalid choice....Please re-enter : ");
                    choice = input.nextLine();
                    wrong = true;
            }
        }
        System.out.println("==============================================");
    }
}
