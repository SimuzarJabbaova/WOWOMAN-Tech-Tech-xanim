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
public abstract class BigCats extends Animals {

    {
        lifeExpectancy = 24;
    }

    @Override
    public boolean canEat(String eat) {
        if (eat.equals("steak") || eat.equals("celery")) {
            return true;
        } else {
            return false;
        }
    }
}
