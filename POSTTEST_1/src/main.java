import java.util.ArrayList;
import java.util.Scanner;

class Main {

    void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Hijab> daftarHijab = new ArrayList<>();

        int menu = 0;

        while(menu != 6) {

            System.out.println("=== SISTEM DATA BY HIJABDAILY ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Lihat Kategori Hijab");
            System.out.println("4. Hapus Data");
            System.out.println("5. Update Data");
            System.out.println("6. Exit");

            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){

                case 1:
                    tambahHijab(input, daftarHijab);
                    break;

                case 2:
                    lihatHijab(daftarHijab);
                    break;

                case 3:
                    KategoriHijab k = new KategoriHijab();
                    tampilkanKategori(k);
                    break;

                case 4:
                    hapusHijab(input, daftarHijab);
                    break;

                case 5:
                    updateHijab(input, daftarHijab);
                    break;

                case 6:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }
    void tambahHijab(Scanner input, ArrayList<Hijab> daftarHijab){

        KategoriHijab k = new KategoriHijab();

        System.out.print("Nama Hijab : ");
        String nama = input.nextLine();

        System.out.print("Warna : ");
        String warna = input.nextLine();

        tampilkanKategori(k);

        System.out.print("Pilih Kategori : ");
        int pilih = input.nextInt();
        input.nextLine();

        String kategori = k.kategori[pilih - 1];

        System.out.print("Stok : ");
        int stok = input.nextInt();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine();

        Hijab h = new Hijab(nama, warna, kategori, stok, harga);
        daftarHijab.add(h);

        System.out.println("Data hijab berhasil ditambahkan");
    }

    void lihatHijab(ArrayList<Hijab> daftarHijab){
        if(daftarHijab.size() == 0) {
            System.out.println("Data hijab masih kosong");
        }else {
            System.out.println("=== DAFTAR PRODUK BY HIJABDAILY ===");
            for(int i = 0; i < daftarHijab.size(); i++) {
                System.out.println("Produk ke-" + (i + 1));
                daftarHijab.get(i).tampilkanData();
            }
        }
    }

    void tampilkanKategori(KategoriHijab k){

        System.out.println("=== Daftar Kategori Hijab ===");

        for(int i = 0; i < k.kategori.length; i++){
            System.out.println((i+1) + ". " + k.kategori[i]);
        }

    }

    void hapusHijab(Scanner input, ArrayList<Hijab> daftarHijab){

        System.out.print("Masukkan nomor hijab yang ingin dihapus: ");
        int index = input.nextInt() - 1;

        if(index >= 0 && index < daftarHijab.size()){
            daftarHijab.remove(index);
            System.out.println("Data hijab berhasil dihapus");
        }else{
            System.out.println("Data hijab tidak ditemukan");
        }

    }

    void updateHijab(Scanner input, ArrayList<Hijab> daftarHijab){

        System.out.print("Masukkan nomor hijab yang ingin diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if(index >= 0 && index < daftarHijab.size()){

            System.out.print("Nama baru : ");
            daftarHijab.get(index).nama = input.nextLine();

            System.out.print("Warna baru : ");
            daftarHijab.get(index).warna = input.nextLine();

            System.out.print("Kategori baru : ");
            daftarHijab.get(index).kategori = input.nextLine();

            System.out.print("Stok baru : ");
            daftarHijab.get(index).stok = input.nextInt();

            System.out.print("Harga baru : ");
            daftarHijab.get(index).harga = input.nextInt();
            input.nextLine();

            System.out.println("Data hijab berhasil diupdate");

        }else{
            System.out.println("Data hijab tidak ditemukan");
        }

    }
}
