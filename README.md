**Pertanyaan Percobaan 1**
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?

**Jawaban Percobaan 1**
1. Output akan mencetak 6 bintang, karena i dimulai dari 0 dengan kondisi i<=N yang artinya angka 0 tetap terhitung sampai dengan angka N. Contoh N di isi dengan angka 5, alhasil output mencetak bintang dari angka 0,1,2,3,4,5.
2. Output tidak mencetak bintang karena kondisi i bernilai 1, jadi ketika N bernilai lebih dari 1 hasilnya tidak akan keluar/bernilai false.
3. Output akan mencetak bintang secara terus menerus, ini karena terjadinya infinite loop yang menyebabkan bintang akan terus tercetak dan program tidak akan berhenti.

**Pertanyaan Percobaan 2**
1. Perhatikan perulangan luar. Jika pada sintaks for iOuter=1 diubah menjadi iOuter=0, apa akibatnya? Mengapa bisa demikian?
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
5. Silakan commit dan push ke repository Anda.

**Jawaban Percobaan 2** 
1. Output akan mencetak 6 baris, karena iOuter dari 0 yang artinya angka 0 tetap terhitung sampai dengan angka N. Contoh N di isi dengan angka 5, alhasil output mencetak baris dari baris ke 0,1,2,3,4,5.
2. Bintang akan tercetak sebanyak 6 kali, dan barisnya sebanyak 5. Karena perulangan dalam diperuntukkan untuk mencetak bintang, sehingga jika inisialisasi i diubah menjadi 0, maka output akan mencetak bintang dari angka 0,1,2,3,4,5.
3. Perulangan luar untuk menampilkan baris, sedangkan perulangan dalam untuk mencetak bintang.
4. Untuk memisahkan baris saat mencetak bintang. Jika sintaks System.out.println(); dihilangkan, maka bintang akan tercetak di baris yang sama. 