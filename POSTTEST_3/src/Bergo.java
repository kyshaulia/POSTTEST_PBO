class Bergo extends Hijab {

    public Bergo(String nama, String warna, int stok, int harga) {
        super(nama, warna, "Bergo", stok, harga);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Bergo");
        System.out.println("-----------------------");
    }
}