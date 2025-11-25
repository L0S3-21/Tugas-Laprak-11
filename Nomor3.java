import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor3 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner Keyboard = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        double rataRata = 0, total = 0, maks = 0, min = 0;
        double[] hitung; // untuk mendeklarasikan variabel yang didalam nya dapat diisi banyak data
        System.out.print("Masukkan jumlah data yang ingin diinput = ");
        int jumlah = Keyboard.nextInt();
        hitung = new double[jumlah];

        for (int i = 0; i <= 4; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt(); // untuk memasukkan input user kedalam variabel 
        }
        min = hitung[0]; // untuk memasukkan nilai awal variabel dari index pertama variabel hitung 
        maks = hitung[0];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah " + hitung[4 - i]);
            if (hitung[i] > maks) { // untuk membuat kondisi jika yang harus dipenuhi
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

