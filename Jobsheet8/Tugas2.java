public class Tugas2{
    public static void main(String[] args){
        int n = 3;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("  ");
                }else{
                System.out.print(" +");
                }
            }
            System.out.println(" ");
        }

        System.out.println("------");

        int N = 5;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if ((i >= 2 && i <=4 ) && (j >= 2 && j <= 4) ) {
                    System.out.print("  ");
                }else{
                System.out.print(" +");
                }
            }
            System.out.println(" ");
        }
    }
}