public class film {
     String judul;
     String genre;
     int jamTayang;
     double hargaTiket;

     void setjudul(String myjudul){
        judul = myjudul;
    }
    void setgenre(String mygenre){
        genre = mygenre;
    }
    void setjamTayang(int myjam){
        jamTayang = myjam;
    }
    void sethargaTiket(double myharga){
        hargaTiket = myharga;
    }

    void displayInfo() {
        System.out.println("Judul Film: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Jam Tayang: " + jamTayang);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("====================================");
    }


}