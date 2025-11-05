
import java.util.Scanner;
import java.util.Random;

public class PersentaseJodoh {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Input nama pasangan
        System.out.print("Masukkan nama pasangan pertama: ");
        String nama1 = scanner.nextLine();
        System.out.print("Masukkan nama pasangan kedua: ");
        String nama2 = scanner.nextLine();

        // Hitung persentase jodoh secara random
        int persentase = random.nextInt(100) + 1;

        // Tampilkan hasil
        System.out.println("\nPasangan: " + nama1 + " & " + nama2);
        System.out.println("Persentase Jodoh: " + persentase + "%");

        // Komen tentang hasil
        if (persentase > 80) {
            System.out.println("Jodoh sejati! 💕");
        } else if (persentase > 50) {
            System.out.println("Cocok, tapi perlu usaha! 😊");
        } else {
            System.out.println("Mungkin masih perlu banyak usaha... 😔");
        }

        scanner.close();
    }
}