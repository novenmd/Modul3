import java.util.Scanner;
public class HurufVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input kalimat dari pengguna: ");
        String x = input.nextLine();

        int hurufVokal = 0;
        char ch;

        for (int i = 0; i < x.length(); i++) {
            ch = Character.toLowerCase(x.charAt(i));
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                hurufVokal++;
            }
        }

        switch (hurufVokal % 2) {
            case 0:
                System.out.println("Jumlah huruf vokal pada kalimat dari pengguna: " + hurufVokal);
                System.out.println("Jumlah vokal genap");
                break;
            case 1:
                System.out.println("Jumlah huruf vokal pada kalimat dari pengguna: " + hurufVokal);
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        System.out.print("Kalimat terbalik: ");
        char[] charArray = x.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println(); 
        input.close();
    }
}
