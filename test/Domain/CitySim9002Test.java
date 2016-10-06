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
    
    // Prepare a CitySim9002 istance, a test double for Random class, four test doubles for Visitor class, and eight stubs for getIdentity and getNum methods.
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
    
    // If a student visitor goes to Squirrel Hill, he/she should like it.
    // The test double of student Visitor and placeNo 0 are provided.
    // The likes method should return true.
    @Test
    public void studentLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockStudent, 0)); 
    }
    
    // If a student visitor goes to Downtown, he/she should like it.
    // The test double of a student Visitor and placeNo 1 are provided.
    // The likes method should return true.
    @Test
    public void studentLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockStudent, 1)); 
    }
    
    // If a student visitor goes to The Point, he/she should like it.
    // The test double of a student Visitor and placeNo 2 are provided.
    // The likes method should return true.
    @Test
    public void studentLikesThePoint(){
        Assert.assertTrue(citySim.likes(mockStudent, 2)); 
    }
    
    // If a student visitor goes to Cathedral of Learning, he/she should not like it.
    // The test double of a student Visitor and placeNo 3 are provided.
    // The likes method should return false.
    @Test
    public void studentNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockStudent, 3)); 
    }
    
    // If a professor visitor goes to Squirrel Hill, he/she should like it.
    // The test double of professor Visitor and placeNo 0 are provided.
    // The likes method should return true.
    @Test
    public void professorLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockProfessor, 0)); 
    }
    
    // If a professor visitor goes to Downtown, he/she should like it.
    // The test double of a professor Visitor and placeNo 1 are provided.
    // The likes method should return true.
    @Test
    public void professorLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockProfessor, 1)); 
    }
    
    // If a professor visitor goes to The Point, he/she should like it.
    // The test double of a professor Visitor and placeNo 2 are provided.
    // The likes method should return true.
    @Test
    public void professorLikesThePoint(){
        Assert.assertTrue(citySim.likes(mockProfessor, 2)); 
    }
    
    // If a professor visitor goes to Cathedral of Learning, he/she should like it.
    // The test double of a professor Visitor and placeNo 3 are provided.
    // The likes method should return true.
    @Test
    public void professorLikesCathedralLearning(){
        Assert.assertTrue(citySim.likes(mockProfessor, 3)); 
    }
    
    // If a business person visitor goes to Squirrel Hill, he/she should like it.
    // The test double of business person Visitor and placeNo 0 are provided.
    // The likes method should return true.
    @Test
    public void businessPersonLikesSquirrelHill(){
        Assert.assertTrue(citySim.likes(mockBusinessPerson, 0)); 
    }
    
    // If a business person visitor goes to Downtown, he/she should like it.
    // The test double of a business person Visitor and placeNo 1 are provided.
    // The likes method should return true.
    @Test
    public void businessPersonLikesDowntown(){
        Assert.assertTrue(citySim.likes(mockBusinessPerson, 1)); 
    }
    
    // If a business person visitor goes to The Point, he/she should not like it.
    // The test double of a business person Visitor and placeNo 2 are provided.
    // The likes method should return false.
    @Test
    public void businessPersonNotLikeThePoint(){
        Assert.assertFalse(citySim.likes(mockBusinessPerson, 2)); 
    }

    // If a business person visitor goes to Cathedral of Learning, he/she should not like it.
    // The test double of a business person Visitor and placeNo 3 are provided.
    // The likes method should return false.
    @Test
    public void businessPersonNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockBusinessPerson, 3)); 
    }
    
    // If a blogger visitor goes to Squirrel Hill, he/she should not like it.
    // The test double of blogger Visitor and placeNo 0 are provided.
    // The likes method should return false.
    @Test
    public void bloggerNotLikeSquirrelHill(){
        Assert.assertFalse(citySim.likes(mockBlogger, 0)); 
    }
    
    // If a blogger visitor goes to Downtown, he/she should not like it.
    // The test double of blogger Visitor and placeNo 1 are provided.
    // The likes method should return false.
    @Test
    public void bloggerNotLikeDowntown(){
        Assert.assertFalse(citySim.likes(mockBlogger, 1)); 
    }
    
    // If a blogger visitor goes to The Point, he/she should not like it.
    // The test double of blogger Visitor and placeNo 2 are provided.
    // The likes method should return false.
    @Test
    public void bloggerNotLikeThePoint(){
        Assert.assertFalse(citySim.likes(mockBlogger, 2)); 
    }

    // If a blogger visitor goes to Cathedral of Learning, he/she should not like it.
    // The test double of blogger Visitor and placeNo 3 are provided.
    // The likes method should return false.
    @Test
    public void bloggerNotLikeCathedralLearning(){
        Assert.assertFalse(citySim.likes(mockBlogger, 3)); 
    }
    
    // If the nextInt(5) method of Random class returns 4, then 0, then 3, then 4, a student visitor should like Squirrel Hill, 
    // then not like Cathedral of Learning, then Left the City.
    // The stub of nextInt method returns 4, then 0, then 3, then 4.
    // The output should be the same as expected.
    @Test
    public void studentGoToSquirrelHillAndCathedralLearning(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(0).thenReturn(3).thenReturn(4);
        String output = citySim.tourist(mockStudent, mockRandom);
        String shouldPrint = "Visitor 1 is going to Squirrel Hill!\nVisitor 1 did like Squirrel Hill.\n"
                + "Visitor 1 is going to Cathedral of Learning!\nVisitor 1 did not like Cathedral of Learning.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    // If the nextInt(5) method of Random class returns 4, then 1, then 2, then 4, a professor visitor should like Downtown, 
    // then like The Point, then Left the City.
    // The stub of nextInt method returns 4, then 1, then 2, then 4.
    // The output should be the same as expected.
    @Test
    public void professorGoToDowntownAndThePoint(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(1).thenReturn(2).thenReturn(4);
        String output = citySim.tourist(mockProfessor, mockRandom);
        String shouldPrint = "Visitor 1 is going to Downtown!\nVisitor 1 did like Downtown.\n"
                + "Visitor 1 is going to The Point!\nVisitor 1 did like The Point.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    // If the nextInt(5) method of Random class returns 4, then 3, then 2, then 4, a business person visitor should not like Cathedral of Learning, 
    // then not like The Point, then Left the City.
    // The stub of nextInt method returns 4, then 3, then 2, then 4.
    // The output should be the same as expected.
    @Test
    public void BusinessPersonGoToCathedralLearningAndThePoint(){
        when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(3).thenReturn(2).thenReturn(4);
        String output = citySim.tourist(mockBusinessPerson, mockRandom);
        String shouldPrint = "Visitor 1 is going to Cathedral of Learning!\nVisitor 1 did not like Cathedral of Learning.\n"
                + "Visitor 1 is going to The Point!\nVisitor 1 did not like The Point.\n"
                + "Visitor 1 has Left the City!\n";
        Assert.assertEquals(output, shouldPrint); 
    }
    
    // If the nextInt(5) method of Random class returns 4, then 1, then 0, then 4, a blogger visitor should not like Downtown, 
    // then not like Squirrel Hill, then Left the City.
    // The stub of nextInt method returns 4, then 1, then 0, then 4.
    // The output should be the same as expected.
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

