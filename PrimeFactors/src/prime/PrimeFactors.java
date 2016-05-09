/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonija
 */
public class PrimeFactors {
    public static List<Integer> generate(int n){
        List<Integer> primes=new ArrayList<Integer>();
       
        for(int candidate=2;n>1;candidate++)
          for(;n%candidate==0;n/=candidate)
              primes.add(candidate);
          
           
        
        
        return primes;
    }
}
