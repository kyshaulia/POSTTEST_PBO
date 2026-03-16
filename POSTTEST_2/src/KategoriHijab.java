public class KategoriHijab {
    private String[] kategori = {
            "Pashmina",
            "Segi Empat",
            "Instan",
            "Bergo",
            "Khimar"
    };

    public String[] getKategori() {
        return kategori;
    }

    void tampilkanKategori() {
        System.out.println("=== Daftar Kategori Hijab ===");
        for(int i = 0; i < kategori.length; i++){
            System.out.println((i+1) + ". " + kategori[i]);
        }
    }
}
