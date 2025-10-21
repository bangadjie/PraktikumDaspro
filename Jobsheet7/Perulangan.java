import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int jmlJamKerja;
        double bonus = 0.2;
        double gajiHarian, gajiBonus, totalGaji;
        
        while (true) 
        {
            System.out.println("Masukkan Jam kerja pegawai ke " + i + " Jam Kerja : ");
            jmlJamKerja = sc.nextInt();

            if (jmlJamKerja < 0) {
                System.out.println("Jam kerja kurang dari 8 jam");
                break;
            }
            System.out.println("masukkan gaji harian : ");
            gajiHarian = sc.nextDouble();

            if (jmlJamKerja > 8) {
                gajiBonus = bonus + gajiHarian;
                System.out.println(" anda mendapatkan Bonus");
            }else{
                gajiBonus = 0;
                System.out.println("Jam kerja kurang dari 8 jam");
            }
            totalGaji = gajiBonus + gajiHarian;
            
            System.out.println("Gaji anda mendapatkan bonus : " + gajiBonus);
            System.out.println("Ini total gaji anda : " + totalGaji);

            i++;
        }
    sc.close();
    }
}
