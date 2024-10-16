import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0;
        double totalPenjualan = 0;
        final int hargaTiket = 50000;
        int jumlahTiket;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;  
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;  
            }
            double totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                totalHarga *= 0.85; 
                System.out.println("Anda mendapatkan diskon 15%");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;  
                System.out.println("Anda mendapatkan diskon 10%");
            }
            totalTiket += jumlahTiket; 
            totalPenjualan += totalHarga;  
            System.out.println("Total harga tiket untuk " + jumlahTiket + " tiket: Rp " + totalHarga);
        }
        System.out.println("\nTotal tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
    }
}
