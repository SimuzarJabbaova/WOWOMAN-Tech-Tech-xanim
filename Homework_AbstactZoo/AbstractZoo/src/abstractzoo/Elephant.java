/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractzoo;

/**
 *
 * @author HP
 */
public class Elephant extends Animals{
    {
        lifeExpectancy = 36;
    }
  @Override
    public boolean aMonthPasses() {
        age++;
        health-=2;
        return true;
       }  

    @Override
    public  void treat()
    {
        bath();
    }
    
   public  void bath()
    {
       health+=5;
    } 

    @Override
    public boolean canEat(String eat) {
        if (eat.equals("hay") || eat.equals("fruit")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decreaseHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
