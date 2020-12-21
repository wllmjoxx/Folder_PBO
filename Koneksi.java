package com.pboreg;

import java.sql.*;

public class Koneksi {
    //Buat deklarasi attribut untuk koneksi
    private Connection conn;

    //buat deklarasi attribut untuk statement
    private Statement st;

    //definisikan username, password, dan alamat dari server mysql
    public Koneksi() {
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Untuk Input Data(insert), Edit Data (Update), dan Hapus Data (Delete)
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    //untuk menampilkan data
    public ResultSet getData(String query) {
        try {
            st = conn.createStatement();
            return st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}