package BOLETIN2XML.repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import BOLETIN2XML.modelo.Producto;

public class RepositorioProducto {
	private List<Producto> listaProductos;

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public RepositorioProducto() {
		super();
		this.listaProductos = new ArrayList<Producto>();
	}

	// SERVICIO
	public Producto getProdcuto(Producto a) {
		Producto devuelvePro = null;
		Iterator<Producto> iterador = this.getListaProductos().iterator();
		boolean buscar = contieneProducto(a);
		while (iterador.hasNext() && !buscar) {
			Producto producto = (Producto) iterador.next();
			if (this.getListaProductos().contains(a)) {
				devuelvePro = producto;
			}
		}
		return devuelvePro;
	}

	public boolean agregarProducto(Producto p) {
		return this.getListaProductos().add(p);
	}

	public boolean eliminarProducto(Producto a) {
		return this.getListaProductos().remove(a);
	}

	public boolean contieneProducto(Producto a) {
		return this.getListaProductos().contains(a);
	}

	public boolean actualizaProducto(int id, Producto a) {
		Iterator<Producto> iterador = this.getListaProductos().iterator();
		boolean contieneId = false;
		while (iterador.hasNext() && !contieneId) {
			Producto producto = (Producto) iterador.next();
			if (producto.getId() == id) {
				contieneId = true;
				producto = a;
			}
		}
		return contieneId;
	}

}