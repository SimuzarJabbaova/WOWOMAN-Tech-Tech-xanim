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
public class Ordek implements Uzen,Yeriyen,Qachan,Uchan {

    @Override
    public void uzmek() {
      System.out.println("Ordek uze bilir."); }

    @Override
    public void yerimek() {
     System.out.println("Ordek yeriye bilir.");}

    @Override
    public void qachmaq() {
        System.out.println("Ordek qaca bilir.");}

    @Override
    public void uchmaq() {
       System.out.println("Ordek ucha bilir.");}
    
}
