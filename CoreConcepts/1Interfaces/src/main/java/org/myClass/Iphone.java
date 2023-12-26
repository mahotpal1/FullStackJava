package org.myClass;

public class Iphone implements Phone, IOS{
    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public String spaceInGb() {
        return "16GB";
    }

    @Override
    public String version() {
        return "IOS14";
    }
}
