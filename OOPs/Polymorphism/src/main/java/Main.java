import org.myclass.Iphone;
import org.myclass.Nokia3310;
import org.myclass.Phone;

public class Main {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.feature();
        Nokia3310 nk = new Nokia3310();
        nk.feature();
        Iphone ip = new Iphone();
        ip.feature();
        // Method Overriding
        ph = new Nokia3310();
        ph.feature();
    }
}
