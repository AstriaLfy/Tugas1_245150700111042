public class main {
    public static void main(String[] args) {
        // Membuat objek studio
        studio studio1 = new studio();
        studio studio2 = new studio();
        studio studio3 = new studio();

        // Membuat objek film
        film film1 = new film();
        film film2 = new film();
        film film3 = new film();

        // Membuat objek tiket
        tiket tiket1 = new tiket();
        tiket tiket2 = new tiket();
        tiket tiket3 = new tiket();

        // Membuat objek penonton
        penonton penonton1 = new penonton();
        penonton penonton2 = new penonton();
        penonton penonton3 = new penonton();

        studio1.setStudio(1);
        studio1.setFilm("Surat Cinta dari Masa Depan");
        studio1.setKapasitas(60);
        studio1.displayInfo(" ");

        film1.setjudul("Surat Cinta dari Masa Depan");
        film1.setgenre("Romance");
        film1.setjamTayang(14); // 14:00 dalam format 24 jam
        film1.sethargaTiket(40000);
        film1.displayInfo();

        studio2.setStudio(2);
        studio2.setFilm("Petualangan di Ujung Dunia");
        studio2.setKapasitas(80);
        studio2.displayInfo(" ");

        film2.setjudul("Petualangan di Ujung Dunia");
        film2.setgenre("Adventure");
        film2.setjamTayang(16); // 16:00 dalam format 24 jam
        film2.sethargaTiket(50000);
        film2.displayInfo();

        studio3.setStudio(3);
        studio3.setFilm("Komedi Keluarga");
        studio3.setKapasitas(100);
        studio3.displayInfo(" ");

        film3.setjudul("Komedi Keluarga");
        film3.setgenre("Comedy");
        film3.setjamTayang(18); // 18:00 dalam format 24 jam
        film3.sethargaTiket(30000);
        film3.displayInfo();

        penonton1.setNama("Alice");
        penonton2.setNama("Bob");
        penonton3.setNama("Charlie");

        tiket1.setNoTiket(1);
        tiket1.setNamaFilm(film1.judul);
        tiket1.setStudio("Studio 1");
        tiket1.setNomorKursi(5);
        tiket1.setPenonton(penonton1.nama);
        tiket1.displayInfo();

        tiket2.setNoTiket(2);
        tiket2.setNamaFilm(film2.judul);
        tiket2.setStudio("Studio 2");
        tiket2.setNomorKursi(10);
        tiket2.setPenonton(penonton2.nama);
        tiket2.displayInfo();

        tiket3.setNoTiket(3);
        tiket3.setNamaFilm(film3.judul);
        tiket3.setStudio("Studio 3");
        tiket3.setNomorKursi(15);
        tiket3.setPenonton(penonton3.nama);
        tiket3.displayInfo();
    }
}