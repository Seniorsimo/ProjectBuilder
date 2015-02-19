/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progectbuilder.utils;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class Assoc<O> {
    private HashMap<String, O> map;
    public Assoc(){
        map = new HashMap<>();
    }
    
    public void set(String s, O obj){
        map.put(s, obj);
    }
    
    public O get(String s){
        return map.get(s);
    }
    public String getString(String s){
        return (String) map.get(s);
    }
    public int getInt(String s){
        return (Integer) map.get(s);
    }
    public char getChar(String s){
        return (Character) map.get(s);
    }
    public boolean getBool(String s){
        return (Boolean) map.get(s);
    }
}
