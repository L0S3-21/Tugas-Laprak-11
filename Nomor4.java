import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor4 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        int[] angka = { 2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78 };
        /*
         * untuk membuat variabel yang berisi banyak data dan menginisialisasi isi dari
         * variabel
         */

        System.out.print("Masukkan angka yang ingin dicari = ");
        int dicari = input.nextInt(); // untuk memasukkan input user

        int posisi = -1; // untuk mendeklarasikan dan menginisialisasi nilai variabel

        for (int i = 0; i < angka.length; i++) { /* untuk membuat perulangan dari 0 hingga kurang dari sama dengan jumlah
            dalam variabel angka lalu setiap perulangan variabel akan bertambah 1 */
            if (angka[i] == dicari) { // untuk membuat perintah jika
                posisi = i;
                break; // untuk menghentikan program jika sudah sesuai
            }
        }

        if (posisi != -1) { // untuk membuat kondisi yang harus dipenuhi
            System.out.println("Berada di index = " + posisi);
        } else { // jika kondisi tidak terpenuhi
            System.out.println("Tidak ada");
        }

        input.close(); // untuk menutup objek scanner
    }
}

