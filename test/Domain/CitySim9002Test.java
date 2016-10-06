/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Program.CitySim9002;
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
public class CitySim9002Test {
    
    CitySim9002 citySim = null;
    Visitor mockStudent = null;
    Visitor mockProfessor = null;
    Visitor mockBusinessPerson = null;
    Visitor mockBlogger = null;
    Random mockRandom = null;
    
    @Before
    public void setUp(){
         citySim = new CitySim9002();
         mockRandom = mock(Random.class);
         mockStudent = mock(Visitor.class);
         when(mockStudent.getIdentity()).thenReturn("Student");
         when(mockStudent.getNum()).thenReturn(1);
         mockProfessor = mock(Visitor.class);
         when(mockProfessor.getIdentity()).thenReturn("Professor");
         when(mockProfessor.getNum()).thenReturn(1);
         mockBusinessPerson = mock(Visitor.class);
         when(mockBusinessPerson.getIdentity()).thenReturn("Business Person");
         when(mockBusinessPerson.getNum()).thenReturn(1);
         mockBlogger = mock(Visitor.class);
         when(mockBlogger.getIdentity()).thenReturn("Blogger");
         when(mockBlogger.getNum()).thenReturn(1);
    }
    
    @Test
    public void studentLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockStudent, 0)); 
    }
    
    @Test
    public void studentLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockStudent, 1)); 
    }
    
    @Test
    public void studentLikesThePoint(){
        Assert.assertTrue(citySim.likes(mockStudent, 2)); 
    }
    
    @Test
    public void studentNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockStudent, 3)); 
    }
    
    @Test
    public void professorLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockProfessor, 0)); 
    }
    
    @Test
    public void professorLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockProfessor, 1)); 
    }
    
    @Test
    public void professorLikesThePoint(){
        Assert.assertTrue(citySim.likes(mockProfessor, 2)); 
    }

    @Test
    public void professorLikesCathedralLearning(){
        Assert.assertTrue(citySim.likes(mockProfessor, 3)); 
    }
    
    @Test
    public void businessPersonLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockBusinessPerson, 0)); 
    }
    
    @Test
    public void businessPersonLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockBusinessPerson, 1)); 
    }
    
    @Test
    public void businessPersonNotLikeThePoint(){
        Assert.assertFalse(citySim.likes(mockBusinessPerson, 2)); 
    }

    @Test
    public void businessPersonNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockBusinessPerson, 3)); 
    }
    
    @Test
    public void bloggerNotLikeSquirrelHill(){
        Assert.assertFalse(citySim.likes(mockBlogger, 0)); 
    }
    
    @Test
    public void bloggerNotLikeDowntown(){
        Assert.assertFalse(citySim.likes(mockBlogger, 1)); 
    }
    
    @Test
    public void bloggerNotLikeThePoint(){
        Assert.assertFalse(citySim.likes(mockBlogger, 2)); 
    }

    @Test
    public void bloggerNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockBlogger, 3)); 
    }
    
    @Test
    public void studentGoToSquirrelHillAndCathedralLearning(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(0).thenReturn(3).thenReturn(4);
        String output = citySim.tourist(mockStudent, mockRandom);
        String shouldPrint = "Visitor 1 is going to Squirrel Hill!\nVisitor 1 did like Squirrel Hill.\n"
                + "Visitor 1 is going to Cathedral of Learning!\nVisitor 1 did not like Cathedral of Learning.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    @Test
    public void professorGoToDowntownAndThePoint(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(1).thenReturn(2).thenReturn(4);
        String output = citySim.tourist(mockProfessor, mockRandom);
        String shouldPrint = "Visitor 1 is going to Downtown!\nVisitor 1 did like Downtown.\n"
                + "Visitor 1 is going to The Point!\nVisitor 1 did like The Point.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    @Test
    public void BusinessPersonGoToCathedralLearningAndThePoint(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(3).thenReturn(2).thenReturn(4);
        String output = citySim.tourist(mockBusinessPerson, mockRandom);
        String shouldPrint = "Visitor 1 is going to Cathedral of Learning!\nVisitor 1 did not like Cathedral of Learning.\n"
                + "Visitor 1 is going to The Point!\nVisitor 1 did not like The Point.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    @Test
    public void BloggerGoToDowntownAndSquirrelHill(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(1).thenReturn(0).thenReturn(4);
        String output = citySim.tourist(mockBlogger, mockRandom);
        String shouldPrint = "Visitor 1 is going to Downtown!\nVisitor 1 did not like Downtown.\n"
                + "Visitor 1 is going to Squirrel Hill!\nVisitor 1 did not like Squirrel Hill.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
}

