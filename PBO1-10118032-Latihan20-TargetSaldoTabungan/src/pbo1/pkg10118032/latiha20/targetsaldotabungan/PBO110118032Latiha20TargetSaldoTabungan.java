/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latiha20.targetsaldotabungan;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Pencapain saldo target
 */
public class PBO110118032Latiha20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 3500000, saldoTarget = 6000000, saldoSekarang = saldoAwal,  bunga = 0.08;
	int bulanKe = 1;
	do {
		saldoSekarang += saldoSekarang * bunga; 
		System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulanKe, saldoSekarang);
		bulanKe++;
            } while (saldoSekarang < saldoTarget);
    }
    
}
