class Bergo extends Hijab {

    public Bergo(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Bergo", stok, harga, diskon);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Bergo");
        System.out.println("-----------------------");
    }
}