package org.myClass;

public class Main {
    public static void main(String[] args) {
        SamsungPhone ph1 = new SamsungPhone();
        String p = ph1.processor();
        System.out.println(p);
        Iphone ip1 = new Iphone();
        String str = ip1.processor();
        String str2 = ip1.version();
        System.out.println(str1+" "+str2);
    }
}
