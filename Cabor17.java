import java.util.Scanner;
public class Cabor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
            System.out.print("Jumlah Politeknik yang mengikuti Porseni " + " : ");
            int jmlpoltek = sc.nextInt();
            sc.nextLine();
            System.out.println();

            for (i=1; i<=jmlpoltek; i++) {
                System.out.println("==== POLITEKNIK KE " + i + " ==== ");
                System.out.print("Masukkan nama politeknik ke " + i + " : ");
                String nmpoltek = sc.nextLine();
                System.out.println();

                System.out.println("==== CABANG OLAHRAGA BADMINTON ====");
                for (int j=1; j<=5; j++) {
                    System.out.print("Nama atlet cabor badminton ke " + j + " : ");
                    String badminton = sc.nextLine();
                }
                System.out.println();
                System.out.println("==== CABANG OLAHRAGA TENIS MEJA ====");
                for (int k=1; k<=5; k++) {
                    System.out.print("Nama atlet cabor tenis meja ke " + k + " : ");
                    String tenismeja = sc.nextLine();
                }
                System.out.println();
                System.out.println("==== CABANG OLAHRAGA BASKET ====");
                for (int l=1; l<=5; l++) {
                    System.out.print("Nama atlet cabor basket ke " + l + " : ");
                    String basket = sc.nextLine();
                }
                System.out.println();
                System.out.println("==== CABANG OLAHRAGA VOLY ====");
                for (int m=1; m<=5; m++) {
                    System.out.print("Nama atlet cabor voly ke " + m + " : ");
                    String voly = sc.nextLine(); 
                }
                System.out.println();
            
        

        }



    }
}
