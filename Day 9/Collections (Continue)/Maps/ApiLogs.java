import java.util.LinkedHashMap;  // Maintains the insretion order.
import java.util.Map;
public class ApiLogs {
    public static void main(String[] args) {
        Map<String, String> logs=new LinkedHashMap<>();
        logs.put("2", "Signup");
        logs.put("1", "Login");
        logs.put("4", "Browser Video");
        logs.put("3", "Scroll Up or Scroll Down");
        logs.put("5", "LogOut");
        System.out.println("API Logs: "+logs);
    }
}