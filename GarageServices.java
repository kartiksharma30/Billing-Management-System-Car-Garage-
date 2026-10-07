import javax.management.openmbean.TabularData;
import java.util.*;

public class GarageServices {
    private Map<String, Costumer> costumersMap;
    private List<Services> availableServices;

    public GarageServices() {
        this.costumersMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        availableServices.add(new Services("Car Wash" , 500));
        availableServices.add(new Services("Oil Change" , 700));
        availableServices.add(new Services("wheel Alignment" , 300));
        availableServices.add(new Services("Tyre Change" , 3000));
        availableServices.add(new Services("Punchure" , 100));
    }

    public void addCostumer(String name , String phone , String carNumber , String model){
        Car car = new Car(carNumber, model);
        Costumer costumer = new Costumer(name, phone, car);
        costumersMap.put(carNumber,costumer);
        System.out.println("Costumer Added Successfully");
    }
    public void createInvoice(String carNumber){
        if(!costumersMap.containsKey(carNumber)){
            System.out.println("Car Not Found with carNumber : " + carNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Costumer costumer = costumersMap.get(carNumber);
        Invoice invoice = new Invoice(costumer);
        System.out.println("Services Available : ");
        for(int i = 0 ; i < availableServices.size(); i++){
            System.out.println((i+1) + ". " + availableServices.get(i).getName() + "-₹" +
                    availableServices.get(i).getPrice());
        }
        while(true){
            System.out.println("Enter Service number to add or 0 to finish : ");
            int choice = sc.nextInt();
            if(choice == 0) break;
            if(choice > 0 && choice <= availableServices.size()){
                invoice.addservice(availableServices.get(choice-1));
                System.out.println("Service Added Successfully");
            }else{
                System.out.println("Invalid choice");
            }

        }
        invoice.printinvoice();
    }
}