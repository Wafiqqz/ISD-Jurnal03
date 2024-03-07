package Jurnal03;

public class Buku {
    String judulBuku;
    String penulis;
    int tahunTerbit;

    public Buku(String judulBuku, String penulis, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; 
    }

    @Override
    public String toString() {
        return "Buku [judulBuku=" + judulBuku + ", penulis=" + penulis + ", tahunTerbit=" + tahunTerbit + "]";
    }

}
