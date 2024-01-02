package xadrez.pecas;

import jogo.tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabbuleiro, Cor cor) {
		super(tabbuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}
	
}
