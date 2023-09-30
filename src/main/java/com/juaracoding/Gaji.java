package com.juaracoding;

public class Gaji {
    public static void main(String[] args) {
        double gajiKotor = 7000;
        double pajak = hitungPajak(gajiKotor);
        double gajiBersih = gajiKotor - pajak;

        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }

    // Metode untuk menghitung pajak berdasarkan gaji kotor
    public static double hitungPajak(double gajiKotor) {
        if (gajiKotor >= 7000) {
            return 0.10 * gajiKotor;
        } else {
            return 0.0;
        }
    }
}
