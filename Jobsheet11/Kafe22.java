package Jobsheet11;

import java.util.Scanner;

public class Kafe22 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember){
        System.out.println("Selamat datang " + namaPelanggan + "!");
        if (kodePromo == "DISKON50") {
            System.out.println("Selamat kamu mendapatkan diskon 50%");
        }else if (kodePromo == "DISKON30") {
            System.out.println("Selamat kamu mendapatkan diskon 50%");
        }else{
            System.out.println("Kode Invalid");
        }

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("=====MENU RESYO KAFE=====");
        System.out.println("1. Kopi Hitam - Rp 15,00");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga22(int pilihanMenu, int banyakItem, String kodePromo){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        // return hargaTotal;
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Skamu mendapatkan diskon menjadi " + diskon);
        }else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Skamu mendapatkan diskon menjadi " + diskon);
        }else{
            System.out.println("Kode Invalid");
        }

        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan kode Promo");
        String kodePromo = sc.nextLine();

        Menu("Andi", kodePromo , true);

        System.out.println("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga22(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
