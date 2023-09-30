package com.juaracoding;

import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji awal: ");
        double gajiAwal = scanner.nextDouble();

        double pajak;
        if (gajiAwal >= 7000) {
            // Hitung pajak 10%
            pajak = 0.1 * gajiAwal;
            double gajiBersih = gajiAwal - pajak;

            System.out.println("Gaji awal: " + gajiAwal);
            System.out.println("Pajak: " + pajak);
            System.out.println("Gaji bersih: " + gajiBersih);
        } else{
            if (gajiAwal < 7000){
                pajak = 0;
                double gaji = gajiAwal;
                System.out.println("Gaji awal: " + gajiAwal);
                System.out.println("Pajak: " + pajak);
                System.out.println("Gaji bersih: " + gaji);
            }
        }
    }
}

        // Hitung gaji bersi

