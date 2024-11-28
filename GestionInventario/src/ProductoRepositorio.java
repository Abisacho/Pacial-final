import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorio {
    private static List<Producto> productos = new ArrayList<>();

    public void crearProducto(Producto producto) {
        productos.add(producto);
    }

    public void modificarProducto(int id, Producto productoModificado) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(productoModificado.getNombre());
                producto.setCategoria(productoModificado.getCategoria());
                producto.setCantidad(productoModificado.getCantidad());
                producto.setPrecioUnitario(productoModificado.getPrecioUnitario());
                producto.setFechaExpiracion(productoModificado.getFechaExpiracion());
            }
        }
    }

    public Producto obtenerProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> obtenerListadoProductos() {
        return productos;
    }

    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }
}
