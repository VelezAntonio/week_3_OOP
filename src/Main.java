import java.util.*;
import java.lang.*;

public class Main {
    static List<String> vType=Arrays.asList("PASSENGER","MOTORCYCLE","TRAILER","SKATEBOARD","BICYCLE");
    static List<String> validFuel=Arrays.asList("G","D","E");
    static List<String> fType=Arrays.asList("GAS","DIESEL","ELECTRIC");
    static int menuChoice;
    private static char fuelType;
    private static int axles;
    static String fuel;
    private static String pwr;
    private static int cyl;
    private static boolean error;
    private static String vClass;
    private static int curYear = Calendar.getInstance().get(Calendar.YEAR) + 1;//current year+1 for next model year.
    //set validCyl as immutable list.
    static List<Integer> validCyl = Arrays.asList(2,4,5,6,8,10,12);
    private static int wheels;


    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        int year = 0;
        System.out.println("Enter Vehicle Year: 0 - "+ curYear);
        do {
            error = false;
            try {//try catch to ensure user enters valid year
                do {
                    year = userInput.nextInt();
                    if (year >= 0 && year <= curYear) {
                        error=false;
                    }
                    else{
                        System.out.println("Please enter a valid number: ");
                        error=true;
                    }
                }while(error);//do while error is true

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid year");
                error = true;
                userInput.next();
            }
        } while (error);
        userInput.nextLine();

        System.out.println("Vehicle Make: ");
        String make = userInput.nextLine().toUpperCase();
        if (make.isEmpty()) {
            do {
                System.out.println("Please enter a Make: ");
                make = userInput.nextLine().toUpperCase();

            } while (make.isEmpty());
        }

        System.out.println("Vehicle Model: ");
        String model = userInput.nextLine().toUpperCase();
        if (model.isEmpty()) {
            do {
                System.out.println("Please enter a Model: ");
                model = userInput.nextLine().toUpperCase();
            } while (model.isEmpty());
        }

        System.out.println("Vehicle Color: ");
        String color = userInput.nextLine().toUpperCase();
        if (color.isEmpty()) {
            do {
                System.out.println("Please enter a Model: ");
                model = userInput.nextLine().toUpperCase();
            } while (color.isEmpty());
        }

        System.out.println("Is Vehicle Motorized? (enter Y for yes, anything else for no): ");
        char choice = userInput.next().toUpperCase().strip().charAt(0);
        if(choice == 'Y') {
            System.out.println("Enter type of Vehicle: ");
            System.out.println("(Passenger,Motorcycle,Trailer(P/M/T): ");
            userInput.nextLine();

            do {
                error = false;
                vClass = userInput.nextLine().toUpperCase();
                char userChoice = vClass.charAt(0);

                if (userChoice == 'P') {
                    fuel = fuelCheck();
                    vClass = "PASSENGER";
                    if (fuel!= "ELECTRIC"){
                        cyl=numCyl();
                    }
                    Vehicles passenger = new passenger(year, make, model, color, fuel, cyl, vClass);
                    System.out.println(passenger.toString());
                } else if (userChoice == 'M') {
                    fuel = fuelCheck();
                    vClass = "MOTORCYCLE";
                    if (fuel!= "ELECTRIC"){
                        cyl=numCyl();
                    }
                    Vehicles motorcycle = new motorcycle(year,make,model,color,fuel,cyl,vClass);
                    System.out.println(motorcycle.toString());
                } else if (userChoice == 'T') {
                    fuel = fuelCheck();
                    if (fuel!= "ELECTRIC"){
                        cyl=numCyl();
                    }
                    vClass = "TRAILER";
                    axles=numAxles();
                    Vehicles trailer = new trailer(year,make,model,color,fuel,cyl,axles,vClass);
                    System.out.println(trailer.toString());
                } else {
                    System.out.println("Invalid input. Please enter a valid vehicle type (P/M/T): ");
                    error=true;

                }
            }while(error);
            }
        else{
            System.out.println("What type of Non-Motorized Vehicle?");
            System.out.println("1.Cycle,2.Scooter,3.Skateboard,4.Carriage: ");
            do {
                try{
                    error=false;
                    menuChoice = userInput.nextInt();
                    if (menuChoice < 1 || menuChoice>4){
                        System.out.println("Please enter a valid number (1-4)");
                        error=true;
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Please enter a valid number (1-4)");
                    error=true;
                    userInput.next();
                }


            }while(error);

            if (menuChoice==1){
                wheels=numWheels();
                pwr=vPower();
                vClass="CYCLE";
                Vehicles cycle = new cycle(year,make,model,color,pwr,wheels,vClass);
                System.out.println(cycle.toString());

            }
            else if(menuChoice==2){
                wheels=numWheels();
                pwr=vPower();
                vClass="SCOOTER";
                Vehicles scooter = new scooter(year,make,model,color,pwr,wheels,vClass);
                System.out.println(scooter.toString());
            }
            else if(menuChoice==3){
                wheels=numWheels();
                pwr=vPower();
                vClass="SKATEBOARD";
                Vehicles skateboard = new skateboard(year,make,model,color,pwr,wheels,vClass);
                System.out.println(skateboard.toString());
            }
            else if(menuChoice==4){
                wheels=numWheels();
                pwr=vPower();
                vClass="CARRIAGE";
                Vehicles carriage = new carriage(year,make,model,color,pwr,wheels,vClass);
                System.out.println(carriage.toString());
            }
        }

    }

    private static String vPower() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How is this Vehicle powered?");
        System.out.println("1.Human, 2.Horse");
        do {
            try{
                error=false;
                menuChoice = userInput.nextInt();
                if(menuChoice<1||menuChoice>2){
                    error=true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid number (1-4)");
                error=true;
                userInput.next();
            }
            if(menuChoice==1){
                pwr="Human";
            }
            else if(menuChoice==2){
                pwr="Animal";
            }
            else{
                System.out.println("Please enter a valid Choice ! 1 or 2");
            }

        }while(error);
        return pwr;
    }

    private static int numWheels(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many Wheels?");
        do {
            error = false;
            try {
                wheels=userInput.nextInt();
                if (wheels<1){
                    System.out.println("enter at least 1 Wheel!");
                    error=true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for wheels!: ");
                error = true;
                userInput.next();
            }
        }while (error);
        return wheels;
    }
    private static int numCyl(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many Cylinders?: ");
        do {
            error = false;
            try {
                cyl = userInput.nextInt();
                if (!validCyl.contains(cyl)){
                    System.out.println("enter at least 2 cylinders!");
                    error=true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number of cylinders: ");
                error = true;
                userInput.next();
            }
        }while (error);

        return cyl;
    }
    private static int numAxles() {
        Scanner userInput = new Scanner(System.in);

        int axles =0;
        System.out.println("Enter number of axles: ");

        do{
            error=false;
            try {
                axles= userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number!");
            }
            if (axles < 2){
                System.out.println("Enter");
            }
        }while(error);
        return axles;
    }

    public static String fuelCheck() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Gas, Diesel or Electric? (G/D/E): ");
        String fuelIs = null;
        boolean error;

        do {
            error = false;
            char fuelType = userInput.next().toUpperCase().charAt(0);

        if (fuelType=='D') {
            fuelIs = "DIESEL";
        }
        else if(fuelType=='G') {
            fuelIs = "GAS";
        }
        else if(fuelType=='E'){
                fuelIs="ELECTRIC";
        }
        else{
            System.out.println("Please enter a valid input (G/D/E): ");
            error=true;
        }
        } while (error);


        return fuelIs;
    }
}
