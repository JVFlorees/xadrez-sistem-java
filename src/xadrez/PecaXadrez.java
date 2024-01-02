package xadrez;

import jogo.tabuleiro.Peca;
import jogo.tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	
	private Cor cor;

	public PecaXadrez(Tabuleiro tabbuleiro, Cor cor) {
		super(tabbuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
}
