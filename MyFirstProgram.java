import java.util.Scanner; // Library untuk input dari user
import java.util.ArrayList; // Library untuk membuat ArrayList
import java.util.Arrays; // Library untuk mengubah array menjadi list
import java.util.Random; // Library untuk random angka

public class MyFirstProgram {
    public static void main(String[] args) {
        // Tampilan Welcome
        System.out.println("╔════════════════════════╗");
        System.out.println("║" + "\033[1;33m" + "  WELCOME TO FUNFACTS!  " + "\033[0m" + "║");
        System.out.println("╚════════════════════════╝");

        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Input nama user
        System.out.print("\033[1;34mEnter your name: \033[0m");
        String nama = scanner.nextLine();
        System.out.println("\033[1;36mWelcome, " + nama + "!\033[0m");

        // List fun fact menggunakan ArrayList
        ArrayList<String> funFacts = new ArrayList<>(Arrays.asList(
            "Java was originally called Oak.",
            "Java was created by James Gosling in 1995.",
            "Java is a programming language that can run on multiple platforms.",
            "Java's motto is 'Write Once, Run Anywhere'.",
            "Java is used in Android development.",
            "Java has a Garbage Collector for memory management.",
            "Java is one of the most popular programming languages in the world.",
            "Java has a very rich and extensive library.",
            "Java uses a syntax similar to C++.",
            "Java supports object-oriented programming.",
            "The Java Virtual Machine (JVM) makes Java more flexible.",
            "Java is often used in the development of enterprise systems.",
            "Java supports multithreading easily.",
            "Java is used by big companies like Google, Amazon, and Netflix.",
            "Java supports Lambda Expression since Java 8.",
            "Java is used on more than 3 billion devices.",
            "Minecraft is built using Java.",
            "Java is an open source programming language.",
            "The Spring Boot framework is very popular for the backend.",
            "Android Studio uses Java as the main language.",
            "Java has the concept of Inheritance in OOP.",
            "Netflix uses Java for its streaming service.",
            "Java supports JSON Parsing.",
            "The Java logo is inspired by Javanese coffee.",
            "Java is used in the development of banking applications.",
            "Java supports the File Handling feature.",
            "All Java code is written in classes.",
            "The Kotlin language is compatible with Java.",
            "Java supports databases such as MySQL and MongoDB.",
            "Java has an Exception Handling feature."
        ));


        ArrayList<String> unknownFacts = new ArrayList<>(funFacts);
        Random random = new Random(); // Objek Random

        // Loop untuk menampilkan fun fact
        while (!unknownFacts.isEmpty()) {
            int index = random.nextInt(unknownFacts.size());

            // Menampilkan fun fact dengan warna hijau
            System.out.println("\033[1;32mFun Fact: " + unknownFacts.get(index) + "\033[0m");

            // Pertanyaan input dengan warna ungu
            System.out.print("\033[1;35mDid you already know this fact? (y/n/exit): \033[0m");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y")) {
                unknownFacts.remove(index);
                System.out.println("\033[1;32mOkay, let's move on to the next fact!\033[0m");
            } else if (input.equals("n")) {
                System.out.println("\033[1;36mInteresting, huh? Now you know!\033[0m");
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("\033[1;31mInvalid selection! Please type 'y', 'n', or 'exit'.\033[0m");
            }
        }

        // Pesan jika fun fact habis
        if (unknownFacts.isEmpty()) {
            System.out.println("\033[1;33mSorry, the fun fact is over! 😢\033[0m");
        }

        // Pesan Terima Kasih
        System.out.println("\033[1;32mThank you for playing this game, " + nama + "!\033[0m");

        // Menampilkan versi Java
        String versiJava = System.getProperty("java.version");
        System.out.println("\033[1;31mThe version of Java you are using: " + versiJava + "\033[0m");

        scanner.close();
    }
}