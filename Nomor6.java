public class Nomor6 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program

        int[] bilangan = { 23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21 }; 
        // untuk mendeklarasikan variabel array yang didalam nya dapat diisi banyak data

        int[] genap = new int[bilangan.length]; 
        // untuk membuat array int baru dimana jumlah data sama dengan variabel array bilangan
        int[] ganjil = new int[bilangan.length];

        int indexGenap = 0, indexGanjil = 0;
        for (int i = 0; i < bilangan.length; i++) { /* untuk membuat perulanganj dari 0 hingga kurang dari sama dengan 4 
            lalu setiap perulangan variabel akan bertambah 1*/
            if (bilangan[i] % 2 == 0) { // untuk membuat kondisi jika 
                genap[indexGenap++] = bilangan[i];
            } else { // jika kondisi tidak terpenuhi
                ganjil[indexGanjil++] = bilangan[i]; // ++ untuk menambahkan nilai variabel ditambah 1
            }
        }
        System.out.print("Bilangan genap pada index = ");
        for (int i = 0; i < indexGenap; i++) {
            System.out.print(genap[i] + " ");
        }
        System.out.println();
        System.out.print("Bilangan ganjil pada index = ");
        for (int i = 0; i < indexGanjil; i++) {
            System.out.print(ganjil[i] + " ");
        }
    }
}

