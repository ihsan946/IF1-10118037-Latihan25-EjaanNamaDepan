/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan25ejaan;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * NAMA                           : Muhammad Ihsan
 * KELAS                         : IF-1
 * NIM                              : 10118037
 * Deskripsi Program   : Program ini berisi program mengeja nama depan
 *                                         
 *                                        
 */
public class IF110118037Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        
        
        
        //input
        System.out.print("Masukkan nama depan anda : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        
        // proses
        char ejaan [] = nama.toCharArray();
        
        //output
        
        for(int i = 0; i < ejaan.length ; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : " + ejaan[i]);
        }
        
    }
    
}
