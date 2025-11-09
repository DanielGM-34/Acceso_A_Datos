package repositorio;

import java.util.Iterator;
import java.util.List;

import modelo.Producto;

public class RepositorioProductos {
	private List<Producto> listaProductos;

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void agregarProducto(Producto p) {
		if (p != null && !this.getListaProductos().contains(p)) {
			listaProductos.add(p);
		}
	}

	public boolean eliminarProducto(String id) {
		boolean eliminado = false;
		Iterator<Producto> it = listaProductos.iterator();
		while (it.hasNext()) {
			Producto p = it.next();
			if (p.getId().equals(id)) {
				it.remove();
				eliminado = true;
			}
		}
		return eliminado;
	}

	public Producto buscarProducto(String id) {
		Producto resultado = null;
		Iterator<Producto> it = listaProductos.iterator();
		while (it.hasNext()) {
			Producto p = it.next();
			if (p.getId().equals(id)) {
				resultado = p;
			}
		}
		return resultado;
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

	public List<Producto> getTodos() {
		return listaProductos;
	}

}
