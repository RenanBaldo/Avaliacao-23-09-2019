
public class Programa {
	public static void main(String[] args) {
		Aluno aluno1;
		Aluno aluno2;
		Aluno aluno3;
		Aluno aluno4;

		aluno1 = new Aluno();
		aluno2 = new Aluno();
		aluno3 = new Aluno();
		aluno4 = new Aluno();

		aluno1.nome = "Anderson";
		aluno1.curso = "ADS";
		aluno1.serie = 4;
		aluno1.disciplina = "LTP IV";
		aluno1.avaliacao = 1.5;
		aluno1.disciplina2 = "SO";
		aluno1.avaliacao2 = 5.4;

		aluno2.nome = "João";
		aluno2.curso = "ADS";
		aluno2.serie = 4;
		aluno2.disciplina = "LTP IV";
		aluno2.avaliacao = 9.8;

		aluno3.nome = "Joaquim";
		aluno3.curso = "ADS";
		aluno3.serie = 2;
		aluno3.disciplina = "SO";
		aluno3.avaliacao = 7.8;

		aluno4.nome = "Maria";
		aluno4.curso = "ADS";
		aluno4.serie = 2;
		aluno4.disciplina = "SO";
		aluno4.avaliacao = 3.4;

		double mediaAds = (aluno1.avaliacao + aluno1.avaliacao2 + aluno2.avaliacao + aluno3.avaliacao + aluno4.avaliacao);
		System.out.println("A Média do Curso ADS é de: " + mediaAds);

		double mediaSerie4 = (aluno1.avaliacao + aluno1.avaliacao2 + aluno2.avaliacao) / 3;
		System.out.println("A Média da Série 4 é de: " + mediaSerie4);

		double mediaAnderson = (aluno1.avaliacao + aluno1.avaliacao2) / 2;
		System.out.println("A Média do Aluno " + aluno1.nome + " é " + mediaAnderson);

		double mediaSO = (aluno3.avaliacao + aluno4.avaliacao + aluno1.avaliacao2) / 3;
		System.out.print("A Média da Disciplina SO é de: " + mediaSO);

	}
}
