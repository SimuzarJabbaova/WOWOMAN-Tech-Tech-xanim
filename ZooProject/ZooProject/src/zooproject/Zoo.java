/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

import java.util.ArrayList;

/**
 *
 * @author esmiraldashirinova
 */
public class Zoo {

    Enclosure[] enclosures;
    ArrayList<ZooKeeper> zooKeepers;
    private ArrayList<Food> foods;

    public Zoo() {
        foods = new ArrayList<>();
        foods.add(new Food("hay", 1, 4));
        foods.add(new Food("steak", 3, 4));
        foods.add(new Food("fruit", 2, 3));
        foods.add(new Food("celery", 0, 1));
        foods.add(new Food("fish", 2, 3));
        foods.add(new Food("ice cream", 1, 3));
        enclosures = new Enclosure[5];
        for (int i = 0; i < enclosures.length; i++) {
            enclosures[i] = new Enclosure();

        }
        int animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " lions");
        for (int i = 1; i <= animalCount; i++) {
            Lion a = new Lion();
            a.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(a);
            System.out.println("Adding new lion into enclosure 1");
        }
        
         animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " tigers");
        for (int i = 1; i <= animalCount; i++) {
            Tiger t = new Tiger();
            t.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(t);
            System.out.println("Adding new tiger into enclosure 1");
        }
         animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " chimpanzee");
        for (int i = 1; i <= animalCount; i++) {
            Chimpanzee a = new Chimpanzee();
            a.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(a);
            System.out.println("Adding new Chimpanzee into enclosure 2");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " Gorilla");
        for (int i = 1; i <= animalCount; i++) {
            Gorilla a = new Gorilla();
            a.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(a);
            System.out.println("Adding new Gorilla into enclosure 2");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " Giraffe");
        for (int i = 1; i <= animalCount; i++) {
            Giraffe a = new Giraffe();
            a.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(a);
            System.out.println("Adding new Giraffe into enclosure 3");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " Elephant");
        for (int i = 1; i <= animalCount; i++) {
            Elephant a = new Elephant();
            a.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(a);
            System.out.println("Adding new Elephant into enclosure 3");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " Bear");
        for (int i = 1; i <= animalCount; i++) {
            Bear a = new Bear();
            a.setEnclosure(enclosures[3]);
            enclosures[3].addAnimal(a);
            System.out.println("Adding new Bear into enclosure 4");
        }
        animalCount = (int) (Math.random() * 10);
        System.out.println("Creating " + animalCount + " Penguin");
        for (int i = 1; i <= animalCount; i++) {
            Penguin a = new Penguin();
            a.setEnclosure(enclosures[4]);
            enclosures[4].addAnimal(a);
            System.out.println("Adding new Penguin into enclosure 5");
        }
    }

    public ArrayList<Food> getMenu() {
        return foods;
    }

    public void aMonthPasses() {
        for (ZooKeeper z : zooKeepers) {
            z.aMonthPasses();
        }

        for (Enclosure enc : enclosures) {
            enc.aMonthPasses();
        }
    }

}
