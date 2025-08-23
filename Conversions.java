import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Felix keppeler
 * @version 8/20/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Kilometers to Miles");
        System.out.println("8. Miles to Kilometers");//lines 20-23 finish adding convertions
        System.out.println("9. Liters to Gallons ");
        System.out.println("10. Gallons to Liters");
        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = 5/9 *(fahrenheit-32);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celcius");

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet / 3.86; //conversion of units
            System.out.println( feet + " Feet is " +String.format("%.2f", meters) + " Meters ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 4)   
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double  feet = meters * 3.86; //conversion of units
            System.out.println(meters + " Meters is " +String.format("%.2f", feet) + " Feet");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }

         if (selection == 5)   
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double  Milliliters = ounces * 29.57355;
              System.out.println(ounces + " Ounces is "+ String.format("%.2f", Milliliters ) + " Milliliters ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }

       if (selection == 6)   
        {
            System.out.println("Enter Milliliters: ");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double  ounces = Milliliters / 29.57355;
              System.out.println(Milliliters + " Milliliters is "+ String.format("%.2f", ounces ) + " Ounces ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 7)   
        {
            System.out.println("Enter Distance (Km): ");
            double Kilometers = keyboard.nextDouble();
            keyboard.nextLine();
            double  Miles = Kilometers * 1.609;
              System.out.println( Kilometers + " Kilometers is "+ String.format("%.2f", Miles ) + " Miles ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 8)   
        {
            System.out.println("Enter Distance (Mi): ");
            double Miles = keyboard.nextDouble();
            keyboard.nextLine();
            double  Kilometers = Miles * 1.609;
              System.out.println(Miles + " Miles is "+ String.format("%.2f", Kilometers ) + " Kilometers ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 9)   
        {
            System.out.println("Enter Liters: ");
            double Liters = keyboard.nextDouble();
            keyboard.nextLine();
            double  Gallons = Liters / 3.785;
              System.out.println(Liters + " Liters is "+ String.format("%.2f", Gallons ) + " Gallons(US) ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 10)   
        {
            System.out.println("Enter Gallons: ");
            double Gallons = keyboard.nextDouble();
            keyboard.nextLine();
            double  Liters = Gallons * 3.785;
              System.out.println(Gallons + " Gallons is "+ String.format("%.2f", Liters ) + " Liters ");//unit name + other unit in quotes and converse

            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
    }
}