/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Program.Visitor;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Note: All tests here are prepared for setIdentityHelper method in Visitor class. 
 * I do not test those getters and setters in Visitor class.
 * @author shuning
 */
public class VisitorTest {
    
    Visitor v = null;
    Random mockRandom = null;
    
    // Prepare a Visitor instance and a test double for Random class.
    @Before
    public void setUp(){
        v = new Visitor();
        mockRandom = mock(Random.class);
    }
    
    // If the nextInt(4) method of Random instance gives 0, setIdentityHelper method should return "Student".
    // The stub of the nextInt method gives 0.
    // Should return "Student".
    @Test
    public void ifIndexIsZero(){
        when(mockRandom.nextInt(4)).thenReturn(0);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Student"); 
    }
    
    // If the nextInt(4) method of Random instance gives 1, setIdentityHelper method should return "Professor".
    // The stub of the nextInt method gives 1.
    // Should return "Professor".
    @Test
    public void ifIndexIsOne(){
        when(mockRandom.nextInt(4)).thenReturn(1);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Professor"); 
    }
    
    // If the nextInt(4) method of Random instance gives 2, setIdentityHelper method should return "Business Person".
    // The stub of the nextInt method gives 2.
    // Should return "Business Person".
    @Test
    public void ifIndexIsTwo(){
        when(mockRandom.nextInt(4)).thenReturn(2);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Business Person"); 
    }
    
    // If the nextInt(4) method of Random instance gives 3, setIdentityHelper method should return "Blogger".
    // The stub of the nextInt method gives 3.
    // Should return "Blogger".
    @Test
    public void ifIndexIsThree(){
        when(mockRandom.nextInt(4)).thenReturn(3);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Blogger"); 
    }
}
