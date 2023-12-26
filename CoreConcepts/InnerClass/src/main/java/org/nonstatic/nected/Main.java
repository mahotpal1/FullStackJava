package org.nonstatic.nected;

import org.jetbrains.annotations.NotNull;
import org.nonstatic.anonymous.Lock;

public class Main {
    public static void main(String @NotNull [] args) {
        org.nonstatic.nected.Door door = new Door();
        System.out.println(door.isLocked("qwerty"));
        if(door.isLocked(args[0])){
            System.out.println("Door is locked!!");
        }else {
            System.out.println("Door is open!!");
        }
    }
}
