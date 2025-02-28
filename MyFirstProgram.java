import java.util.Scanner; // Library untuk input dari user
import java.util.ArrayList; // Library untuk membuat ArrayList
import java.util.Arrays; // Library untuk mengubah array menjadi list
import java.util.Random; // Library untuk random angka

public class MyFirstProgram {
    public static void main(String[] args) {
        // Tampilan Welcome
        System.out.println("╔═════════════════════════╗");
        System.out.println("║" + "\033[1;33m" + "  WELCOME TO FUNFACTS!  " + "\033[0m" + "║");
        System.out.println("╚═════════════════════════╝");

        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Input nama user
        System.out.print("\033[1;34mMasukkan nama Anda: \033[0m");
        String nama = scanner.nextLine();
        System.out.println("\033[1;36mSelamat datang, " + nama + "!\033[0m");

        // List fun fact menggunakan ArrayList
        ArrayList<String> funFacts = new ArrayList<>(Arrays.asList(
            "Java awalnya disebut Oak.",
            "Java diciptakan oleh James Gosling pada tahun 1995.",
            "Java adalah bahasa pemrograman yang dapat berjalan di berbagai platform.",
            "Moto Java adalah 'Write Once, Run Anywhere'.",
            "Java digunakan dalam pengembangan Android.",
            "Java memiliki Garbage Collector untuk manajemen memori.",
            "Java adalah salah satu bahasa pemrograman yang paling populer di dunia.",
            "Java memiliki pustaka yang sangat kaya dan luas.",
            "Java menggunakan sintaks yang mirip dengan C++.",
            "Java mendukung pemrograman berorientasi objek.",
            "Java Virtual Machine (JVM) membuat Java lebih fleksibel.",
            "Java sering digunakan dalam pengembangan sistem enterprise.",
            "Java mendukung multithreading dengan mudah.",
            "Java digunakan oleh perusahaan besar seperti Google, Amazon, dan Netflix.",
            "Java mendukung Lambda Expression sejak Java 8.",
            "Java digunakan di lebih dari 3 miliar perangkat.",
            "Minecraft dibuat menggunakan Java.",
            "Java adalah bahasa pemrograman open source.",
            "Framework Spring Boot sangat populer untuk backend.",
            "Android Studio menggunakan Java sebagai bahasa utama.",
            "Java memiliki konsep Inheritance dalam OOP.",
            "Netflix menggunakan Java untuk layanan streaming.",
            "Java mendukung JSON Parsing.",
            "Logo Java terinspirasi dari kopi Jawa.",
            "Java digunakan dalam pengembangan aplikasi perbankan.",
            "Java mendukung fitur File Handling.",
            "Semua kode Java ditulis dalam class.",
            "Bahasa Kotlin kompatibel dengan Java.",
            "Java mendukung database seperti MySQL dan MongoDB.",
            "Java memiliki fitur Exception Handling."
        ));


        ArrayList<String> unknownFacts = new ArrayList<>(funFacts);
        Random random = new Random(); // Objek Random

        // Loop untuk menampilkan fun fact
        while (!unknownFacts.isEmpty()) {
            int index = random.nextInt(unknownFacts.size());

            // Menampilkan fun fact dengan warna hijau
            System.out.println("\033[1;32mFun Fact: " + unknownFacts.get(index) + "\033[0m");

            // Pertanyaan input dengan warna ungu
            System.out.print("\033[1;35mApakah Anda sudah tahu fakta ini? (y/n/exit): \033[0m");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y")) {
                unknownFacts.remove(index);
                System.out.println("\033[1;32mBaik, kita lanjut ke fakta berikutnya!\033[0m");
            } else if (input.equals("n")) {
                System.out.println("\033[1;36mMenarik, ya? Sekarang Anda tahu!\033[0m");
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("\033[1;31mPilihan tidak valid! Silakan ketik 'y', 'n', atau 'exit'.\033[0m");
            }
        }

        // Pesan jika fun fact habis
        if (unknownFacts.isEmpty()) {
            System.out.println("\033[1;33mMaaf, fun fact-nya sudah habis! 😢\033[0m");
        }

        // Pesan Terima Kasih
        System.out.println("\033[1;32mTerima kasih telah memainkan game ini, " + nama + "!\033[0m");

        // Menampilkan versi Java
        String versiJava = System.getProperty("java.version");
        System.out.println("\033[1;31mVersi Java yang Anda gunakan: " + versiJava + "\033[0m");

        scanner.close();
    }
}