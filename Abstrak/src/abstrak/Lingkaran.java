/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author HP
 */
public class Lingkaran extends BangunDatar{
    public int jariJari;
    
    @Override
    public void hitungLuas(){
        this.luas = 2*Math.PI*jariJari*jariJari;
    }
    @Override
    public void hitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
    
}
