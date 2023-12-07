import java.util.Scanner;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    // Konstruktor untuk inisialisasi atribut buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true; // Saat pertama kali, buku tersedia untuk dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (tersedia) {
            System.out.println("Buku berhasil dipinjam.");
            tersedia = false;
        } else {
            System.out.println("Maaf, buku sedang tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Harry Potter dan Batu Bertuah", "J. K. Rowling", 1997);

        // Menampilkan informasi buku sebelum dipinjam
        System.out.println("Informasi buku sebelum dipinjam:");
        buku1.tampilkanInfoBuku();

        // Meminjam buku
        buku1.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        System.out.println("\nInformasi buku setelah dipinjam:");
        buku1.tampilkanInfoBuku();
    }
}
