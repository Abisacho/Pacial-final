import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Bienvenido");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel bienvenidaLabel = new JLabel("¡Bienvenido!");
        add(bienvenidaLabel);

        JButton logoutButton = new JButton("Cerrar sesión");
        add(logoutButton);

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar la ventana actual
                LoginFrame loginFrame = new LoginFrame(new UsuarioServicio(new UsuarioRepositorio()));
                loginFrame.setVisible(true); // Volver al login
            }
        });
    }
}
