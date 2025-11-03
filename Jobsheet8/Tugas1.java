public class Tugas1 {
    public static void main(String[] args){
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            int Jumlah = 0;
            System.out.print("n = " +i+" Jumlah Kuadrat = ");

            for(int j = 1; j <= i; j++) {
                Jumlah += j * j;
                
                System.out.print(j * j);
                if (j < i) {
                    System.out.print("+");
                }
            }
        System.out.println(" = " + Jumlah);
        }
    }
}