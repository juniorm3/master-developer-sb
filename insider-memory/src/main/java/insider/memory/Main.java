package insider.memory;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "José";
		a1.nota = 9.5;

		Aluno a2 = criarAluno("Maria", 9.0);
		diminuirnota(a2);

		a2 = new Aluno();
		a2.nome = "Carlos";
		a2.nota = 5.0;
	}

	static Aluno criarAluno(String nome, double nota) {
		Aluno a = new Aluno();
		a.nome = nome;
		a.nota = nota;
		return a;
	}

	static void diminuirnota(Aluno a) {
		a.nota--;
	}
}
