package com.pboreg;

public class Tugas_PBO_week6 {
    public static void main(String[] args){
        String jabatan = "gol1"; //silakan merubah/mengisi sesuai golongan jabatan pegawai
        double gajiPokok;
        double tunjangan;
        double inputJamKerja = 174; // silakan merubah/mengisi jam kerja + jam lembur(jika ada) pegawai
        double total, total1;
        double jumlahGaji;
        double total2;

        if (jabatan == "gol1"){
            gajiPokok = 1486500;
            tunjangan = 250000;
            if(inputJamKerja > 173){
                jumlahGaji= (((inputJamKerja - 173) * 20000) + gajiPokok);
                total = jumlahGaji + tunjangan;
                total1 = total * 0.5/100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + gaji lembur + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }else if(inputJamKerja == 173){
                total = gajiPokok + tunjangan;
                total1 = total * 0.5 / 100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }

        }
        else if (jabatan == "gol2"){
            gajiPokok = 1926000;
            tunjangan = 300000;
            if(inputJamKerja > 173){
                jumlahGaji= (((inputJamKerja - 173) * 20000) + gajiPokok);
                total = jumlahGaji + tunjangan;
                total1 = total * 0.5/100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + gaji lembur + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }else if(inputJamKerja == 173){
                total = gajiPokok + tunjangan;
                total1 = total * 0.5 / 100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }

        }
        else if (jabatan == "gol3"){
            gajiPokok = 2456700;
            tunjangan = 350000;
            if(inputJamKerja > 173){
                jumlahGaji= (((inputJamKerja - 173) * 20000) + gajiPokok);
                total = jumlahGaji + tunjangan;
                total1 = total * 0.5/100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + gaji lembur + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }else if(inputJamKerja == 173){
                total = gajiPokok + tunjangan;
                total1 = total * 0.5 / 100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }

        }
        else if (jabatan == "gol4"){
            gajiPokok = 2899500;
            tunjangan = 400000;
            if(inputJamKerja > 173){
                jumlahGaji= (((inputJamKerja - 173) * 20000) + gajiPokok);
                total = jumlahGaji + tunjangan;
                total1 = total * 0.5/100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + gaji lembur + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }else if(inputJamKerja == 173){
                total = gajiPokok + tunjangan;
                total1 = total * 0.5 / 100;
                total2 = total - total1;
                System.out.printf("Total gaji anda (Gaji pokok + Tunjangan - 0.5 persen pajak) = %.2f", total2);
            }

        }
    }
    }



