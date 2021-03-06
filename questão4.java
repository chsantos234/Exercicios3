import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Elevador{
	private int andar, pessoas = 0;
	private int totAndar, capPessoas = 0;

	// set e get para andar
	public void setAndar(int andar) {this.andar = andar;}
	public int getAndar() {return andar;}
	
	// set e get para pessoas
	public void setPessoas(int pessoas) {this.pessoas = pessoas;}
	public int getPessoas() {return pessoas;}
	
	// set e get para
	public void settotAndar(int totAndar) {this.totAndar = totAndar;}
	public int gettotAndar() {return totAndar;}
	
	// set e get para
	public void setcapPessoas(int capPessoas) {this.capPessoas = capPessoas;}
	public int getcapPessoas() {return capPessoas;}
	
	void Inicializar(int capacidadePessoas, int totalAndares) {
		setAndar(0);
		setPessoas(0);
		settotAndar(totalAndares);
		setcapPessoas(capacidadePessoas);}
	
	void Entra() {
		int capacidadeMáxima = getcapPessoas();
		int pessoas = getPessoas();
		
		if(pessoas == capacidadeMáxima) {
			System.out.println("Elevador cheio!");}
		
		else if(pessoas < capacidadeMáxima) {
			pessoas++;
			System.out.println("Uma pessoa entrou!");
			System.out.println("Pessoas no elevador: "+pessoas);
			setPessoas(pessoas);}}
	
	void Sai() {
		int pessoas = getPessoas();
		
		if(pessoas == 0) {System.out.println("Elevador vazio!");}
		
		else if(pessoas > 0 ) {
			pessoas--;
			System.out.println("Uma pessoa saiu");
			System.out.println("Pessoas no elevador: "+pessoas);
			setPessoas(pessoas);}}
	
	void Sobe() {
		int andarAtual = getAndar();
		int totAndares = gettotAndar();
		
		if(andarAtual == totAndares) {
			System.out.println("Elevador está no último andar!");}
		
		else if(andarAtual < totAndares) {
			andarAtual++;
			System.out.println("Elevador subiu 1 andar");
			System.out.println("Andar atual: " +andarAtual);
			setAndar(andarAtual);}}
	
	void Desce() {
		int andarAtual = getAndar();
		
		if(andarAtual == 0) {System.out.println("Elevador está no primeiro andar!");}
		
		else if(andarAtual > 0) {
			andarAtual--;System.out.println("Elevador desceu 1 andar");
			System.out.println("Andar atual: " +andarAtual);
			setAndar(andarAtual);}}
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Elevador elevador = new Elevador();
		System.out.println("Iniciando o sistema...");
		
		System.out.println("Digite a capacidade máxima do elevador:");
		String capacidadeInput = br.readLine();
		int capacidadePessoas = Integer.parseInt(capacidadeInput);
		
		System.out.println("Digite a quantidade de andares do prédio (o térreo não entra na contagem):");
		String totalAndaresInput = br.readLine();
		int totalAndares = Integer.parseInt(totalAndaresInput);
		
		elevador.Inicializar(capacidadePessoas,totalAndares);
		
		System.out.println("1 - entrar pessoa;\n2 - sair pessoa;\n3 - subir um andar;\n4 - descer um andar;\n5 - nova Inicialização (Aviso: reiniciar o sistema e zera a quantidade de pessoas no elevador e o seu andar atual!)");
		
		while(true) {
			String Userinput = br.readLine();
			char input = Userinput.charAt(0);
			if(input == '1') {
				// entrada de pessoa:
				elevador.Entra();
			}
			else if(input == '2') {
				// saída de pessoa:
				elevador.Sai();
			}
			else if(input == '3') {
				// elevador subindo:
				elevador.Sobe();
			}
			else if(input == '4') {
				//elevador descendo:
				elevador.Desce();
			}
			else if(input == '5') {
				// novos parâmetros de inicialização:
				System.out.println("Reiniciando o sistema...");
				
				System.out.println("Digite a capacidade máxima do elevador:");
				String NewcapacidadeInput = br.readLine();
				int NewcapacidadePessoas = Integer.parseInt(NewcapacidadeInput);
				
				System.out.println("Digite a quantidade de andares do prédio (o térreo não entra na contagem):");
				String NewtotalAndaresInput = br.readLine();
				int NewtotalAndares = Integer.parseInt(NewtotalAndaresInput);
				
				elevador.Inicializar(NewcapacidadePessoas,NewtotalAndares);
				System.out.println("1 - entrar pessoa;\n2 - sair pessoa;\n3 - subir um andar;\n4 - descer um andar;\n5 - nova Inicialização (Aviso: reiniciar o sistema e zera a quantidade de pessoas no elevador e o seu andar atual!)");
				
			}
			else {System.out.println("Comando inválido");}
		}}}
