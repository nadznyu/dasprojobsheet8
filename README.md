**Pertanyaan Percobaan 1**
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?

**Jawaban Percobaan 1**
1. Output akan mencetak 6 bintang, karena i dimulai dari 0 dengan kondisi i<=N yang artinya angka 0 tetap terhitung sampai dengan angka N. Contoh N di isi dengan angka 5, alhasil output mencetak bintang dari angka 0,1,2,3,4,5.
2. Output tidak mencetak bintang karena kondisi i bernilai 1, jadi ketika N bernilai lebih dari 1 hasilnya tidak akan keluar/bernilai false.
3. Output akan mencetak bintang secara terus menerus, ini karena terjadinya infinite loop yang menyebabkan bintang akan terus tercetak dan program tidak akan berhenti.