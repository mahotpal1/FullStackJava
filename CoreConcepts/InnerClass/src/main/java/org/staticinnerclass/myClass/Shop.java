package org.staticinnerclass.myClass;

import java.util.concurrent.locks.Lock;

public class Shop {

    public static class Inner{
        public static void message(){
            System.out.println("Hello Static!!!");
        }
    }
}
