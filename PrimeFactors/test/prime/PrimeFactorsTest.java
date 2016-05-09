/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import static prime.PrimeFactors.generate;

/**
 *
 * @author Antonija
 */
public class PrimeFactorsTest extends TestCase {
    
    public PrimeFactorsTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of generate method, of class PrimeFactors.
     */
   private List<Integer> list(int... ints){
       List<Integer> list=new ArrayList<Integer>();
       for(int i : ints){
           list.add(i);
       }
       return list;
   }
   
    public void testOne() throws Exception{
       assertEquals(list(),generate(1));
   }
    
    public void testTwo() throws Exception{
       assertEquals(list(2),generate(2)); 
    }
    
    public void testThree() throws Exception{
        assertEquals(list(3),generate(3));  
    }
    
    public void testFour() throws Exception{
        assertEquals(list(2,2),generate(4));  
    }
    
    public void testFive() throws Exception{
        assertEquals(list(2,3),generate(6));  
    }
    
    public void testSix() throws Exception{
        assertEquals(list(2,2,2),generate(8));  
    }
    
    public void testSeven() throws Exception{
        assertEquals(list(3,3),generate(9));  
    }
    
}
