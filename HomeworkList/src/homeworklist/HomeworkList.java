/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Simuzer
 */
public class HomeworkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();
        Random rand = new Random();
        System.out.println("\tArrayList\tLinkedList");

        // Time for add method of List
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrList.add(rand.nextInt(100));
        }
        long time = System.currentTimeMillis() - start;
        System.err.print("add     " + time + "\t\t");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkList.add(rand.nextInt(100));
        }
        time = System.currentTimeMillis() - start;
        System.err.println(time);

        // Time for get method of List
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int k = rand.nextInt(arrList.size());
            arrList.get(k);
        }
        time = System.currentTimeMillis() - start;
        System.err.print("get     " + time + "\t\t");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int k = rand.nextInt(linkList.size());
            linkList.get(k);
        }
        time = System.currentTimeMillis() - start;
        System.err.println(time);

        // Time for set method of List
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int a = rand.nextInt(100);
            int k = rand.nextInt(arrList.size());
            arrList.set(k, a);
        }
        time = System.currentTimeMillis() - start;
        System.err.print("set     " + time + "\t\t");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int a = rand.nextInt(100);
            int k = rand.nextInt(linkList.size());
            linkList.set(k, a);
        }
        time = System.currentTimeMillis() - start;
        System.err.println(time);

        // Time for remove method of List
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int k = rand.nextInt(arrList.size());
            arrList.remove(k);
        }
        time = System.currentTimeMillis() - start;
        System.err.print("remove   " + time + "\t\t");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int k = rand.nextInt(linkList.size());
            linkList.remove(k);
        }
        time = System.currentTimeMillis() - start;
        System.err.println(time);

    }

}
