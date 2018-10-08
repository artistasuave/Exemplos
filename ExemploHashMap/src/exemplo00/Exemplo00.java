package exemplo00;

import java.util.HashMap;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exemplo00 {
    
    public static void main (String args){
        
        HashMap<String,Integer> idades
                = new HashMap<String,Integer>();
                idades.put("Cleiton", 22);
                idades.put("Kleyton", 24);
                
                if(idades.containsKey("KreitoM")){
                    System.out.println("TEM KREITOM");
                }else{
                    System.out.println("NÃO TEM KREITOM");
                }
        
    }
    
}
