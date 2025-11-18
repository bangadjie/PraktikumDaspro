import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JML_RESPONDEN = 10;
        final int JML_PERTANYAAN = 6;
        int[][] hasilSurvey = new int[JML_RESPONDEN][JML_PERTANYAAN];

        double totalKeseluruhan = 0; 
        System.out.println("--- INPUT HASIL SURVEY KEPADUAN PELANGGAN ---");
        System.out.println("Skala Nilai: 1 (Sangat Tidak Puas) - 5 (Sangat Puas)");

        for (int i = 0; i < JML_RESPONDEN; i++) {
            System.out.println("\nInput Jawaban Responden ke-" + (i + 1) + ":");

            for (int j = 0; j < JML_PERTANYAAN; j++) {
                int nilai;
                do {
                    System.out.print("Nilai Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai tidak valid. Harap masukkan antara 1 hingga 5.");
                    }
                } while (nilai < 1 || nilai > 5);

                hasilSurvey[i][j] = nilai;
            }
        }
        sc.nextLine();

        System.out.println("\n==============================================");
        System.out.println("B. RATA-RATA NILAI UNTUK SETIAP RESPONDEN");
        System.out.println("==============================================");

        for (int i = 0; i < JML_RESPONDEN; i++) {
            double totalResponden = 0;
            for (int j = 0; j < JML_PERTANYAAN; j++) {
                totalResponden += hasilSurvey[i][j];
            }
            double rataRataResponden = totalResponden / JML_PERTANYAAN;
            System.out.printf("Rata-rata Responden ke-%d: %.2f\n", (i + 1), rataRataResponden);

            totalKeseluruhan += totalResponden;
        }

        System.out.println("\n==============================================");
        System.out.println("C. RATA-RATA NILAI UNTUK SETIAP PERTANYAAN");
        System.out.println("==============================================");

        for (int j = 0; j < JML_PERTANYAAN; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < JML_RESPONDEN; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / JML_RESPONDEN;
            System.out.printf("Rata-rata Pertanyaan ke-%d: %.2f\n", (j + 1), rataRataPertanyaan);
        }

        double jumlahTotalData = JML_RESPONDEN * JML_PERTANYAAN;
        double rataRataKeseluruhan = totalKeseluruhan / jumlahTotalData;

        System.out.println("\n==============================================");
        System.out.println("D. RATA-RATA NILAI KESELURUHAN");
        System.out.println("==============================================");
        System.out.printf("Rata-rata Nilai Survey Keseluruhan: %.2f\n", rataRataKeseluruhan);
    }
}