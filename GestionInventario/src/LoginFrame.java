import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private UsuarioServicio usuarioServicio;

    public LoginFrame(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;

        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel correoLabel = new JLabel("Correo:");
        JTextField correoField = new JTextField(20);
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        JPasswordField contrasenaField = new JPasswordField(20);

        JButton loginButton = new JButton("Ingresar");

        add(correoLabel);
        add(correoField);
        add(contrasenaLabel);
        add(contrasenaField);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo = correoField.getText();
                String contrasena = new String(contrasenaField.getPassword());

                Usuario usuario = new Usuario(0, "", "", "", "", "", "", correo, contrasena, false);

                if (usuarioServicio.validarUsuario(usuario)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido, " + correo);
                    dispose(); // Cerrar la ventana de login
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });
    }
}
