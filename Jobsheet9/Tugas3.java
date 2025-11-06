import java.util.Scanner;
public class Tugas3{
    public static void main(String[]args){
        import java.util.Scanner;

public class CariMenuKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ketemu = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ketemu = true;
                posisi = i;
                break;
            }
        }

        System.out.println();
        if (ketemu) {
            System.out.println( cari + " tersedia di menu (urutan ke-" + (posisi + 1) + ")");
        } else {
            System.out.println("Maaf, " + cari + " tidak ada di menu.");
        }
    }
}