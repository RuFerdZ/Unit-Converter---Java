import java.util.Scanner;

public class Convertions {
    public static void main(String[] args) {
        System.out.println("================================== ");
        System.out.println("           UNIT CONVERTER");
        System.out.println("================================== ");
        System.out.println("                Menu");
        System.out.println("-----------------------------------");
        System.out.println("1-Length Conversions");
        System.out.println("2-Weight Conversions");
        System.out.println("3-Volume Conversions");
        System.out.println("-----------------------------------");
        System.out.print("Enter Choice : ");
        int num = validateInputs();
        while((num<=0)||(num>3)) {
            System.out.print("Invalid Choice!!! please re-enter : ");
            num = validateInputs();
        }
        switch (num){
            case 1:
                System.out.println("===================================");
                System.out.println("1-Kilometer/Miles  Conversions");
                System.out.println("2-Centimeter/Inches Conversions");
                System.out.println("3-Metre/Feet Conversions");
                System.out.println("-----------------------------------");
                System.out.print("Enter Choice : ");
                int choice = validateInputs();
                boolean range=false;

                while (!range) {
                    switch (choice) {
                        case 1:
                            kilometerMiles();
                            range=true;
                            break;
                        case 2:
                            centimetersInches();
                            range=true;
                            break;
                        case 3:
                            metreFeet();
                            range=true;
                            break;
                        default:
                            System.out.print("Invalid choice!!! please re-enter");
                            choice = validateInputs();
                    }
                }
                break;
            case 2:
                System.out.println("===================================");
                System.out.println("1-Kilograms/Pounds  Conversions");
                System.out.println("2-Gram/Ounces Conversions");
                System.out.println("-----------------------------------");
                System.out.print("Enter Choice : ");
                choice = validateInputs();
                range=false;

                while (!range) {
                    switch (choice) {
                        case 1:
                            kilogramsPounds();
                            range=true;
                            break;
                        case 2:
                            gramOunces();
                            range=true;
                            break;
                        default:
                            System.out.print("Invalid choice!!! please re-enter");
                            choice = validateInputs();
                    }
                }
                break;
            case 3:
                System.out.println("===================================");
                System.out.println("1-Litre/Quarts  Conversions");
                System.out.println("2-Millilitres/Fluid Ounces Conversions");
                System.out.println("-----------------------------------");
                System.out.print("Enter Choice : ");
                choice = validateInputs();
                range=false;

                while (!range) {
                    switch (choice) {
                        case 1:
                            litreQuarts();
                            range=true;
                            break;
                        case 2:
                            milliltreFluidounces();
                            range=true;
                            break;
                        default:
                            System.out.print("Invalid choice!!! please re-enter");
                            choice = validateInputs();
                    }
                }
                break;
        }

    }
    private static void centimetersInches(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user

        System.out.println("================================== ");
        System.out.println("Enter 1 to convert from Centimetre to inch ");
        System.out.println("Enter 2 to convert from inch to Centimetre ");
        System.out.println("---------------------------------- ");

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
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Centimeters : ");
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
                    convertedValue = valueToConvert * 0.393;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in Inches : " + convertedValue + " inches");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Inches : ");
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
                    convertedValue = valueToConvert * 2.54;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in Centimeters : " + convertedValue + " cm");
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
        System.out.println("===================================");
    }
    private static void kilometerMiles(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("================================== ");
        System.out.println("Enter 1 to convert from Kilometres to miles ");
        System.out.println("Enter 2 to convert from miles to Kilometres ");
        System.out.println("---------------------------------- ");

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
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Kilometres : ");
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
                    convertedValue = valueToConvert * 0.621;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in miles: " + convertedValue + " miles");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in miles : ");
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
                    convertedValue = valueToConvert * 1.609;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in Kilometers : " + convertedValue + " km");
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
        System.out.println("===================================");
    }
    private static void metreFeet(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("================================== ");
        System.out.println("Enter 1 to convert from Metre to Feet ");
        System.out.println("Enter 2 to convert from Feet to Metre ");
        System.out.println("---------------------------------- ");

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
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Metres : ");
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
                    convertedValue = valueToConvert * 3.281;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in feet : " + convertedValue + " ft");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in feet : ");
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
                    convertedValue = valueToConvert * 0.305;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Length in meters : " + convertedValue + " m");
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
        System.out.println("===================================");
    }
    private static void gramOunces(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("==============================================");
        System.out.println("Enter 1 to convert from Grams to Ounces ");
        System.out.println("Enter 2 to convert from Ounces to Grams ");
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
                    System.out.print("Enter Weight in Grams : ");
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
                    convertedValue = valueToConvert * 0.035;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Weight in Ounces : " + convertedValue + " oz");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("----------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Weight in Ounces : ");
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
                    convertedValue = valueToConvert * 28.35;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Weight in Grams : " + convertedValue + " g");
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
    private static void kilogramsPounds(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("==============================================");
        System.out.println("Enter 1 to convert from Kilograms to Pounds ");
        System.out.println("Enter 2 to convert from Pounds to Kilograms ");
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
                    System.out.print("Enter Weight in Kilograms : ");
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
                    convertedValue = valueToConvert * 2.204;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Weight in Pounds : " + convertedValue + " pounds");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("----------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Weight in Pounds : ");
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
                    convertedValue = valueToConvert * 0.454;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);
                    //Display the converted value to the user
                    System.out.println("Weight in Kilograms : " + convertedValue + " Kg");
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
    private static void litreQuarts(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("======================================== ");
        System.out.println("Enter 1 to convert from Litre to Quarts ");
        System.out.println("Enter 2 to convert from Quarts to Litre ");
        System.out.println("-----------------------------------------");

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
                    System.out.println("-----------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Volume in Litres : ");
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
                    convertedValue = valueToConvert * 0.878;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Volume in Quarts : " + convertedValue + " qt");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("-----------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Volume in Quarts : ");
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
                    convertedValue = valueToConvert * 1.137;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Volume in Litres : " + convertedValue + " L");
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
        System.out.println("======================================== ");
    }
    private static void milliltreFluidounces(){
        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("====================================================");
        System.out.println("Enter 1 to convert from Millilitre to Fluid ounces ");
        System.out.println("Enter 2 to convert from Fluid ounces to Millilitre ");
        System.out.println("----------------------------------------------------");

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
                    System.out.println("----------------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Volume in Millilitres : ");
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
                    convertedValue = valueToConvert * 0.035;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Volume in Fluid ounces : " + convertedValue + " oz");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("----------------------------------------------------");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter Volume in Fluid ounces : ");
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
                    convertedValue = valueToConvert * 28.413;

                    //Get the converted value to 3 decimal places
                    convertedValue=roundOff(convertedValue);

                    //Display the converted value to the user
                    System.out.println("Volume in Millilitres: " + convertedValue + " ml");
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
        System.out.println("====================================================");
    }
    private static int validateInputs(){
        Scanner sc= new Scanner(System.in); //initialising scanner object
        int validatedValue=0;

        boolean valid=false;
        while (!valid){
            try{
                String value=sc.next();
                validatedValue=Integer.parseInt(value);
                valid=true;
            }catch (NumberFormatException ex){     // if user input is invalid it goes to catch block
                System.out.print("Invalid choice...Please re-enter :  ");
            }
        }
        return validatedValue; //the validated user input value is returned to the main program
    }
    private static double roundOff(double num){
        double convertedValue;
        convertedValue=Math.round(num*1000);
        convertedValue=convertedValue/1000;
        return convertedValue;
    }
}
