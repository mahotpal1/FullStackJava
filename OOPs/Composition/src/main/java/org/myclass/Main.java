package org.myclass;

import org.myclass.laptop.Laptop;
import org.myclass.laptop.components.GraphicCard;
import org.myclass.laptop.components.Processor;

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        System.out.println(l.getProcessor().getBrand());

        Processor p1 = new Processor();
        GraphicCard g1 = new GraphicCard();

        Laptop l1 = new Laptop(24.0f, p1, "ddr5", "1 tb", g1, "Single Layer", "Backlit");
        System.out.println(l1);
    }
}
