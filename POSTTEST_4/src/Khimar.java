class Khimar extends Hijab {

    public Khimar(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Khimar", stok, harga, diskon);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Khimar");
        System.out.println("-----------------------");
    }
}
