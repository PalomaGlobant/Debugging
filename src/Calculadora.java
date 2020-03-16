
public class Calculadora {

		public void baskhara(int a, int b, int c) {
			
			double discriminante;
			double raiz1;
			double raiz2;
			
			discriminante = Math.pow(b, 2) - (4 * a * c);
			if ( discriminante < 0 ) {
				raiz1 = ( -b + Math.sqrt(discriminante) ) / 2;
				raiz2 = ( -b - Math.sqrt(discriminante) ) / 2;
				System.out.print("Las raíces del polinomio son: " + raiz1 + " y " + raiz2);
			} else {
				if ( discriminante == 0 ) {
					raiz1 = -b / 2*a;
					raiz2 = raiz1;
					System.out.println("El polinomio tiene la raiz doble: " + raiz1);
				} else {
					System.out.println("El polinomio no tiene raíces en reales");
				}
			}
		
		}
		
		public void sumar(int a, int b) {
			int resultado = a + b;
			System.out.println("La suma de a y b es: " + resultado);
		}
}

