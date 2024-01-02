package xadrez;

import jogo.tabuleiro.Tabuleiro;
import jogo.tabuleiro.posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		IniciarPartida();
	}
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat [i][j] = (PecaXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void IniciarPartida() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.PRETO), new posicao(0, 4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BRANCO), new posicao(7, 4));
	}
}
