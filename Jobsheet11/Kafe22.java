package Jobsheet11;
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
    public static void main(String[] args) {
        Menu("Andi","DISKON50", true);
    }
}
