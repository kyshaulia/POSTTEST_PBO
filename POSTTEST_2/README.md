POSTTEST 1

Nama    : Keysha Khoirunnisa Aulia Khotim

NIM     : 2409016077



## Sistem Data HIjab By HijabDaily

1. Deskripsi Program

   Program ini merupakan program sederhana berbasis Java yang digunakan untuk mengelola data produk hijab pada toko HijabDaily.

2. Data Hijab meliputi:

   a. Nama Hijab

   b. Warna 

   c. Kategori (Pashmina, Segi Empat, Bergo, Khimar, dll)

   d. Stok

   e. Harga


3. Fitur Program

    #### Tambah Data (Menambahkan data hijab baru ke dalam sistem)

   ![Menu Tambah](assets/pbo1.png)

   Menu di atas digunakan untuk menambahkan data hijab baru pada sistem
      
   ![Output Tambah](assets/pbo2.png)

   Gambar di atas merupakan output dari menu tambah data, kita bisa menginputkan nama, warna, memillih kategori, jumlah stok, dan harga.

    #### Lihat Data (Menampilkan daftar seluruh produk hijab yang tersimpan)

   ![Menu Lihat Data](assets/pbo3.png)

      Menu di atas digunakan untuk melihat data hijab yang sudah ada pada sistem

   ![pbo4.png](assets/pbo4.png)

      Gambar di atas merupakan output dari menu lihat data, yang ditampilkan berupa nama hijab, warna, kategori, stok, dan harga.

   #### Lihat Kategori Hijab

   ![pbo5.png](assets/pbo5.png)

      Menu di atas digunakan untuk melihat kategori hijab yang ada pada Toko HijabDaily

   ![pbo6.png](assets/pbo6.png)

      Gambar di atas merupakan output dari menu lihat kategori hijab, berisi daftar kategori hijab yang ada di Toko HijabDaily, yaitu pashmina, segi empat, instan, bergo, dan khimar.
   
   #### Hapus Data (Menghapus data hijab berdasarkan nomor produk hijab)

   ![pbo7.png](assets/pbo7.png)

      Menu di atas digunakan untuk menghapus data hijab yang mungkin sudah tidak terdapat pada toko HijabDaily.

   ![pbo 8.PNG](assets/pbo%208.PNG)

      Gambar di atas merupakan output dari menu Hapus Data, menu tersebut menggunakan nomor produk yang user input untuk menghapus datanya.

   #### Upadate Data (Mengubah data hijab yang sudah ada dengan menggunakan nomor produk hijab)

   ![pbo 9.PNG](assets/pbo%209.PNG)   

      Menu di atas digunakan untuk mengubah data hijab yang sudah ada pada sistem, misal memperbarui stok atau harga yang akan berubah seiring berjalannya toko.

   ![pbo 10.PNG](assets/pbo%2010.PNG)

      Gambar di atas merupakan output dari menu update data, data di akses menggunakan nomor produk (index), kemudian menginputkan kembali nama, warna, kategori, stok, dan harga yang baru


   #### Exit (Keluar dari program)

   ![pbo 11.PNG](assets/pbo%2011.PNG)

      Menu di atas digunakan untuk menyelesaikan sesi penggunaan sistem dan keluar dari main menu.

   ![pbo 12.PNG](assets/pbo%2012.PNG)

      Gambar di atas merupakan output dari menu exit berupa pesan "Program selesai" dan langsung keluar dari program.

![pbo 13.PNG](assets/pbo%2013.PNG)

   Gambar di atas merupakan tampilan output apabila kita menginputkan menu yang tidak ada di dalam pilihan, yaitu berupa pesan "Menu tidak tersedia"

4. Struktur Class
    
    a. Class Hijab memiliki beberapa atribut, yaitu nama, warna, kategori, stok, harga. Class ini juga memiliki method untuk menampilkan data hijab.

    b. Class Kategori Hijab memiliki nama macam-macam kategori hijab yang ada di Toko HijabDaily dan satu method untuk menampilkan kategori hijab.