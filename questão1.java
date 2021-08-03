public class Pessoa1{
	static int idade,dia,mes,ano;
	String nome;
	public Pessoa1(String nome) {
		this.nome = nome;
	}
	//calcula a idade em anos por meio da data atual
	void calculaIdade(int dias, int mês, int anos) {
		int anoAtual = anos - Pessoa1.ano;
		int mesAtual = mês - Pessoa1.mes;
		int diaAtual = dias - Pessoa1.dia;
		if(mesAtual < 0) {anoAtual += -1;}
		else if(mesAtual == 0) {if(diaAtual < 0) {anoAtual += -1;}}

		Pessoa1.idade = anoAtual;
	}
	// retorna o valor da idade
	void informaIdade() {
		System.out.println(Pessoa1.idade +" anos de idade." );
	}
	//retorna o nome da pessoa
	void informaNome() {
		System.out.println("nome: "+nome);
	}
	// informa nova data de nascimento
	void ajustaDataDeNascimento(int dia,int mes, int ano) {
		Pessoa1.dia = dia;
		Pessoa1.mes = mes;
		Pessoa1.ano = ano;
	}
	
	public static void main(String args[]) {
		Pessoa1 Albert_Einstein = new Pessoa1("Albert Einstein");
		Pessoa1 Isaac_Newton  = new Pessoa1("Isaac Newton");

		Albert_Einstein.informaNome();
		Albert_Einstein.ajustaDataDeNascimento(14, 3, 1879);
		Albert_Einstein.calculaIdade(26,7,2021);
		Albert_Einstein.informaIdade();
		
		Isaac_Newton.informaNome();
		Isaac_Newton.ajustaDataDeNascimento(4, 1, 1643);
		Isaac_Newton.calculaIdade(26,7,2021);
		Isaac_Newton.informaIdade();
		}}
