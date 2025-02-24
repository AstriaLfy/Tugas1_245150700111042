public class studio {
    int nomorStudio;
    int kapasitasKursi;
    String film;

    void setStudio(int myStud){
        nomorStudio = myStud;
    }
    void setKapasitas(int myKapasitas){
        kapasitasKursi = myKapasitas;
    }
    void setFilm(String myFilm){
        film = myFilm;
    }

    void displayInfo(String info){ //klo mau ngeprint make method void
        System.out.println("Nomor Studio: " + nomorStudio);
        System.out.println("Film yang sedang ditayangkan: " + film);
        System.out.println("Kapasitas Kursi: " + kapasitasKursi);
        System.out.println(info);
    }



}
