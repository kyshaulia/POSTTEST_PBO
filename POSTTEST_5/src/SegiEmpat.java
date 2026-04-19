class SegiEmpat extends Hijab implements Diskon {

    public SegiEmpat(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Segi Empat", stok, harga, diskon);
    }

    @Override
    public void jenisHijab() {
        System.out.println("Jenis      : Hijab Segi Empat");
    }

    @Override
    public int hitungHargaSetelahDiskon() {
        return getHarga() - (getHarga() * getDiskon() / 100);
    }

    @Override
    public void tampilkanHargaSetelahDiskon() {
        System.out.println("Harga Setelah Diskon : " + hitungHargaSetelahDiskon());
    }

    void tampilkanData() {
        super.tampilkanData();
        jenisHijab();
        tampilkanHargaSetelahDiskon();
        System.out.println("-----------------------");
    }
}