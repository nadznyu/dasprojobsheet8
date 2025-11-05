import java.util.Scanner;
public class PersegiAngka17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3) = ");
        int N = sc.nextInt();

        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= N; y++) {
                if (x == 1 || x == N || y == 1 || y == N) {
                    System.out.print(N+ "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }   
        

        }
    }

