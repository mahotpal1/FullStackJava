package org.staticinnerclass;

import org.staticinnerclass.myClass.Shop;

public class main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        //shop.message();
        Shop.Inner.message();
    }
}
