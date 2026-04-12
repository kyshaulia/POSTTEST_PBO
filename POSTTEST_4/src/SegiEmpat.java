class SegiEmpat extends Hijab {

    public SegiEmpat(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Segi Empat", stok, harga, diskon);
    }

    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : Hijab Segi Empat");
        System.out.println("-----------------------");
    }
}