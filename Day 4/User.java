import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// To achieve Serialization we implement the Serialization interface.
public class User implements Serializable {
    String username="Sathwik";
    transient String password="123abc";
}
class TransientDemo{
    public static void main(String[] args) throws Exception {
        User u=new User();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("User.ser"));
        oos.writeObject(u);
        oos.close();

        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("User.ser"));
        User u1=(User) ois.readObject();
        System.out.println(u1.username);
        System.out.println(u1.password);
    }
}