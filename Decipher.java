
package Decipher;

import java.util.*;
import java.io.*;



public class Decipher {

   LinkedList<String> buff;
   HashMap<String, Integer> functions;
   
   public Decipher ()
   {
       buff = new LinkedList<String>();
       functions = new HashMap<String, Integer>();
       
   }
    
   public void execute () throws FileNotFoundException, IOException{
       
           
        FileInputStream fstream = new FileInputStream("inputfile.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        
        String[] inputarray = new String[100];
        int i =0;
        
        while ((strLine = br.readLine()) != null)   {
        
        inputarray [i] = strLine;
        
        i++;
        }
        br.close();
       
           String[] fragments = new String[100];
                   
                  int xx;
                  int yy;
       
      String operand1, operand2;
        Integer value1, value2, value3 = null;
        if (fragments[1].contains("+")) {
            fragments = fragments[1].split("\\+");
            operand1 = fragments[0].trim();
            operand2 = fragments[1].trim();
            value1 = parsing_functions(operand1);
            value2 = parsing_functions(operand2);
            functions.put(value3, value1 + value2);

        } else if (fragments[1].contains("*")) {
            fragments = fragments[1].split("\\*");
            operand1 = fragments[0].trim();
            operand2 = fragments[1].trim();
            value1 = parsing_functions(operand1);
            value2 = parsing_functions(operand2);
            functions.put(value3, value1 * value2);

        } else if (fragments[1].contains("/")) {
            fragments = fragments[1].split("\\/");
            operand1 = fragments[0].trim();
            operand2 = fragments[1].trim();
            value1 = parsing_functions(operand1);
            value2 = parsing_functions(operand2);
            functions.put(value3, value1 / value2);

        } else if (fragments[1].contains("-")) {
            fragments = fragments[1].split("\\-");
            operand1 = fragments[0].trim();
            operand2 = fragments[1].trim();
            value1 = parsing_functions(operand1);
            value2 = parsing_functions(operand2);
            functions.put(value3, value1 - value2);

        } else {
            if (!(functions.containsKey(fragments[1]))) {
                throw new IllegalArgumentException("The word  " + fragments[1] + " isn't initialized");
            }
            functions.put(value3, functions.get(fragments[1]));
        }
    }

    private Integer parsing_functions(String operand1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
       
     
       
       
   }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
