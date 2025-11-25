import java.util.Scanner; // memanggil objek scanner

public class Nomor1 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program

        int[] hitung, cadangan; // untuk mendeklarasikan variabel yang didalam nya dapat diisi banyak data
        hitung = new int[5]; // untuk membuat jumlah data yang akan disimpan di variabel
        Scanner Keyboard = new Scanner(System.in); // membuat variabel dari objek scanner
        System.out.println("Masukkan 5 data bulat");

        for (int i = 0; i <= 4; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt(); // untuk memasukkan input user kedalam index ke-i dari variabel 
        } for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah "+ hitung[4 - i]);
            // untuk membuat perulangan cetak dengan urutan index yang terbalik
        } for (int i = 0; i <= 4; i++) {
            cadangan = hitung;
            System.out.println("cadangan = "+cadangan[4-i]);
        }
        Keyboard.close(); // untuk menutup objek scanner
    }
}


