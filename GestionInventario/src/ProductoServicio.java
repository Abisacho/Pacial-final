public class ProductoServicio {
    private ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    public void agregarProducto(Producto producto) {
        productoRepositorio.crearProducto(producto);
    }

    public void modificarProducto(int id, Producto productoModificado) {
        productoRepositorio.modificarProducto(id, productoModificado);
    }

    public Producto obtenerProductoPorId(int id) {
        return productoRepositorio.obtenerProductoPorId(id);
    }

    public void eliminarProducto(int id) {
        productoRepositorio.eliminarProducto(id);
    }

    public List<Producto> obtenerListadoProductos() {
        return productoRepositorio.obtenerListadoProductos();
    }
}
