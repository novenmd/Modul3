import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
        boolean x = true;
        if (x) {
            System.out.println("Ini adalah blok if");
        } else {
            System.out.println("Ini adalah blok else");
        }

        int a = 10;
        if (a > 5) {
            System.out.println("a lebih besar dari 5");
        } else {
            System.out.println("a lebih kecil 5");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka: ");
        int nilai = input.nextInt();

        if (nilai > 80) {
            System.out.println("nilai anda A");
        } else if (nilai >= 70) {
            System.out.println("nilai anda B");
        } else if (nilai > 60) {
            System.out.println("nilai anda C");
        } else if (nilai > 50) {
            System.out.println("nilai anda D");
        } else {
            System.out.println("nilai anda E");
        }

        input.close();
    }
}