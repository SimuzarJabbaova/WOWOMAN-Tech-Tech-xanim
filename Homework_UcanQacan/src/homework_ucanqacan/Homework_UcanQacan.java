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
public class Homework_UcanQacan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uzen[] a = new Uzen[4];
        Qachan[] b = new Qachan[4];
        Yeriyen[] c = new Yeriyen[4];
        Uchan[] d = new Uchan[4];
        Object[] arr = new Object[4];
        arr[0] = new Insan();
        arr[1] = new Balina();
        arr[2] = new Ordek();
        arr[3] = new Serche();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] instanceof Uzen) {
                a[i] = (Uzen) arr[i];
            }
            if (arr[i] instanceof Qachan) {
                b[i] = (Qachan) arr[i];
            }
             if (arr[i] instanceof Yeriyen) {
                c[i] = (Yeriyen) arr[i];
            }
              if (arr[i] instanceof Uchan) {
                d[i] = (Uchan) arr[i];
            }
        }
        for (Uzen i : a) 
        {
            if (i!=null)
            i.uzmek();
        }
        for (Qachan i : b) {
            if (i!=null)
            i.qachmaq();            
        }
        for (Yeriyen i : c) {
            if (i!=null)
            i.yerimek();
        }
        
        for (Uchan i : d) {
            if (i!=null)
            i.uchmaq();            
        }
    }

}
