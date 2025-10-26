package RepasoContenido;

public class EscrituraFicherosConFormatos {

	public static void main(String[] args) {
		// PRINTWRITER --> para escribir cualquier tipo de datos

		// Formatos de escritura con out.printf()
		System.out.printf("%8d", 80);
		double pi = Math.PI;
		int edad = 18;
		int entero = 42;
		char letra = 'A';
		String texto = "Hola";

		System.out.printf("Pi= %4.0f%n", pi); // Pi= 3
		System.out.printf("Pi= %4.2f%n", pi); // Pi= 3.14
		System.out.printf("Pi= %12.4f%n", pi); // Pi= 3.1416
		System.out.printf("Pi= %12.8f%n", pi); // Pi= 3.14159265

		System.out.printf("Edad= %8d%n", edad); // Edad= 18
		System.out.printf("Edad= %-8d%n", edad); // Edad= 18
		System.out.printf("Edad= %04d%n", edad); // Edad= 0018
		System.out.printf("Edad= %+d%n", edad); // Edad= +18

		// %d → Enteros
		System.out.printf("Entero: %d%n", entero); // Imprime: Entero: 42

		// %c → Carácter
		System.out.printf("Carácter: %c%n", letra); // Imprime: Carácter: A

		// %s → String 
		System.out.printf("Texto: %s%n", texto); // Imprime: Texto: Hola

		// %f → Float/double con coma fija
		System.out.printf("Pi con 2 decimales: %.2f%n", pi); // Imprime: Pi con 2 decimales: 3.14

		// %e → Notación científica
		System.out.printf("Pi en notación científica: %e%n", pi); // Imprime: Pi en notación científica: 3.141593e+00

		// %g → Automático entre %f y %e
		System.out.printf("Pi automático (g): %g%n", pi); // Imprime: Pi automático (g): 3.14159

		// %n → Salto de línea compatible con el sistema
		System.out.printf("Esto está en una línea%nY esto en otra%n");

		// %% → Imprime el símbolo %
		System.out.printf("Porcentaje: 100%%%n"); // Imprime: Porcentaje: 100%

		// --- Modificadores ---

		// n.m → Anchura mínima y número de decimales
		System.out.printf("Pi con ancho 8 y 2 decimales: %8.2f%n", pi); // Imprime: 3.14

		// - → Alinea a la izquierda
		System.out.printf("Alineado a la izquierda: %-8d%n", entero); // Imprime: 42

		// 0 → Relleno con ceros
		System.out.printf("Relleno con ceros: %04d%n", entero); // Imprime: 0042

		// + → Muestra el signo
		System.out.printf("Con signo positivo: %+d%n", entero); // Imprime: +42

		// Combinación de varios modificadores
		System.out.printf("Pi con ancho 12, 4 decimales: %12.4f%n", pi); // Imprime: 3.1416
		System.out.printf("Pi con ancho 12, 8 decimales: %12.8f%n", pi); // Imprime: 3.14159265

	}
}
