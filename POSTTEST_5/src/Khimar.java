class Khimar extends Hijab implements Diskon {

    public Khimar(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Khimar", stok, harga, diskon);
    }

    @Override
    public void jenisHijab() {
        System.out.println("Jenis      : Hijab Khimar");
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
