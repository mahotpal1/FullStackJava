package org.myclass.laptop.components;

public class GraphicCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicCard() {
        this.brand = "NVidia";
        this.series = 3100;
        this.memory = "6 GB";
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public String getMemory() {
        return memory;
    }

    public GraphicCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }
}
