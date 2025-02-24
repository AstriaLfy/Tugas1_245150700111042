public class tiket {
    int noTiket;
    String namaFilm;
    String studio;
    int nomorKursi;
    String penonton;

    void setNoTiket(int myNoTiket) {
        noTiket = myNoTiket;
    }

    void setNamaFilm(String myNamaFilm) {
        namaFilm = myNamaFilm;
    }

    void setStudio(String myStudio) {
        studio = myStudio;
    }

    void setNomorKursi(int myNomorKursi) {
        nomorKursi = myNomorKursi;
    }
    void setPenonton(String myPenonton) {
        penonton = myPenonton;
    }

    void displayInfo() {
        System.out.println("Nomor Tiket: " + noTiket);
        System.out.println("Film: " + namaFilm);
        System.out.println("Studio: " + studio);
        System.out.println("Nomor Kursi: " + nomorKursi);
        System.out.println("Nama Penonton: " + penonton);
        System.out.println("====================================");
    }
}