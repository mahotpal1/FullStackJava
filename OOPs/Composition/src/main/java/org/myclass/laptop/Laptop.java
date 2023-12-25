package org.myclass.laptop;

import org.myclass.laptop.components.GraphicCard;
import org.myclass.laptop.components.Processor;

public class Laptop {
    private float screen;
    private Processor processor; //Processor class object
    private String ram;
    private String hardDrive;
    private GraphicCard graphicCard; //GraphicCard class object
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "16 Gb";
        this.hardDrive = "2 tB";
        this.graphicCard = new GraphicCard();
        this.opticalDrive = "Multi layer";
        this.keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public float getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicCard=" + graphicCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
