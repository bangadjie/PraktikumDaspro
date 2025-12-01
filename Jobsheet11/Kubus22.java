package Jobsheet11;
import java.util.Scanner;
public class Kubus22 {
    public static int[] hitungKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        int luasPermukaan = 6 * sisi * sisi;

        return new int[] { volume, luasPermukaan };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();
        int[] hasil = hitungKubus(sisi);

        System.out.println("Volume Kubus : " + hasil[0]);
        System.out.println("Luas Permukaan Kubus : " + hasil[1]);
    }
}
