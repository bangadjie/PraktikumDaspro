import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTiket = 50000;
        int hargaTiketTerjual = 0, totalTIketTerjual = 0;
        double Diskon = 0;

        while (true) {
            System.out.println("Masukkan Jumlah Tiket : " );
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("jumlah Tiket tidak valid, silahkan ulangi mengisi");
                continue;
            }
            
            double totalHarga = jmlTiket * hargaTiket;
            if (jmlTiket > 10) {
                Diskon = 0.15;
                System.out.println("Anda mendapatkan diskon 15%");
            }else if (jmlTiket > 4) {
                Diskon = 0.10;
                System.out.println("Anda mendapatkan diskon 10%");
            }

            totalHarga -= totalHarga * Diskon;

            totalTIketTerjual += jmlTiket;
            hargaTiketTerjual += hargaTiket;

            System.out.println("Total harga untuk jumlah tiket : " + jmlTiket + " Rp " + totalHarga);
        }

        System.out.println("=======================================================================");
        System.out.println("Total tiket yang terjual : "+totalTIketTerjual);
        System.out.println("Total penjualan tiket hari ini : "+hargaTiketTerjual);
    }
}