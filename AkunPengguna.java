import java.util.Scanner;

public class AkunPengguna {
    private String username;
    private String password;
    private boolean aktif;

    // Konstruktor untuk inisialisasi atribut akun
    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false; // Saat pertama kali, akun belum aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfoAkun() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun berhasil diaktifkan.");
            aktif = true;
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (aktif) {
            System.out.println("Akun berhasil dinonaktifkan.");
            aktif = false;
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek akun
        AkunPengguna akun1 = new AkunPengguna("jayjo", "kulbet");

        // Menampilkan informasi akun sebelum diaktifkan
        System.out.println("Informasi akun sebelum diaktifkan:");
        akun1.tampilkanInfoAkun();

        // Mengaktifkan akun
        akun1.aktifkanAkun();

        // Menampilkan informasi akun setelah diaktifkan
        System.out.println("\nInformasi akun setelah diaktifkan:");
        akun1.tampilkanInfoAkun();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();

        // Menampilkan informasi akun setelah dinonaktifkan
        System.out.println("\nInformasi akun setelah dinonaktifkan:");
        akun1.tampilkanInfoAkun();
    }
}
