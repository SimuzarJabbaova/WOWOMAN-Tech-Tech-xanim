/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_ucanqacan;

/**
 *
 * @author HP
 */
public class Insan implements Yeriyen,Qachan,Uzen{

    @Override
    public void yerimek() {
        System.out.println("Insan yeriye bilir.");}

    @Override
    public void qachmaq() {
       System.out.println("Insan qacha bilir.");}

    @Override
    public void uzmek() {
        System.out.println("Insan uze bilir.");}
    
}
