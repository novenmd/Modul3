import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan ID Karyawan: ");
    String idKaryawan = input.nextLine();

    System.out.println("Masukkan Nama Karyawan: ");
    String namaKaryawan = input.nextLine();

    System.out.println("Masukkan Shift Kerja dari Karyawan (pagi/siang/malam): ");
    String shift = input.nextLine().toLowerCase();

    System.out.println("Masukkan Total Jam Kerja Karyawan dalam Kurun Seminggu: ");
    int jamKerjaKaryawan = input.nextInt();

    System.out.println("Masukkan Jumlah Hari Absen Karyawan: ");
    int hariAbsenKaryawan = input.nextInt();

    double tarifPerJam;
    switch (shift) {
        case "pagi" :
            tarifPerJam = 60000;
            break;
        case "siang" :
            tarifPerJam = 65000;
            break;
        case "malam" : 
            tarifPerJam = 70000;
            break;
        default:

    System.out.println("Shift tidak sesuai/tidak valid.");
        return;
    }

    double gajiKaryawan;
    if (jamKerjaKaryawan > 40) {
        int jamLemburKaryawan = jamKerjaKaryawan - 40;
        gajiKaryawan = (40 * tarifPerJam) + (jamLemburKaryawan * tarifPerJam * 1.5);
    } else {
        gajiKaryawan = jamKerjaKaryawan * tarifPerJam;
    }

    if (jamKerjaKaryawan < 30) {
        gajiKaryawan *= 0.9;
    }

    double potonganAbsenKaryawan = hariAbsenKaryawan * 100000;
    gajiKaryawan -= potonganAbsenKaryawan;

    System.out.println("\n====== LAPORAN GAJI KARYAWAN ======");
    System.out.println("ID Karyawan: " + idKaryawan);
    System.out.println("Nama: " + namaKaryawan);
    System.out.println("Shift: " + shift);
    System.out.println("Total Jam: " + jamKerjaKaryawan + " jam");
    System.out.println("Hari Absen Karyawan: " + hariAbsenKaryawan + " hari");
    System.out.println("Total Gaji: Rp" + gajiKaryawan);

    input.close();

    }
}
