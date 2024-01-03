package xadrez;

import jogo.tabuleiro.Peca;
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
	
	public PecaXadrez exeMoviXadrez(PosicaoXadrez Posicaoorigem, PosicaoXadrez Posicaodestino) {
		posicao origem = Posicaoorigem.toPosicao();
		posicao destino = Posicaodestino.toPosicao();
		validacaoPosicaoOrigem(origem);
		 Peca Pecacapturada = fazerMovimento(origem, destino);
		 return (PecaXadrez)Pecacapturada;
	}
	
	private Peca fazerMovimento(posicao origem, posicao destino) {
		Peca p = tabuleiro.RemovePeca(origem);
		Peca Pecacapturada = tabuleiro.RemovePeca(destino);
		tabuleiro.lugarPeca(p, destino);
		return Pecacapturada;
		
	}
	
	private void validacaoPosicaoOrigem(posicao posicao) {
		if (!tabuleiro.TemPeca(posicao)) {
			throw new ExcecaoXadrez("Não ha Peça Na Posição De Origem");
		}
	}
	
	
	private void placeNewPiece(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void IniciarPartida() {
		placeNewPiece('c', 1, new Torre(tabuleiro, Cor.BRANCO));
        placeNewPiece('c', 2, new Torre(tabuleiro, Cor.BRANCO));
        placeNewPiece('d', 2, new Torre(tabuleiro, Cor.BRANCO));
        placeNewPiece('e', 2, new Torre(tabuleiro, Cor.BRANCO));
        placeNewPiece('e', 1, new Torre(tabuleiro, Cor.BRANCO));
        placeNewPiece('d', 1, new Rei(tabuleiro, Cor.BRANCO));

        placeNewPiece('c', 7, new Torre(tabuleiro, Cor.PRETO));
        placeNewPiece('c', 8, new Torre(tabuleiro, Cor.PRETO));
        placeNewPiece('d', 7, new Torre(tabuleiro, Cor.PRETO));
        placeNewPiece('e', 7, new Torre(tabuleiro, Cor.PRETO));
        placeNewPiece('e', 8, new Torre(tabuleiro, Cor.PRETO));
        placeNewPiece('d', 8, new Rei(tabuleiro, Cor.PRETO));
		
		
		
	}	
}
