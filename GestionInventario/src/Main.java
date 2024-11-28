import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Crear el repositorio de usuarios y el servicio de usuario
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        UsuarioServicio usuarioServicio = new UsuarioServicio(usuarioRepositorio);

        // Agregar algunos usuarios de ejemplo
        usuarioRepositorio.crearUsuario(new Usuario(1, "Juan", "Pérez", "DNI", "12345678", "Calle Falsa 123", "555-1234", "juan@ejemplo.com", "password123", true));
        usuarioRepositorio.crearUsuario(new Usuario(2, "Ana", "García", "DNI", "87654321", "Calle Verdadera 456", "555-5678", "ana@ejemplo.com", "password456", true));

        // Crear el marco de la interfaz gráfica de login
        LoginFrame loginFrame = new LoginFrame(usuarioServicio);
        loginFrame.setVisible(true);

        // Establecer la operación de cierre de la aplicación cuando se cierra el marco de login
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
