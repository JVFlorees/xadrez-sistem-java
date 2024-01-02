package jogo.tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro criando tabuleiro: É necessario que haja pelomenos 1 linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas][colunas]; 
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExistentes(linha, coluna)) {
			throw new TabuleiroException("Não ha essa posição no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(posicao posicao) {
		if (!posicaoExistentes(posicao)) {
			throw new TabuleiroException("Não ha essa posição no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarPeca(Peca peca,posicao posicao) {
		if (TemPeca(posicao)) {
			throw new TabuleiroException("Já Existe Uma Peça Nessa Posicao: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistentes(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistentes(posicao posicao) {
		return posicaoExistentes(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean TemPeca(posicao posicao) {
		if (!posicaoExistentes(posicao)) {
			throw new TabuleiroException("Não ha essa posição no tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
	
}

