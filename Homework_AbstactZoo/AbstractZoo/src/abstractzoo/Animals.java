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
public abstract class Animals {
   protected byte age;
   protected char gender;
   protected String [] eats;
   protected byte health;
   protected int lifeExpectancy;
   public  byte getAge()
    {
        return age;
    }

    public char getGender() {
        return gender;
    }
    
    public  int getLifeExpectancy(){
        return lifeExpectancy;
    }
    public abstract boolean canEat(String eat);
    public abstract void eat();
    public abstract void decreaseHealth();
    public abstract void treat();
    public abstract boolean aMonthPasses();
    
}
