package com.pboreg;

class Data_Mahasiswaq{

    String nim;
    String nama;
    String jurusan;
    int angkatan;
}

public class Main {

    public static void main(String[] args) {
        Data_Mahasiswaq Input1 = new Data_Mahasiswaq();
        Input1.nim = "2019992878";
        Input1.nama = "Grace";
        Input1.jurusan = "Akutansi";
        Input1.angkatan = 2019;

        System.out.println("NIM = " + Input1.nim);
        System.out.println("Nama = " + Input1.nama);
        System.out.println("Jurusan " + Input1.jurusan);
        System.out.println("Angkatan = " + Input1.angkatan);
        System.out.println("\n\n");

        Data_MS maha = new Data_MS();

        maha.input_angkatan(2020);
        maha.input_jurusan("informatika");
        maha.input_nama("Edwins");
        maha.input_nim("2019021");

        System.out.println("Nama : " + maha.Nama_MH());
        System.out.println("NIM : " + maha.NIM_MH());
        System.out.println("JURUSAN : " + maha.Jurusan_MH());
        System.out.println("ANGKATAN : " + maha.Angkatan_MH());



    }
}
