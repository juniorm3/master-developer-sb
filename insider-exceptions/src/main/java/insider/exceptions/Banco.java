package insider.exceptions;

public class Banco {

	public void realizarOperacao() {
		ContaBancaria c = null; // new ContaBancaria();

		try {
			c.sacar(100);
			c.sacar(1000);
			System.out.println("sacou");
			double saldo = c.getSaldo();
			System.out.println(saldo);

		} catch (ValorNegativoException e) {
			System.out.println("valor negativo");

		} catch (SaldoInsuficienteException e) {
			System.out.println("Não tem saldo: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Algum erro: " + e);

		} finally {
			System.out.println("fim do saque");
		}

	}

}
