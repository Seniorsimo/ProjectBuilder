/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progectbuilder.parser;

import progectbuilder.utils.Assoc;

/**
 *
 * @author User
 */
public class Parser {
    private static Parser parser;
    
    private Parser(){
        
    }
    
    public static Parser getParser(){
        if (parser == null)
            parser = new Parser();
        return parser;
    }
    
    public static Assoc parse(){
        
        return null;
    }
    
}
