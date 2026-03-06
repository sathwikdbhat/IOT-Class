import java.util.ArrayList;
import java.util.Collection;
public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderId = new ArrayList<>();
        orderId.add(101);
        orderId.add(102);
        orderId.add(103);
        System.out.println("Orders recieved: "+orderId);
        System.out.println("Total number of orders: "+orderId.size());

    }
}