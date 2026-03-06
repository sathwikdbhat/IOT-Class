import java.util.HashSet;
import java.util.Set;
public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue=new HashSet<>();  // We can use HashSet() to remove the duplicate elements and keeps only the unique element.
        emailQueue.add(" a@gmail.com");
        emailQueue.add(" b@gmail.com");
        emailQueue.add(" c@gmail.com");
        emailQueue.add(" a@gmail.com");
        emailQueue.add(" c@gmail.com");
        emailQueue.add(" d@gmail.com");
        System.out.println("Emails to send: "+emailQueue);
        System.out.println("Unique Emails: "+emailQueue.size());
    }
}