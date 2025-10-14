package Boletin2FicherosFoldes;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Boletin2FicherosFoldesEnum.Valor;

public class DiffFolder {
	private File folder1;
	private File folder2;

	public File getFolder1() {
		return folder1;
	}

	public void setFolder1(File folder1) {
		this.folder1 = folder1;
	}

	public File getFolder2() {
		return folder2;
	}

	public void setFolder2(File folder2) {
		this.folder2 = folder2;
	}

	public DiffFolder(File folder1, File folder2) {
		super();
		this.folder1 = folder1;
		this.folder2 = folder2;
	}

	@Override
	public String toString() {
		return "DiffFolder [folder1=" + folder1 + ", folder2=" + folder2 + "]";
	}

	public boolean validaFolder(File folder1) throws GestionFicherosException {
		boolean correcto = true;
		boolean existe1 = folder1.exists();
		if (!existe1 || !folder1.isDirectory()) {
			correcto = false;
		}
		return correcto;

	}

	public boolean validaFolder2(File folder2) throws GestionFicherosException {
		boolean correcto = true;
		boolean existe1 = folder2.exists();
		if (!existe1 || !folder2.isDirectory()) {
			correcto = false;
		}
		return correcto;

	}

	public void setFolders(File folder1, File folder2) throws GestionFicherosException {
		if (validaFolder(folder1)) {
			this.folder1 = folder1;
		} else {
			throw new GestionFicherosException("Directorio no válido.:" + folder1.getName());
		}
		if (validaFolder2(folder2)) {
			this.folder2 = folder2;
		} else {
			throw new GestionFicherosException("Directorio no válido.:" + folder2.getName());
		}

	}

	public void recorreLista() {
	}
/*
	public File[] carpetaMayo() {
		boolean carpetaMayor1 = false;

		File[] archivos1 = this.folder1.listFiles();
		File[] archivos2 = this.folder2.listFiles();
		File[] carpetaMayor;
		File[] carpetaMenor;
		int contador1 = 0;
		if (archivos1 != null) {
			for (File f : archivos1) {
				if (f.isFile()) {
					mapa1.put(f.getName(), f);
					contador1++;
				}
			}
		}
		int contador2 = 0;
		if (archivos2 != null) {
			for (File f : archivos2) {
				if (f.isFile()) {
					mapa2.put(f.getName(), f);
					contador2++;
				}
			}
		}
		boolean carpetaMayorEsFolder1;

		if (contador1 >= contador2) {
			carpetaMayor = archivos1;
			carpetaMenor = archivos2;
			carpetaMayorEsFolder1 = true;
		} else {
			carpetaMayor = archivos2;
			carpetaMenor = archivos1;
			carpetaMayorEsFolder1 = false;
		}
		return carpetaMayor;

	}
*/
	public File devuelveArchivos() {
		return folder1;

	}

	public File devuelveArchivos2() {
		return folder1;

	}

	public Collection<ResultadoComparacion> compare() {
		List<ResultadoComparacion> resultados = new ArrayList<ResultadoComparacion>();

		File[] archivos1 = folder1.listFiles();
		File[] archivos2 = folder2.listFiles();

		Map<String, File> mapa1 = new HashMap<String, File>();
		Map<String, File> mapa2 = new HashMap<String, File>();

		int contador1 = 0;
		if (archivos1 != null) {
			for (File f : archivos1) {
				if (f.isFile()) {
					mapa1.put(f.getName(), f);
					contador1++;
				}
			}
		}

		int contador2 = 0;
		if (archivos2 != null) {
			for (File f : archivos2) {
				if (f.isFile()) {
					mapa2.put(f.getName(), f);
					contador2++;
				}
			}
		}

		// Determinar cuál carpeta tiene más archivos
		File[] carpetaMayor;
		File[] carpetaMenor;
		boolean carpetaMayorEsFolder1;

		if (contador1 >= contador2) {
			carpetaMayor = archivos1;
			carpetaMenor = archivos2;
			carpetaMayorEsFolder1 = true;
		} else {
			carpetaMayor = archivos2;
			carpetaMenor = archivos1;
			carpetaMayorEsFolder1 = false;
		}

		// Crear conjunto con todos los nombres de archivos
		Set<String> todos = new HashSet<String>();
		todos.addAll(mapa1.keySet());
		todos.addAll(mapa2.keySet());

		for (String nombre : todos) {
			try {
				File f1 = mapa1.get(nombre);
				File f2 = mapa2.get(nombre);

				if (f1 != null && f2 != null) {
					long mod1 = f1.lastModified();
					long mod2 = f2.lastModified();

					if (mod1 == mod2) {
						resultados.add(new ResultadoComparacion(nombre, Valor.IGUALES));
					} else if (mod1 > mod2) {
						resultados.add(new ResultadoComparacion(nombre,
								carpetaMayorEsFolder1 ? Valor.MENOS_NUEVO_EN_1 : Valor.MENOS_NUEVO_EN_2));
					} else { 
						resultados.add(new ResultadoComparacion(nombre,
								carpetaMayorEsFolder1 ? Valor.MENOS_NUEVO_EN_2 : Valor.MENOS_NUEVO_EN_1));
					}
				} else if (f1 == null) {
					resultados.add(new ResultadoComparacion(nombre,
							carpetaMayorEsFolder1 ? Valor.FALTA_EN_1 : Valor.FALTA_EN_2));
				} else {
					resultados.add(new ResultadoComparacion(nombre,
							carpetaMayorEsFolder1 ? Valor.FALTA_EN_2 : Valor.FALTA_EN_1));
				}
			} catch (Exception e) {
				System.err.println("Error comparando archivo: " + nombre);
			}
		}

		return resultados;
	}
	

	
	private Set<ResultadoComparacion> comparaFicheros(File [] fich1, File [] fich2, boolean isPrimero){
		//Recorro fich1 para cada fichero busco ficheros2
		//si está llamo metodo comparaficheros que recibe fichero1, fichero2
		
		//si isFichero 
			//si no está me creo un objeto resultado (nombre fichero, no está en 1)
		//otras
			//si no está me creo un objeto resultado (nombre fichero, no está en 2)
		
		return null;
		
	}

}
