package jogo.tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas][colunas]; 
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarPeca(Peca peca, jogo.tabuleiro.posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}

