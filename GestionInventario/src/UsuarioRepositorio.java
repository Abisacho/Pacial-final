import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {
    private List<Usuario> usuarios = new ArrayList<>();

    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario obtenerUsuarioPorCorreo(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }
}
