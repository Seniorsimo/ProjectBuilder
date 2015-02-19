/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progectbuilder.utils;

/**
 *
 * @author User
 */
public class Input {
    private char[] line;
    private int index;
    
    public Input(String s){
        line = s.toCharArray();
        index = 0;
    }
    
    public String next(int n){
        if((index + n) <= line.length)
            n = line.length - index;
        return String.copyValueOf(line, index, n);
    }
    public String read(int n){
        String s = next(n);
        index += s.length();
        return s;
    }
    public String nextWord(){
        int i = 0;
        for(; i<(line.length-index); i++){
            if(line[index+i] == ' ')
                return String.copyValueOf(line, index, i);
        }
        return String.copyValueOf(line, index, i);
    }
    public String readNextWord(){
        String s = nextWord();
        index += s.length();
        return s;
    }
}
