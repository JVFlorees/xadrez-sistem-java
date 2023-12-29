package jogo.tabuleiro;

public class Peca {

	
	protected posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Peca(Tabuleiro tabbuleiro) {	
		this.tabuleiro = tabbuleiro;
		posicao = null;
	}


	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
}
