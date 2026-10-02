public class MisAlgoritmos {

//punto1 Factorial de un número
        public int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
//punto 2 suma
        public int suma(int n) {
            if (n == 1) {
                return 1;
            }
            return n + suma(n - 1);
        }
//punto3 potencia de un numero
        public int potencia(int base, int exponente) {
            if (exponente == 0) {
                return 1;
            }
            return base * potencia(base, exponente - 1);
        }
//punto4 contar digitos
        public int contarDigitos(int n) {
            if (n < 10) {
                return 1;
            }
            return 1 + contarDigitos(n / 10);
        }
//punto5 invertir cadena
        public String invertir(String cadena) {
            if (cadena.length() <= 1) {
                return cadena;
            }
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

