public class Nomor5 { // untuk membuat class
     public static void main(String[] args) { // untuk memulai program

        int[] usia1 = { 18, 39, 45, 50, 65, 70, 90 }; // untuk mendeklarasikan variabel yang didalam nya dapat diisi banyak data
        int[] usia2 = { 20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96 };

        int[] usiaGabung = new int[usia1.length + usia2.length]; /* untuk membuat objek array int baru dimana data nya
        adalah gabungan dari 2 array */
        int i = 0, j = 0, k = 0;

        while (i < usia1.length && j < usia2.length) { // untuk membuat perulangan ketika 
            if (usia1[i] < usia2[j]) { // untuk membuat kondisi yang harus dipenuhi
                usiaGabung[k++] = usia1[i++];
            } else { // jika kondisi tidak terpenuhi
                usiaGabung[k++] = usia2[j++];
            }
        }

        while (i < usia1.length) {
            usiaGabung[k++] = usia1[i++]; // ++ untuk menambahkan nilai variabel ditambah 1
        }

        while (j < usia2.length) {
            usiaGabung[k++] = usia2[j++];
        }

        System.out.print("Urutan usia gabungan = ");
        for (int usia : usiaGabung) { // untuk membuat perulangan yang berfokus pada satu variabel saja 
            System.out.print(usia + " ");
        }
    }
}

