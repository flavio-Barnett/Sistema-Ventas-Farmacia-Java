package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ModeloConexion {

    private static ModeloConexion instanciaUnica;
    private Connection conexion;

    private ModeloConexion() {
    }

    public static synchronized ModeloConexion obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new ModeloConexion();
        }
        return instanciaUnica;
    }

    public void establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/farmacia";
            String usuario = "root";
            String contraseña = "123456789";

            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión con la BD Farmacia exitosa.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
