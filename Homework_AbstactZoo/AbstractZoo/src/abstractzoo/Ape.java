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
public abstract class Ape extends Animals {

    @Override
    public boolean canEat(String eat) {
        if (eat.equals("fruit") || eat.equals("ice cream")) {
            return true;
        } else {
            return false;

        }
    }
}
