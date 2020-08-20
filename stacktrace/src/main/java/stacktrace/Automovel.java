package stacktrace;

public class Automovel {
	private static final int VELOCIDADE_MAXIMA = 180;

	private int velociadeAtual;

	public void acelerar(int velocidade) throws AcimaVelocidadeMaximaException {

		if (velociadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeMaximaException("Excedeu a velocidade máxima");
		}

		velociadeAtual += velocidade;
	}

}
