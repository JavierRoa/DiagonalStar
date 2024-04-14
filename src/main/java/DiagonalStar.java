public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }
    private static void printSquareStar (int number) {
        // Validación:
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        // Uso bucle for (para generar columnas), y que en cada iteración:
        for(int col = 1; col <=number; col++) {
            // Usa bucle for anidado (para generar filas), y que en cada iteración:
            for(int row = 1; row <=number; row++) {
                // Si se cumplen las condiciones:
                if(col == 1 || col == number || row == 1 || row == number ||
                        col == row || row == (number - col + 1)) {
                    System.out.print("*");  // Imprime un asteristo.
                }
                // En caso contrario:
                else {
                    System.out.print(" ");  // Imprime un espacio en blanco.
                }
            }
            System.out.println(); // Genera un salto de línea luego de cada iteración.
        }
    }
}
