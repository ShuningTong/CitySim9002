/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author shuning
 */
public class ValidatorTest {
    
    // If one argument is provided, validatorNumberOfArguments method should return true.
    // Argument "1" is provided.
    // Should return true.
    @Test
    public void ifOneArgumentIsProvidedReturnTrue() {
        Assert.assertTrue(new Validator().validateNumberOfArguments(new String[] { "1" }));
    }
    
    // If more than one arguments are provided, validateNumberOfArguments method should return false.
    // Arguments ["1", "2"] are provided.
    // Should return false.
    @Test
    public void ifMoreThanOneArgumentsAreProvidedReturnFalse() {
        Assert.assertFalse(new Validator().validateNumberOfArguments(new String[] { "1", "2" }));
    }
    
    // If argument type is integer, validateArgumentType method should return true.
    // Argument "1" is provided.
    // Should return true.
    @Test
    public void ifArgumentIsAnIntegerReturnTrue() {
        Assert.assertTrue(new Validator().validateArgumentType(new String[] { "1" }));
    }
    
    // If argument type is not integer, validateArgumentType method should return false.
    // Argument "test" is provided, it's String type.
    // Should return false.
    @Test
    public void ifArgumentIsNotAnIntegerReturnFalse() {
        Assert.assertFalse(new Validator().validateArgumentType(new String[] { "test" }));
    }
    
    // If both argument length and argument type are correct, validateArguments method should return true.
    // The stub of validateNumberOfArguments method returns true, and the stub of validateArgumentType method returns true.
    // Should return true.
    @Test
    public void ifArgumentLengthAndArgumentTypeAreCorrect(){
        Validator mockValidator = mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(true);
        
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();
        
        Assert.assertTrue(mockValidator.validateArguments(new String[] { "0" }));
    }
    
    // If only one of argument length and argument type is correct, validateArguments method should return false.
    // The stub of validateNumberOfArguments method returns true, but the stub of validateArgumentType method returns false.
    // Should return false.
    @Test
    public void ifArgumentLengthOrArgumentTypeIsCorrect(){
        Validator mockValidator = mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(false);
        
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();
        
        Assert.assertFalse(mockValidator.validateArguments(new String[] { "0" }));
    }
    
    // If none of argument length or argument type is correct, validateArguments method should return false.
    // The stub of validateNumberOfArguments method returns false, and the stub of validateArgumentType method returns false.
    // Should return false.
    @Test
    public void ifArgumentLengthAndArgumentTypeAreWrong(){
        Validator mockValidator = mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(false);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(false);
        
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();
        
        Assert.assertFalse(mockValidator.validateArguments(new String[] { "0" }));
    }
}
