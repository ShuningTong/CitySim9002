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
 *
 * @author shuning
 */
public class VisitorTest {
    
    Visitor v = null;
    Random mockRandom = null;
    
    @Before
    public void setUp(){
        v = new Visitor();
        mockRandom = mock(Random.class);
    }
            
    @Test
    public void ifIndexIsZero(){
//        Visitor v = new Visitor();
//        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(4)).thenReturn(0);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Student"); 
    }
    
    @Test
    public void ifIndexIsOne(){
//        Visitor v = new Visitor();
//        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(4)).thenReturn(1);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Professor"); 
    }
    
    @Test
    public void ifIndexIsTwo(){
//        Visitor v = new Visitor();
//        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(4)).thenReturn(2);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Business Person"); 
    }
    
    @Test
    public void ifIndexIsThree(){
//        Visitor v = new Visitor();
//        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(4)).thenReturn(3);
        Assert.assertEquals(v.setIdentityHelper(mockRandom), "Blogger"); 
    }
}
