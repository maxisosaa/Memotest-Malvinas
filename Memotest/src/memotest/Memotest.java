
package memotest;

import java.security.Principal;


public class Memotest {

 
    public static void main(String[] args) {
         Principal start = new Principal() {
             @Override
             public String getName() {
                 throw new UnsupportedOperationException("Not supported yet."); 
             }
         };
        start.setVisible(true);
    }
    
}
