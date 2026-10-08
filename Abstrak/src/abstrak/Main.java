/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+stsk.keliling);
        
        SegiEmpat se = new SegiEmpat();
        se.panjang = 10;
        se.lebar = 4;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas SE = "+se.luas);
        System.out.println("Keliling SE = "+se.keliling);
        
        Lingkaran l = new Lingkaran();
        l.jariJari = 10;
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("Luas L = "+l.luas);
        System.out.println("Keliling L = "+l.keliling);

        
    }
    
}
