import java.util.Scanner;
public class CM1_Adjie{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String Nama = sc.nextLine();
        System.out.print("NIM : ");
        long NIM = sc.nextLong();

        String nilaiHuruf1 = "";
        String nilaiHuruf2 = "";
        String nilaiHuruf3 = "";
        String Status1 = "";
        String Status2 = "";
        String Status3 = "";
        String StatusSmtr = "";
        String nilaiPerbandingan = "";
        
        System.out.println("=== Mata Kuliah 1: Algoritma dan Pemrograman ===");
        // Whele
        System.out.print(" Masukkan nilai UTS : ");
        int nilaiUts1 = sc.nextInt();
        System.out.print(" Masukkan nilai UAS : ");
        int nilaiUas1 = sc.nextInt();
        System.out.print(" Masukkan nilai Tugas : ");
        int nilaiTgs1 = sc.nextInt();
        double nilaiAkhir1 = (nilaiUts1 * 0.3) + (nilaiUas1 * 0.4) + (nilaiTgs1 * 0.3) ;

        if (80 < nilaiAkhir1 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
        }else if(73 < nilaiAkhir1 && nilaiAkhir1 <= 80){
            nilaiHuruf1 = "B+";
        }else if(65 < nilaiAkhir1 && nilaiAkhir1 <= 73){
            nilaiHuruf1 = "B";
        }else if(60 < nilaiAkhir1 && nilaiAkhir1 <= 65){
            nilaiHuruf1 = "C+";
        }else if(50 < nilaiAkhir1 && nilaiAkhir1 <= 60){
            nilaiHuruf1 = "C";
        }else if(39 < nilaiAkhir1 && nilaiAkhir1 <= 50){
            nilaiHuruf1 = "D";
        }else if(0 < nilaiAkhir1 && nilaiAkhir1 <= 39){
            nilaiHuruf1 = "E";
        }

        // While
        if (nilaiAkhir1 < 60) {
            Status1 = "Tidak Lulus";
        }else{
            Status1 = "Lulus";
        }
        
        System.out.println("=== Mata Kuliah 2: Struktur Data ===");
        System.out.print(" Masukkan nilai UTS : ");
        int nilaiUts2 = sc.nextInt();
        System.out.print(" Masukkan nilai UAS : ");
        int nilaiUas2 = sc.nextInt();
        System.out.print(" Masukkan nilai Tugas : ");
        int nilaiTgs2 = sc.nextInt();
        double nilaiAkhir2 = (nilaiUts2 * 0.3) + (nilaiUas2 * 0.4) + (nilaiTgs2 * 0.3) ;

        if (80 < nilaiAkhir2 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
        }else if(73 < nilaiAkhir2 && nilaiAkhir2 <= 80){
            nilaiHuruf2 = "B+";
        }else if(65 < nilaiAkhir2 && nilaiAkhir2 <= 73){
            nilaiHuruf2 = "B";
        }else if(60 < nilaiAkhir2 && nilaiAkhir2 <= 65){
            nilaiHuruf2 = "C+";
        }else if(50 < nilaiAkhir2 && nilaiAkhir2 <= 60){
            nilaiHuruf2 = "C";
        }else if(39 < nilaiAkhir2 && nilaiAkhir2 <= 50){
            nilaiHuruf2 = "D";
        }else if(0 < nilaiAkhir2 && nilaiAkhir2 <= 39){
            nilaiHuruf2 = "E";
        }

        if (nilaiAkhir2 < 60) {
            Status2 = "Tidak Lulus";
        }else{
            Status2 = "Lulus";
        }

        System.out.println("=== Mata Kuliah 3: Matematika ===");
        // Whele
        System.out.print(" Masukkan nilai UTS : ");
        int nilaiUts3 = sc.nextInt();
        System.out.print(" Masukkan nilai UAS : ");
        int nilaiUas3 = sc.nextInt();
        System.out.print(" Masukkan nilai Tugas : ");
        int nilaiTgs3 = sc.nextInt();
        double nilaiAkhir3 = (nilaiUts3 * 0.3) + (nilaiUas3 * 0.4) + (nilaiTgs3 * 0.3) ;

        if (80 < nilaiAkhir3 && nilaiAkhir3 <= 100) {
            nilaiHuruf3 = "A";
        }else if(73 < nilaiAkhir3 && nilaiAkhir3 <= 80){
            nilaiHuruf3 = "B+";
        }else if(65 < nilaiAkhir3 && nilaiAkhir3 <= 73){
            nilaiHuruf3 = "B";
        }else if(60 < nilaiAkhir3 && nilaiAkhir3 <= 65){
            nilaiHuruf3 = "C+";
        }else if(50 < nilaiAkhir3 && nilaiAkhir3 <= 60){
            nilaiHuruf3 = "C";
        }else if(39 < nilaiAkhir3 && nilaiAkhir3 <= 50){
            nilaiHuruf3 = "D";
        }else if(0 < nilaiAkhir3 && nilaiAkhir3 <= 39){
            nilaiHuruf3 = "E";
        }

        // While
        if (nilaiAkhir1 < 60) {
            Status1 = "Tidak Lulus";
        }else{
            Status1 = "Lulus";
        }

        double Rata_rata = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

        if ((Status1.equals("Lulus")) || (Status2.equals("Lulus"))) {
            if (Rata_rata >= 70) {
                StatusSmtr = "Lulus";
            }else if (Rata_rata < 70){
                StatusSmtr = "Tidak Lulus";
            }
        }else{
            System.out.println("Tidak Lulus");
        }
        
            if (nilaiAkhir1 > nilaiAkhir2 && nilaiAkhir1 > nilaiAkhir3) {
                nilaiPerbandingan = "Rata rata matkul 1 lebih besar dari kedua matkul";
            }else if (nilaiAkhir2 > nilaiAkhir1 && nilaiAkhir2 > nilaiAkhir3) {
                nilaiPerbandingan = "Rata rata matkul 2 lebih besar dari kedua matkul";
            }else if (nilaiAkhir3 > nilaiAkhir1 && nilaiAkhir3 > nilaiAkhir1) {
                nilaiPerbandingan = "Rata rata matkul 3 lebih besar dari kedua matkul";
            }


        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        
        System.out.println("Mata Kuliah\t\t\t\t\tUTS\t\tUAS\t\t\tTugas\t\tNilai akhir\t\tNilai Huruf\t\tStatus");
        System.out.println("===============================================");
        System.out.println("Algoritma dan Pemrograman\t\t\t" + nilaiUts1 + "\t\t" + nilaiUas1 + "\t\t\t" + nilaiTgs1 + "\t\t" + nilaiAkhir1 + "\t\t\t" + nilaiHuruf1 + "\t\t" + Status1 );
        System.out.println("Struktur Data\t\t\t\t\t" + nilaiUts2 + "\t\t" + nilaiUas2 + "\t\t\t" + nilaiTgs2 + "\t\t" + nilaiAkhir2 + "\t\t\t" + nilaiHuruf2 + "\t\t" + Status2 );
        System.out.println("Matemarika\t\t\t\t\t\t" + nilaiUts3 + "\t\t" + nilaiUas3 + "\t\t\t" + nilaiTgs3 + "\t\t" + nilaiAkhir3 + "\t\t\t" + nilaiHuruf3 + "\t\t" + Status3 );

        System.out.println("Rata - Rata Nilai Akhir : " + Rata_rata);
        System.out.println("Status Semester\t: " + StatusSmtr);
        System.out.println("Nilai 3 Perbandingan rata-rata permatkul : " + nilaiPerbandingan);
        
    sc.close();
    }
}