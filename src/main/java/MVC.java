import Controlador.Controlador;
import modelo.ModeloConexion;

public class MVC {
    
    public static void main(String[] args) {
     
       ModeloConexion conexion = ModeloConexion.obtenerInstancia();

        // Crear una instancia de ControladorLogin, pasando el modeloConexion si es necesario
        Controlador controlador = new Controlador(conexion);

        // Iniciar el controlador
        controlador.iniciar();

        // Configurar un hook de apagado para cerrar la conexión al finalizar el programa
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Llamar al método cerrarConexion de la instancia de modeloConexion
            conexion.cerrarConexion();
        }));
    }
    
}
