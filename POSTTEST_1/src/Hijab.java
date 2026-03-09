public class Hijab {
    String nama;
    String warna;
    String kategori;
    int stok;
    int harga;

    Hijab(String nama, String warna, String kategori, int stok, int harga) {
        this.nama = nama;
        this.warna = warna;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilkanData() {
        System.out.println("Nama Hijab : " + nama);
        System.out.println("Warna      : " + warna);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Stok       : " + stok);
        System.out.println("Harga      : " + harga);
        System.out.println("-----------------------");
    }
}
