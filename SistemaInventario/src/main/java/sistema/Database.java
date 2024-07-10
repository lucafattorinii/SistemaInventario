package main.java.sistema;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/SistemaInventario";
    private static final String USER = "root";
    private static final String PASSWORD = "Asdf;1234";

    public static void agregarProducto(String nombre, double precio, int cantidad) {
        String query = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setInt(3, cantidad);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

