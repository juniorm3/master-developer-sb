package insider.polimorfismo;

public class Automovel extends Veiculo {

	@Override
	public void andar() {
		System.out.println("Automóvel está andando");
	}

	public void acelerar() {
		System.out.println("Automóvel está acelerando");
	}

}
