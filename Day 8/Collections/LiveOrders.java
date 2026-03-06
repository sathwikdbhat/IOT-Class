import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders=new ArrayList<>();
        // New orders are added.
        liveOrders.add("Order 1");
        liveOrders.add("Order 2");
        liveOrders.add("Order 3");
        // Check Order
        System.out.println("Order Exists? "+liveOrders.contains("Order 1"));
        // Check the live orders
        System.out.println("Live Orders: "+liveOrders);
        liveOrders.clear();;
        System.out.println("Orders after closing: "+liveOrders);
    }
}