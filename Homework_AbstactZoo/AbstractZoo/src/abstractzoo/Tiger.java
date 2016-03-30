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
public class Tiger extends BigCats{

    @Override
    public boolean aMonthPasses() {
        age++;
        health-=2;
        return true;
       }

    @Override
    public  void treat()
    {
        stroked();
    }
    
   public  void stroked()
    {
       health+=2;
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
