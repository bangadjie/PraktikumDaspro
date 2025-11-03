package PraktikumDaspro.Jobsheet5;

import java.util.Scanner;

public class ifCetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (True/False): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else{
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        String hasil = (uktLunas) 
            ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println("\n=== Versi Ternary Operator ===");
        System.out.println(hasil);
        sc.close();
    }
}
