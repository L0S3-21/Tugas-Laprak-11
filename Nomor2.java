import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor2 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        int[] hitung; // untuk mendeklarasikan variabel yang didalam nya dapat diisi banyak data
        hitung = new int[5]; // untuk mendeklarasikan jumlah data yang ada didalam variabel
        int maks = 0, min = 0; // deklarasi dan inisialisasi variabel
        double rataRata = 0, total = 0;
        Scanner Keyboard = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        System.out.println("Masukkan 5 data bulat");

        for (int i = 0; i <= 4; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt(); // untuk memasukkan input user ke index variabel 
        }
        min = hitung[0]; // untuk membuat inisialisasi nilai awal variabel
        maks = hitung[0];
        for (int i = 0; i <= 4; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.println("Data ke " + (i + 1) + " adalah " + hitung[4 - i]);  
            // untuk membuat perulangan cetak dengan urutan index yang terbalik
            if (hitung[i] > maks) { // untuk membuat kondisi jika maka akan 
                maks = hitung[i];
            }
            if (hitung[i] < min) {
                min = hitung[i];
            }

            total += hitung[i]; 
            // untuk membuat perintah hitung dengan variabel yang akan dihitung adalah bagian dari perhitungan
        }
        rataRata = total / hitung.length; // .lenght adalah untuk menunjukkan jumlah data dari variabel
        System.out.println("maks = "+maks);
        System.out.println("min = "+min);
        System.out.println("banyak element = "+hitung.length);
        System.out.println("Rata-rata = "+rataRata);

        Keyboard.close(); // untuk menutup objek scanner
    }
}


