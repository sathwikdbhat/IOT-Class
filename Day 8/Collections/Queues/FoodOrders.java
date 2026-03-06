import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        // For adding: add() [Fail][Strict], after() [Not Fail][Not Strict]
        orders.add("Order 101");  // Strict Capacity Based.
        orders.add("Order 102");  // Flexible
        orders.add("Order 103");
        orders.add("Order 104");
        System.out.println("Orders: "+orders);
        // For removal: remove() --> Strict[Fail] poll() Not Strict[NotFail]
        System.out.println("Serving: "+orders.poll());
        System.out.println("Pending order: "+orders);
    }
}