/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Random;
/**
 *
 * @author shuning
 */
public class Visitor {
    int num = 0;
    String identity;
    String[] title = {"Student", "Professor", "Business Person", "Blogger"};

    public int getNum() {
        return num;
    }

    public String getIdentity() {
        return identity;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void setIdentity(String identity) {
        this.identity = identity;
    }  
    
    public String setIdentityHelper(Random r1){
        return title[r1.nextInt(4)];
    }

 
}
