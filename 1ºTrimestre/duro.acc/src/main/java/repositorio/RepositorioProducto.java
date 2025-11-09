package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class RepositorioProducto {
	private List<Producto> listaProductos;

	public RepositorioProducto() {
		this.listaProductos = new ArrayList<Producto>();
	}

	public List<Producto> leerLista() {
		return listaProductos;
	}

	public void agregarProducto(Producto p) {
		listaProductos.add(p);
	}

	public void eliminarProducto(Producto p) {
		listaProductos.remove(p);
	}

	public boolean actualizarProductoPorId(String id, Producto pNuevo) {
	    boolean actualizado = false;

	    if (id != null && pNuevo != null) {
	        for (int i = 0; i < listaProductos.size(); i++) {
	            Producto actual = listaProductos.get(i);
	            if (actual.getId().equals(id)) {
	                listaProductos.set(i, pNuevo);
	                actualizado = true;
	            }
	        }
	    }

	    return actualizado;
	}

}