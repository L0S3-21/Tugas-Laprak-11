import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor7 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        System.out.print("Masukkan jumlah data yang ingin dimasukkan = ");
        int jumlah = input.nextInt(); // untuk memasukkan input user kedalam variabel

        int[] data = new int[jumlah]; // untuk mendeklarasikan variabel yang didalam nya dapat diisi banyak data

        for (int i = 1; i <= jumlah; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.print("Masukkan nilai data ke " + i + " = ");
            data[i - 1] = input.nextInt(); // untuk memasukkan input user ke index variabel data
        }

        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - 1 - i; j++) {
                if (data[j] > data[j + 1]) { // untuk membuat kondisi jika 
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("\nUrutan data = "); // \n untuk membuat line baru
        for (int i = 0; i < jumlah; i++) {
            System.out.print(data[i] + " ");
        }
        input.close(); // untuk menutup objek scanner
    }
}

