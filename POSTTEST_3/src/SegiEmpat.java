class SegiEmpat extends Hijab {

    public SegiEmpat(String nama, String warna, int stok, int harga) {
        super(nama, warna, "Segi Empat", stok, harga);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Segi Empat");
        System.out.println("-----------------------");
    }
}