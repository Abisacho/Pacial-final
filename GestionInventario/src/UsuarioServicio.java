public class UsuarioServicio {
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public boolean validarUsuario(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepositorio.obtenerUsuarioPorCorreo(usuario.getCorreo());
        if (usuarioExistente != null && usuarioExistente.getContrasena().equals(usuario.getContrasena())) {
            return true;
        }
        return false;
    }
}
