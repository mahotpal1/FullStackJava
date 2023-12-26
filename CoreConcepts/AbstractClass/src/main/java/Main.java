import org.myClass.John;
import org.myClass.Person;

public class Main {
    public static void main(String[] args) {
        //polymorphism
        Person p1 = new John();
        p1.eat();
        p1.speak();

        //Anonymous object p2
        Person p2 = new Person(){
          @Override
          public void eat(){
              System.out.println("Eat Food!!");
          }
        };
        p2.speak();
        p2.eat();
    }
}
