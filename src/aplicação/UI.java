package aplicação;

import xadrez.PecaXadrez;

public class UI {

	public static void printTabuleiro(PecaXadrez[][] pecaXadrezs) {
		for (int i=0; i<pecaXadrezs.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pecaXadrezs.length; j++) {
				printPeca(pecaXadrezs[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPeca(PecaXadrez pecaXadrezs) {
		if (pecaXadrezs == null) {
			System.out.print("-");
		}
		else {
			System.out.print(pecaXadrezs);
		}
		System.out.print(" ");
	}
}
