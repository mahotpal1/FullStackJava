package org.myClass;

public class SamsungPhone implements Phone{
    @Override
    public String processor(){
        return "888";
    }

    @Override
    public String spaceInGb() {
        return "256GB";
    }
}
