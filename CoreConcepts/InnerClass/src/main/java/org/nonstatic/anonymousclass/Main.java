package org.nonstatic.anonymousclass;

public class Main {
    public static void main(String[] args) {
        //anonymous class as implementation was incomplete
        new Lock() {
            @Override
            public void isUnlocked(String key) {
                if(key.equals("agoda")){
                    System.out.println("Shop is open");
                }else{
                    System.out.println("Shop is closed");
                }
            }
        }.isUnlocked("agoda");
    }
}

abstract class Lock{
    public abstract void isUnlocked(String key);
    public void test(){
        System.out.println("test");
    }
}
