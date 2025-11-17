import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n--- MENU BIOSKOP ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Pilihan tidak valid. Harap masukkan angka.");
                sc.nextLine(); 
                continue;
            }
            if (menu == 1) {
                String nama;
                int baris, kolom;
                boolean kursiTerisi;

                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();

                do {
                    kursiTerisi = false;
                    System.out.print("Masukkan baris (1-4): ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Input baris harus berupa angka. Coba lagi.");
                        sc.nextLine();
                        continue;
                    }
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Input kolom harus berupa angka. Coba lagi.");
                        sc.nextLine();
                        continue;
                    }
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia. Harap masukkan baris 1-4 dan kolom 1-2.");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("⚠️ **PERINGATAN!** Kursi [" + baris + "][" + kolom + "] sudah terisi oleh penonton lain.");
                        System.out.println("Silakan masukkan baris dan kolom yang kosong kembali.");
                        kursiTerisi = true; 
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    }
                } while (kursiTerisi);

            } else if (menu == 2) {
                System.out.println("\n--- DAFTAR PENONTON ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        if (namaPenonton == null) {
                            System.out.printf("%s\t", "***");
                        } else {
                            System.out.printf("%s\t", namaPenonton);
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break; // Keluar dari loop while(true)
            } else {
                System.out.println("Menu tidak valid. Harap pilih 1, 2, atau 3.");
            }
        }
        sc.close();
    }
}