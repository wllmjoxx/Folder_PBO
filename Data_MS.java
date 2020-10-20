package com.pboreg;

public class Data_MS {
    String nama1;
    long angkatan1;
    String jurusan1;
    String nim1;

    public String Nama_MH(){
        return this.nama1;
    }
    public long Angkatan_MH(){
        return this.angkatan1;
    }
    public String Jurusan_MH(){
        return this.jurusan1;
    }
    public String NIM_MH(){
        return this.nim1;
    }
    public void input_nim(String nim2){
        this.nim1 = nim2;
    }
    public void input_nama(String nama2){
        this.nama1 = nama2;
    }
    public void input_jurusan(String jurusan2){
        this.jurusan1 = jurusan2;
    }
    public void input_angkatan(long angkatan2){
        this.angkatan1 = angkatan2;
    }

}
