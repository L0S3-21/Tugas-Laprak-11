import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor8 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        int N; // deklarasi variabel
        System.out.print("Masukkan jumlah mahasiswa: ");
        N = input.nextInt(); 
        input.nextLine();

        String[] nim = new String[N]; // untuk mendeklarasikan variabel array yang didalam nya dapat diisi banyak data
        String[] nama = new String[N];
        double[] us1 = new double[N];
        double[] us2 = new double[N];
        double[] uas = new double[N];
        double[] total = new double[N];
        char[] finalNil = new char[N];

        for (int i = 0; i < N; i++) { /* untuk membuat perulangan dari 0 hingga kurang dari sama dengan N
            lalu setiap perulangan variabel akan bertambah 1*/
            System.out.println("\nData ke-" + (i+1));
            System.out.print("NIM   : ");
            nim[i] = input.nextLine(); // untuk membaca input user dan dimasukkan ke index variabel
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("US1   : ");
            us1[i] = input.nextDouble();
            System.out.print("US2   : ");
            us2[i] = input.nextDouble();
            System.out.print("UAS   : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            total[i] = (0.30 * us1[i]) + (0.30 * us2[i]) + (0.40 * uas[i]); // untuk membuat perintah hitung nilai variabel

            if (total[i] >= 80) finalNil[i] = 'A'; // untuk membuat kondisi jika  
            else if (total[i] >= 65) finalNil[i] = 'B'; // untuk membuat kondisi jika lainnya
            else if (total[i] >= 55) finalNil[i] = 'C';
            else if (total[i] >= 45) finalNil[i] = 'D';
            else finalNil[i] = 'E'; // jika semua kondisi tidak terpenuhi
        }

        System.out.println("\nDaftar Nilai Mahasiswa TI USD"); // \n untuk membuat line baru
        System.out.println("=====================================================================");
        System.out.println("No.\tNIM\t\tNama\t\tUS1\tUS2\tUAS\tTotal\tFinal"); // \t untuk memberi perintah tab

        for (int i = 0; i < N; i++) {
            System.out.printf("%d.\t%s\t%s\t%.0f\t%.0f\t%.0f\t%.2f\t%c\n",
                    (i+1), nim[i], nama[i], us1[i], us2[i], uas[i], total[i], finalNil[i]);
        }

        System.out.println("=====================================================================\n");

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if (total[j] < total[j+1]) {

                    double tempD;
                    String tempS;
                    char tempC;

                    tempD = total[j]; total[j] = total[j+1]; total[j+1] = tempD;

                    tempC = finalNil[j]; finalNil[j] = finalNil[j+1]; finalNil[j+1] = tempC;
                    tempS = nim[j]; nim[j] = nim[j+1]; nim[j+1] = tempS;
                    tempS = nama[j]; nama[j] = nama[j+1]; nama[j+1] = tempS;

                    tempD = us1[j]; us1[j] = us1[j+1]; us1[j+1] = tempD;
                    tempD = us2[j]; us2[j] = us2[j+1]; us2[j+1] = tempD;
                    tempD = uas[j]; uas[j] = uas[j+1]; uas[j+1] = tempD; /*  untuk melakukan perintah bubble sort 
                    atau penukaran nilai sesuai urutan besar nilai */
                }
            }
        }

        System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik");
        System.out.println("=====================================================================");
        System.out.println("No.\tNIM\t\tNama\t\tUS1\tUS2\tUAS\tTotal\tFinal");

        for (int i = 0; i < N; i++) {
            System.out.printf("%d.\t%s\t%s\t%.0f\t%.0f\t%.0f\t%.2f\t%c\n",
                    (i+1), nim[i], nama[i], us1[i], us2[i], uas[i], total[i], finalNil[i]);
        }

        System.out.println("=====================================================================");
        input.close(); // untuk menutup objek scanner
    }
}



