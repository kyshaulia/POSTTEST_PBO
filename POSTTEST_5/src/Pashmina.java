class Pashmina extends Hijab implements Diskon {

    public Pashmina(String nama, String warna, int stok, int harga, int diskon) {
        super(nama, warna, "Pashmina", stok, harga, diskon);
    }

    @Override
    public void jenisHijab() {
        System.out.println("Jenis      : Hijab Pashmina");
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
