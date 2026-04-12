public class Hijab {
    private String nama;
    private String warna;
    private String kategori;
    private int stok;
    private int harga;
    private int diskon;

    public Hijab(String nama, String warna, String kategori, int stok, int harga, int diskon) {
        this.nama = nama;
        this.warna = warna;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }
    public String getWarna() {
        return warna;
    }
    public String getKategori() {
        return kategori;
    }
    public int getStok() { return stok; }
    public int getHarga() { return harga; }
    public int getDiskon() { return diskon; }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setDiskon(int diskon) { this.diskon = diskon; }

    void tampilkanData() {
        System.out.println("Nama Hijab : " + nama);
        System.out.println("Warna      : " + warna);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Stok       : " + stok);
        System.out.println("Harga      : " + harga);
        System.out.println("Diskon     : " + diskon + "%");
        System.out.println("-----------------------");
    }
}
