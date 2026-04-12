class Instan extends Hijab {

    public Instan(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Instan", stok, harga, diskon);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Instan");
        System.out.println("-----------------------");
    }
}