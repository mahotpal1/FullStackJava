package org.nonstatic.anonymous;

import org.nonstatic.nected.Door;

public class Main {
    public static void main(String[] args) {
        //Lock() is a anonymous class
        if(new Lock().getCode().equals(args[0])){
            System.out.println("The door is now open!!");
        }else{
            System.out.println("The door is closed!!");
        }
    }
}
