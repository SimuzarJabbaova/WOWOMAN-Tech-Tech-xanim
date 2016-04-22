/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkcopytotarget;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Dictionary;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class HomeworkCopyToTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String src = "";
        String target = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file or directory: ");
        src = sc.nextLine();
        System.out.println("Enter target directory: ");
        target = sc.nextLine();
        System.out.println();
        copyFile(src, target);
    }
    // D:\DERSLER\Java

    static void copyFile(String src, String target) {
        File srcFile = new File(src);
        File targetFile = new File(target);
        File a;
        try {
            if (!srcFile.exists()) {
                System.out.println("Source file does not exist. Copy proses stopped.");
                return;
            }
            if (!targetFile.isDirectory()) {
                System.out.println("Unknown directory. Copy proses stopped.");
                return;
            } else if (srcFile.isDirectory()) {
                File[] files = srcFile.listFiles();
                System.out.println("Copying proses is started ...");
                for (File f1 : files) {
                    System.out.println(target + f1.getPath().substring(src.length()));
                    a = new File(target + f1.getPath().substring(src.length()));
                    try {
                        a.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("Error text : " + ex.toString());
                    }
                    try {
                        Files.copy(f1.toPath(), a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        System.out.println("Error text : " + ex.toString());
                    }
                    if (f1.isDirectory()) {
                        copyFile(f1.getPath(), targetFile.getPath() + f1.getPath().substring(src.length()));
                    }
                }
            } else {
                System.out.println("Copying proses is started ...");
                System.out.println(target + File.separator + srcFile.getName());
                a = new File(target + File.separator + srcFile.getName());
                try {
                    a.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error text : " + ex.toString());
                }

                try {
                    Files.copy(srcFile.toPath(), a.toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    Logger.getLogger(HomeworkCopyToTarget.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            System.out.println("Copying proses finished!!!");
        } catch (Exception ex) {
            System.out.println("Copying proses cancelled.");
        }
    }
}
