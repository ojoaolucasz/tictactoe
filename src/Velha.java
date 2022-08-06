
public class Velha {
	public static void main(String[] args) {
		char[][] matrizTabuleiro = {{'x','o','x'},{'x','o','o'},{'o','x','x'}};
		// char[][] matrizTabuleiro = { { 'x', 'x', 'x' }, { 0, 'o', 'o' }, { 0, 0, 0 } };
		// char[][] matrizTabuleiro = {{'o','x','x'},{'x','o','x'},{'o','x','o'}};
		// char[][] matrizTabuleiro = {{'x','x',0},{'o','o','o'},{'x','o','x'}};
		// char[][] matrizTabuleiro = {{'x','x',0},{'o','x','o'},{'x','o','x'}};
		// char[][] matrizTabuleiro = {{'x','o',0},{'x','x','o'},{'x','x','o'}};
		// char[][] matrizTabuleiro = {{'o','o','x'},{'x','o','x'},{'x','x','o'}};
		exibirTabuleiro(matrizTabuleiro);
		char vencedor = verificarVencedor(matrizTabuleiro);

		if (vencedor == 0) {
		System.out.println("Ganhador velha");
		} else {
		System.out.println("Ganhador "+vencedor );
		}
		}

		public static void exibirTabuleiro(char[][] tabuleiro) {
		System.out.println();
		for (int i = 0; i < 3; i++) {

		for (int j = 0; j < 3; j++) {
		if (tabuleiro[i][j] != 0)
		System.out.print(tabuleiro[i][j] + " | ");
		else
		System.out.print("- | ");
		}

		System.out.println();
		}
		}

		public static char verificarLinha(char[][] tabuleiro) {
		char vencedor = 0;

		for (int i = 0; i < 3; i++) {
		vencedor = tabuleiro[i][0];

		for (int j = 0; j < 3; j++) {
		if (vencedor != tabuleiro[i][j]) {
		vencedor = 0;
		break;
		}
		}

		if (vencedor != 0) {
		break;
		}
		}

		return vencedor;
		}

		public static char verificarColuna(char[][] tabuleiro) {
		char vencedor = 0;

		for (int i = 0; i < 3; i++) {
		vencedor = tabuleiro[i][0];

		for (int j = 0; j < 3; j++) {
		if (vencedor != tabuleiro[j][i]) {
		vencedor = 0;
		break;
		}
		}

		if (vencedor != 0) {
		break;
		}
		}

		return vencedor;
		}

		public static char verificarDiagonalEsquerdaParaDireita(char[][] tabuleiro) {
		char vencedor = tabuleiro[0][0];

		for (int i = 0; i < 3; i++) {

		if (vencedor != tabuleiro[i][i]) {
		return 0;
		}


		}

		return vencedor;
		}

		public static char verificarDiagonalDireitaParaEsquerda(char[][] tabuleiro) {
		int coluna = 2;
		char vencedor = tabuleiro[0][coluna];


		for (int i = 0; i < 3; i++) {

		if (vencedor != tabuleiro[i][i]) {
		return 0;
		}

		coluna--;

		}

		return vencedor;
		}

		public static char verificarVencedor(char[][] tabuleiro) {
		char vencedor = verificarLinha(tabuleiro);

		if (vencedor == 0) {
		vencedor = verificarColuna(tabuleiro);

		if(vencedor == 0)
		vencedor = verificarDiagonais(tabuleiro);
		}

		return vencedor;
		}

		public static char verificarDiagonais(char[][] tabuleiro) {
		char vencedor = verificarDiagonalEsquerdaParaDireita(tabuleiro);

		if (vencedor == 0) {
		vencedor = verificarDiagonalDireitaParaEsquerda(tabuleiro);
		}

		return vencedor;
		}

		}