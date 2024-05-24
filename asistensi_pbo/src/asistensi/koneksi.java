package asistensi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

public class koneksi {
    private static Connection connection;
    public static Connection koneksiDB(){
        String DB = "jdbc:mysql://localhost:3306/_13020220223";
        String user = "root";
        String pass = "";
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection(DB, user, pass);
            System.out.println("Berhasil terkoneksi");
        } catch (Exception e) {
            System.out.println("Eror bang di " + e.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        System.out.println(koneksiDB());
    }
}
