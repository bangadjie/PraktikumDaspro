package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe22 {
    static String[] menu;
    static int[][] penjualan = new int[5][7];

    static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu            : ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan jumlah hari penjualan  : ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
        System.out.println("\n=== INPUT DATA PENJUALAN ===");

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int h = 0; h < jumlahHari; h++) {
                System.out.print("  Hari ke-" + (h + 1) + ": ");
                penjualan[i][h] = sc.nextInt();
            }
        }
    }

    static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");

        for (int h = 0; h < 7; h++) {
            System.out.printf("Hari-%d\t", h + 1);
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int h = 0; h < 7; h++) {
                System.out.printf("%d\t", penjualan[i][h]);
            }
            System.out.println();
        }
    }

    static void menuTertinggi() {
        int maxTotal = 0;
        String menuMax = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\n=== MENU TERLARIS ===");
        System.out.println("Menu: " + menuMax);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    static void rataRataMenu() {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < menu.length; i++) {
            double total = 0;
            for (int h = 0; h < 7; h++) {
                total += penjualan[i][h];
            }
            double rata = total / 7.0;

            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilkanTabel();
        menuTertinggi();
        rataRataMenu();
    }
}
