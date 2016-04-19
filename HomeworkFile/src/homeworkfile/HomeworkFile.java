/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkfile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HomeworkFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rootFile = "";
        System.out.println("Enter root dictionary: ");
        Scanner sc = new Scanner(System.in);
        rootFile = sc.nextLine();
        System.out.println();
        printRecursive(rootFile);
    }

    static void printRecursive(String name) {

        File f = new File(name);
        if (f.exists()) {
            if (f.isDirectory()) {
                File[] files = f.listFiles();
                for (File f1 : files) {
                    System.out.println(f1.getPath());
                    if (f1.isDirectory()) {
                        printRecursive(f1.getPath());
                    }
                }
            } else {
                System.out.println(f.getPath());
            }
        } else System.out.println("Dictionary or file does not exists!");
    }

}
