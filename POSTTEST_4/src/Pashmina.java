class Pashmina extends Hijab {

    public Pashmina(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Pashmina", stok, harga, diskon);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Pashmina");
        System.out.println("-----------------------");
    }
}
