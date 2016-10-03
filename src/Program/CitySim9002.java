/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Validator;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
// this is done for purpose, we don't test controller, we test all methods this controller calls
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    public static final String[] locations = {"Squirrel Hill", "Downtown", "The Point", "Cathedral of Learning"};
    
    public static void main(String[] args) {
        
        
        // validator is part of code
        if (new Validator().validateArguments(args)) {
            System.out.println("Welcome to CitySim, your seed is " + args[0] + " .");
        }
        else {
            System.out.println(errorMessage);  
        }
    }
}
