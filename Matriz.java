package hause.retos.difMatriz;

public class Matriz {

	public static void main(String[] args) {

		int sumaPrincipal = 0, sumaSecundaria = 0, dif;

		int[][] matriz = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

		// mostramos raíz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		// suma diagonal primaria
		for (int i = 0; i < matriz.length; i++) {
			sumaPrincipal += matriz[i][i];
		}

		// suma diagonal secundaria
		int j = 0;
		for (int i = matriz.length - 1; i >= 0; i--) {
			sumaSecundaria += matriz[i][j];
			j++;
		}	

		dif = Math.abs(sumaPrincipal - sumaSecundaria);

		System.out.println("\nDiferencia absoluta entre diagonales: " + dif);

	}

}
