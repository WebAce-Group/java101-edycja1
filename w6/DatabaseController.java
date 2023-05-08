package me.webace.zajecia6.database;
import java.sql.*;

public class DatabaseController {
    private Connection connection;

    public DatabaseController(){
        this.connection = prepareSQLite();
        if (createTable()) {
            System.out.println("Wszystko gra");
        } else {
            System.out.println("Coś nie gra");
        }
    }

    private Connection prepareSQLite(){
        String urlConnection = "jdbc:sqlite:database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConnection);
            if (conn != null) {
                DatabaseMetaData databaseMetaData = conn.getMetaData();
                System.out.println("Nazwa sterownika bazy danych: " + databaseMetaData.getDriverName());
                System.out.println("Baza danych gotowa");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private boolean createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS Users (\n" +
                "id integer PRIMARY KEY, \n" +
                "username text NOT NULL,\n" +
                "email text NOT NULL,\n" +
                "password text NOT NULL);";
        try (Statement stmt = this.connection.createStatement()){
            //tworzymy tabelę
            stmt.execute(sql);
            System.out.println("Tabela Users gotowa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean addUser(User user) {
        String sql = "INSERT INTO Users (username, email, password) VALUES (?,?,?)";
        try {
            PreparedStatement pstmt = this.connection.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            int result = pstmt.executeUpdate();
            System.out.println("Dodano użytkownika!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
