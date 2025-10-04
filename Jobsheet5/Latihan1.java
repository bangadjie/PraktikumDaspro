package Jobsheet5;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("===Selamat datang di perpustakaan kampus===");
        System.out.println("Masuk Perpustakaan (Ktm/Register)");
        String Kehadiran = sc.nextLine();

        if (Kehadiran.equalsIgnoreCase("ktm")) {
            System.out.println("Anda berhasil masuk menggunakan Ktm");
        }else if(Kehadiran.equalsIgnoreCase("Register")){
            System.out.println("Anda berhasil masuk menggunakan Register");
        }else{
            System.out.println("Anda tidak terdaftar");
        }
    }
}
