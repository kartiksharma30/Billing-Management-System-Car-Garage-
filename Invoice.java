import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Costumer costumer;
    private List<Services> listServices;
    private double totalamount;

    public Invoice(Costumer costumer) {
        this.costumer = costumer;
        this.listServices = new ArrayList<>();
        this.totalamount = 0;
    }
    public void addservice(Services service) {
        listServices.add(service);
        totalamount = totalamount + service.getPrice();
    }
    public void printinvoice() {
        System.out.println("----------Invoice ----------");
        System.out.println();
        System.out.println("CostumerName: " + costumer.getName() + " | PhoneNo: " + costumer.getPhone() + "| "+"CarModel : " + costumer.getCar().getModel() + " | CarNumber : " + costumer.getCar().getCarNumber());
        System.out.println("Services : ");
        for(int i= 0; i < listServices.size(); i++) {
            System.out.println((i+1)+" "+" # Service : " + listServices.get(i).getName() + " | (₹)Price : " + listServices.get(i).getPrice());
        }
        System.out.println("Total Amount : " + totalamount);
        System.out.println();
        System.out.println("----------------Thank You-------------------");
    }
}