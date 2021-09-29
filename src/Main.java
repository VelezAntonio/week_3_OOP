import java.util.*;

public class Main {
    static List<String> vType=Arrays.asList("PASSENGER","MOTORCYCLE","SEMI");
    static List<String> fType=Arrays.asList("GAS","DIESEL");
    private static char fuelType;
    private static String fuel;
    private static int cyl;
    boolean error = false;
    private static String vClass;


    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Vehicle Year: ");

        int year = userInput.nextInt();

        userInput.nextLine();
        System.out.println("Vehicle Make: ");
        String make = userInput.nextLine().toUpperCase();

        System.out.println("Vehicle Model: ");
        String model = userInput.nextLine().toUpperCase();

        System.out.println("Vehicle Color: ");
        String color = userInput.nextLine().toUpperCase();

        System.out.println("Is Vehicle Motorized? (Y/N): ");
        char choice = userInput.next().toUpperCase().strip().charAt(0);
        if(choice == 'Y'){

            userInput.nextLine();
            System.out.println("Enter type of Vehicle: ");
            System.out.println("Passenger,Truck,Trailer");
            vClass = userInput.nextLine().toUpperCase();

            while(!vType.contains(vClass)){
                System.out.println("Please enter a valid vehicle type: ");
                vClass = userInput.nextLine().toUpperCase();
            }

            switch (vClass){
                case "PASSENGER":
                    System.out.println("Gas or Diesel? (G/D): ");
                    boolean error;
                    do {
                        error=false;
                        try {
                            char fuelType = userInput.next().toUpperCase().strip().charAt(0);
                        } catch (InputMismatchException e) {
                            System.out.println("Enter a Valid Choice: ");
                            error=true;
                        }
                    }while(error);
                    if (fuelType=='D'){
                        fuel="DIESEL";
                    }
                    else {
                        fuel="GAS";
                    }
                    System.out.println("How many Cylinders: ");
                    cyl= userInput.nextInt();


            }
            Vehicles passenger = new passenger(year,make,model,color,fuel,cyl,vClass);
            System.out.println(passenger.toString() );


        }
        else{
            System.out.println("bye");//For now until i finish non motorized section.
        }

    }
}
