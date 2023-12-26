package org.nonstatic.nected;

public class Door {
    public boolean isLocked(String key){
        //nested/local inner class.
        class Lock{
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
                    return true;
                }else{
                    return false;
                }
            }
        }
        //Anonymous Class
        return new Lock().isLocked(key);
    }
}
