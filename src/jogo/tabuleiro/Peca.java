package jogo.tabuleiro;

public class Peca {

	
	protected posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Peca(Tabuleiro tabuleiro) {	
		this.tabuleiro = tabuleiro;
		posicao = null;
	}


	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
}
