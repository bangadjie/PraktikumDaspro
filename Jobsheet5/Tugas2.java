package Jobsheet5;
import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Angka;

        System.out.print("Inputkan Angka : ");
        Angka = sc.nextInt();

        if (Angka % 2 == 0) {
            System.out.print("Genap");
        }else{
            System.out.println("ganjil");
        }

        sc.close();
    }
}