class Pashmina extends Hijab {

    public Pashmina(String nama, String warna, int stok, int harga) {
        super(nama, warna, "Pashmina", stok, harga);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Pashmina");
        System.out.println("-----------------------");
    }
}
