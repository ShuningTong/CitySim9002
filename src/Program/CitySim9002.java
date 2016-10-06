/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Domain.Validator;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author AsphaltPanthers
 */
// this is done for purpose, we don't test controller, we test all methods this controller calls
public class CitySim9002 {
    public static final String ERROR_MESSAGE = "Please enter one integer argument, seed";
    public static final String[] LOCATIONS = {"Squirrel Hill", "Downtown", "The Point", "Cathedral of Learning", "Left the City"};
    public HashMap<String, boolean[]> map;
    public static final boolean[] STUDENT_LIKES = {true, true, true, false};
    public static final boolean[] PROFESSOR_LIKES = {true, true, true, true};
    public static final boolean[] BUSINESS_PERSON_LIKES = {true, true, false, false};
    public static final boolean[] BLOGGER_LIKES = {false, false, false, false};
    
    public CitySim9002(){
        this.map = new HashMap<String, boolean[]>();
        this.map.put("Student", STUDENT_LIKES);
        this.map.put("Professor", PROFESSOR_LIKES);
        this.map.put("Business Person", BUSINESS_PERSON_LIKES);
        this.map.put("Blogger", BLOGGER_LIKES);
    }
    
    public String tourist(Visitor person, Random r1){
        StringBuilder sb = new StringBuilder();
        int placeNum = r1.nextInt(5);
        while(placeNum == 4){
            placeNum = r1.nextInt(5);
        }
        while(placeNum != 4){
            sb.append("Visitor " + person.getNum() + " is going to " + LOCATIONS[placeNum] + "!\n");
            if (this.likes(person, placeNum)){
                sb.append("Visitor " + person.getNum() + " did like " + LOCATIONS[placeNum] + ".\n");
            } else {
                sb.append("Visitor " + person.getNum() + " did not like " + LOCATIONS[placeNum] + ".\n");
            }
            placeNum = r1.nextInt(5);
        }
        sb.append("Visitor " + person.getNum() + " has " + LOCATIONS[placeNum] + "!\n");
        return sb.toString();
    }
    
    public boolean likes(Visitor person, int placeNum){
        return this.map.get(person.getIdentity())[placeNum];
    }
    
    public static void main(String[] args) {
        CitySim9002 sim = new CitySim9002();

        if (new Validator().validateArguments(args)) {
            System.out.println("Welcome to CitySim! Your seed is " + args[0] + ".");
            Random r1 = new Random(Long.parseLong(args[0]));
            for (int i = 0; i < 5; i++){
                Visitor person = new Visitor();
                person.setNum(i);
                person.setIdentity(person.setIdentityHelper(r1));
                
                System.out.println("Visitor " + person.getNum() + " is a " + person.getIdentity() + "\n");
                String tour = sim.tourist(person, r1);
                System.out.println(tour);
                System.out.println("***");
            }
        }
        else {
            System.out.println(ERROR_MESSAGE);  
            System.exit(0);
        }
    }
}
