/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author asus
 * NAMA			: Moch Yudha Rusdian
 * KELAS		: IF-1
 * NIM			: 10118040
 * Deskripsi Program	: mengeja nama
 */
public class IF110118040Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama depan adna untuk dieja : ");
		Scanner sc = new Scanner(System.in);
		String namaLengkap = sc.next();
		System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
		for(int i = 0; i < namaLengkap.length(); i ++)
			System.out.println("Huruf ke-" + (i+1) + " : " + namaLengkap.charAt(i));
    }
    
}
