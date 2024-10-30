import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, rata2, rata2lulus = 0, rata2tidak = 0;
        int jumlahlulus = 0, jumlahtidaklulus = 0, totallulus = 0, totaltdklulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
                jumlahlulus++;
                totallulus += nilaiMhs[i];
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " Tidak lulus!");
                jumlahtidaklulus++;
                totaltdklulus += nilaiMhs[i];
            }

        }
        rata2 = total / jumlahMahasiswa;
        if (jumlahlulus > 0) {
            rata2lulus = totallulus / jumlahlulus;
        }
        if (jumlahtidaklulus > 0) {
            rata2tidak = totaltdklulus / jumlahtidaklulus;
        }
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai Mahasiswa yang lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai Mahasiswa yang tidak lulus = " + rata2tidak);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahlulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahtidaklulus);

    }
}
