import java.util.Scanner;
public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0, jmlTdkLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i+ ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if(nilai >= 60){
                System.out.println("LUlus");
                jmlLulus++;
            }else{
                System.out.println("Tidak Lulus");
                jmlTdkLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Berikut untuk anak yang lulus: " + jmlLulus);
        System.out.println("Berikut untuk anak yang tidak lulus: " + jmlTdkLulus);
    }
}