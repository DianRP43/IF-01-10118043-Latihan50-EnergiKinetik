/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan50.energikinetik;

/**
 *
 * @author user
 */
public class EnergiKinetik {
    private final double m = 145;
    private final double k = 25;
    
    public double ek(double m, double k){
        return m * k / 2;
         
    }
    public double usaha(double m, double k){
        return ek(m, k) - (m * 0 / 2);        
    }
    public void cetak(){
        System.out.println("massa      : "+m);
        System.out.println("kecepatan  : "+k);
        System.out.println("E. Kinetik : "+ek(m, k));
        System.out.println("Usaha      : "+usaha( m, k));
    }
}
