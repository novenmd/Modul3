import java. util.Scanner;
public class App{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja pelanggan: ");
        double totalBelanjaPelanggan = input.nextDouble();

        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/Tidak Ada): ");
        String member = input.next();

        double diskonUtama = 0;
        double diskonTambahanPelanggan = 0;

        if (totalBelanjaPelanggan > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanjaPelanggan >= 250000) {
            diskonUtama = 0.10;
        }

        double totalSetelahDiskonUtama = totalBelanjaPelanggan - (totalBelanjaPelanggan * diskonUtama);

        switch (member.toLowerCase()) {
            case "platinum":
                diskonTambahanPelanggan = 0.05;
                break;
            case "gold":
                diskonTambahanPelanggan = 0.03;
                break;
                case "silver":
                diskonTambahanPelanggan = 0.02;
                break;
            default:
                diskonTambahanPelanggan = 0;
        }

        double totalBelanjaSetelahDiskonTambahan = totalSetelahDiskonUtama - (totalSetelahDiskonUtama * diskonTambahanPelanggan);

        String statusDiskonPelanggan = (diskonUtama > 0 || diskonTambahanPelanggan > 0 ) ? "Anda mendapatkan diskon tambahan!" : "Anda tidak mendapatkan diskon tambahan";

        System.out.println(statusDiskonPelanggan);
        System.out.println("Total setelah diskon: Rp " + totalBelanjaSetelahDiskonTambahan);

        input.close();
    }
}
