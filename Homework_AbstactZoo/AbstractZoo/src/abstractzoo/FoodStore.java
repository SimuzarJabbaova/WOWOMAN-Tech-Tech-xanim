/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractzoo;

import java.util.Hashtable;

/**
 *
 * @author Simuzer
 */
public class FoodStore {

    String eat_name[] = {"hay", "steak", "fruit", "celery", "fish", "ice cream"};
    int health[] = {1, 3, 2, 0, 3, 1};
    int waste[] = {4, 4, 3, 1, 2, 3};
    Hashtable<String, Integer> foods_quantity = new Hashtable<>();

    public FoodStore() {
        foods_quantity.put("hay", 0);
        foods_quantity.put("steak", 0);
        foods_quantity.put("fruit", 0);
        foods_quantity.put("celery", 0);
        foods_quantity.put("fish", 0);
        foods_quantity.put("ice cream,", 0);

    }

    public FoodStore(String  food_name, int  quantity) {
        foods_quantity.put(food_name, quantity);

    }
    public FoodStore(Hashtable aFoods_quantity) {
        this.foods_quantity=aFoods_quantity;

    }
    public void addFood(String food_name, int quantity) {
        foods_quantity.put(food_name, quantity);       
    }
    // takeFood(String food_name)
}
