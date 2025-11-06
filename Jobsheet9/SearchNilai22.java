import java.util.Scanner;
public class SearchNilai22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int jmlNilai;
        int key;
        int hasil = -1;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        jmlNilai = sc.nextInt();

        int[] arrNilai = new int[jmlNilai];
        
        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan Nilai yang kamu cari = ");
        key = sc.nextInt();

        for(int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ada, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}