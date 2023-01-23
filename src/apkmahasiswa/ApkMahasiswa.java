/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmahasiswa;

/**
 *
 * @author HP
 */
public class ApkMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi.getKoneksi();
        new Login().setVisible(true);
    }
    
    public static void oke(){
        new Admin().setVisible(true);
    }
    public static void toProfile(){
        new Profile().setVisible(true);
    }
}
