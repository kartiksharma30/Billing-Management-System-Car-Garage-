import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageServices garageServices = new GarageServices();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------All India Car Services Center----------");
        while(true){

            System.out.println("1. Add Costumer ");
            System.out.println("2. Display Services ");
            System.out.println("3. Exits ");
            System.out.println("4. Enter your choice ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Costumer Name: ");
                    String name = sc.next();
                    System.out.println("Enter Costumer PhoneNumber: ");
                    String phone = sc.next();
                    System.out.println("Enter Costumer CarNumber: ");
                    String carNumber = sc.next();
                    System.out.println("Enter Costumer CarModel : ");
                    String carModel = sc.next();
                    garageServices.addCostumer(name, phone, carNumber, carModel);
                    break;
                case 2:
                    System.out.println("Enter Car Number : ");
                    String CarNo  = sc.next();
                    garageServices.createInvoice(CarNo);
                    break;
                case 3:
                    System.out.println("Exiting.......Thank you for using our service ");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice....Try again");
                case 4:

            }
        }

    }
}