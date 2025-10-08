// Class Film sebagai blueprint/kerangka untuk membuat objek film
public class Film {
    // Atribut atau properti dari sebuah film
    private String judul;
    private String genre;
    private int durasi; // dalam menit

    // ---------------- CONSTRUCTOR ----------------
    
    // No-argument constructor (tanpa parameter)
    // Digunakan jika kita membuat objek tanpa memberi nilai awal
    public Film() {
        this.judul = "Belum ada judul";
        this.genre = "Tidak diketahui";
        this.durasi = 0;
    }

    // Parameterized constructor (dengan parameter)
    // Digunakan jika kita ingin langsung memberi nilai ke atribut film
    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    // ---------------- METHOD ----------------
    
    // Method untuk menampilkan informasi film
    public void tampilkanInfo() {
        System.out.println("Judul : " + judul);
        System.out.println("Genre : " + genre);
        System.out.println("Durasi: " + durasi + " menit");
    }

    // ---------------- METHOD OVERLOADING ----------------
    
    // Overloading 1: hanya ganti judul
    public void updateFilm(String judul) {
        this.judul = judul;
    }

    // Overloading 2: ganti judul dan genre
    public void updateFilm(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    // Overloading 3: ganti judul, genre, dan durasi
    public void updateFilm(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }
}


// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        
        // Membuat object film1 menggunakan no-argument constructor
        // Nilainya otomatis default
        Film film1 = new Film();
        film1.tampilkanInfo();

        System.out.println("--------------------");

        // Membuat object film2 menggunakan parameterized constructor
        // Nilainya langsung diisi saat objek dibuat
        Film film2 = new Film("Inception", "Sci-Fi", 148);
        film2.tampilkanInfo();

        System.out.println("--------------------");

        // Memanggil method overloading updateFilm
        // Versi 1: hanya ganti judul
        film2.updateFilm("Interstellar");
        film2.tampilkanInfo();

        System.out.println("--------------------");

        // Versi 2: ganti judul dan genre
        film2.updateFilm("The Dark Knight", "Action");
        film2.tampilkanInfo();

        System.out.println("--------------------");

        // Versi 3: ganti semua (judul, genre, durasi)
        film2.updateFilm("Oppenheimer", "Drama", 180);
        film2.tampilkanInfo();
    }
}
