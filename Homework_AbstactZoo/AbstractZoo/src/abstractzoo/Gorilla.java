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
public class Gorilla extends Ape{

    {
        lifeExpectancy = 32;
    }
    @Override
    public void treat() {
        painting();
    }

    public void painting() {
        health += 4;
    }

    @Override
    public boolean aMonthPasses() {
        age++;
        health-=2;
        return true;
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
