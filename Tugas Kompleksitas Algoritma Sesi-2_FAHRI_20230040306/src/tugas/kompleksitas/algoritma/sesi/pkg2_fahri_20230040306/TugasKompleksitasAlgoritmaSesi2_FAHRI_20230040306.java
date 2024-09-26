/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.kompleksitas.algoritma.sesi.pkg2_fahri_20230040306;

/**
 *
 * @author User
 */
public class TugasKompleksitasAlgoritmaSesi2_FAHRI_20230040306 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan = 20;
        int hasil = 0;

        for (int i = 0; i < 2; i++) {
            hasil += bilangan;
        }

        System.out.println("Hasil dari " + bilangan + " pangkat dua adalah: " + hasil);
    }
    
}

// Analisa kompleksitas algoritma dari programan ini
// - Waktu (Time Complexity): Kompleksitas waktu adalah O(1), karena operasi perkalian dilakukan sekali
// - Ruang (Space Complexity): Kompleksitas ruang adalah O(1), karena hanya memerlukan ruang untuk variabel number dan hasil.

// Simulasi perhitungan data : pada setiap iterasi program menambahkan nilai number ke dalam variabel bilangan. Berikut adalah simulasi perhitungan untuk input number = 20:
