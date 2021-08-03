class Universidade {
	String UniNome;
	int NumeroDeDepartamentos = 0;
	
	
	
	public Universidade(String UniNome){
		this.UniNome = UniNome;
	}
	public void getUniversidade() {System.out.println("A universidade "+this.UniNome+" contem "+this.NumeroDeDepartamentos+" departamento(s).");}
	public int getNumeroDeDepartamentos() {return this.NumeroDeDepartamentos;}
	public void setNumeroDeDepartamentos(int NumeroDeDepartamentos) {
		if(NumeroDeDepartamentos > 10) {System.out.println("O número de departamentos excede o limite de 10");}
		else if(NumeroDeDepartamentos <= 10) {
		this.NumeroDeDepartamentos = NumeroDeDepartamentos;}
	}
}


class Departamento {
		String DepNome, Universidade;
		int NumeroDeFuncionários = 0;
		
		public Departamento(String Universidade,String DepNome) {
			this.Universidade = Universidade;
			this.DepNome = DepNome;
		}
		
		public void getDepartamento() {System.out.println("O departamento "+this.DepNome+" da universidade "+this.Universidade+" contem "+this.NumeroDeFuncionários+" funcionário(s).");}
		public int getNumeroDeFuncionários() {return this.NumeroDeFuncionários;}
		public void setNumeroDeFuncionários(int NumeroDeFuncionários) {this.NumeroDeFuncionários = NumeroDeFuncionários;};
}

class Funcionario {
	String FuncNome, Departamento;
	
	public Funcionario(String FuncNome,String Departamento) {
		this.FuncNome = FuncNome;
		this.Departamento = Departamento;
		
	}
	void getFuncionario() {System.out.println("O funcionário "+this.FuncNome+" trabalha no departamento "+this.Departamento);}

}

public class Associacao{
	public static void main(String args[]) throws Exception{
		
		Universidade universidade = new Universidade("UFPA");
		
		Departamento d1 = new Departamento("UFPA","Segurança");
		int depnum1 =  universidade.getNumeroDeDepartamentos();
		depnum1++;
		universidade.setNumeroDeDepartamentos(depnum1);
		
		Departamento d2 = new Departamento("UFPA","Infra-Estrutura");
		int depnum2 =  universidade.getNumeroDeDepartamentos();
		depnum2++;
		universidade.setNumeroDeDepartamentos(depnum2);
		
		Departamento d3 = new Departamento("UFPA","Comunicação");
		int depnum3 =  universidade.getNumeroDeDepartamentos();
		depnum3++;
		universidade.setNumeroDeDepartamentos(depnum3);
		
		
		Funcionario f1 = new Funcionario("André","Segurança");
		Funcionario f2 = new Funcionario("João","Segurança");
		
		int funcnum1 = d1.getNumeroDeFuncionários();
		funcnum1 += 2;
		d1.setNumeroDeFuncionários(funcnum1);
		
		Funcionario f3 = new Funcionario("Ana","Infra-Estrutura");
		Funcionario f4 = new Funcionario("Claudio","Infra-Estrutura");
		
		int funcnum2 = d2.getNumeroDeFuncionários();
		funcnum2 += 2;
		d2.setNumeroDeFuncionários(funcnum2);
		
		Funcionario f5 = new Funcionario("Carla","Comunicação");
		Funcionario f6 = new Funcionario("Rafaela","Comunicação");
		
		int funcnum3 = d3.getNumeroDeFuncionários();
		funcnum3 += 2;
		d3.setNumeroDeFuncionários(funcnum3);
		
		System.out.println("Universidades:");
		universidade.getUniversidade();
		
		System.out.println("\nDepartamentos e funcionários:");
		d1.getDepartamento();
		f1.getFuncionario();
		f2.getFuncionario();
		
		System.out.println("");
		
		d2.getDepartamento();
		f3.getFuncionario();
		f4.getFuncionario();
		
		System.out.println("");
		
		d2.getDepartamento();
		f5.getFuncionario();
		f6.getFuncionario();
	}
}
