import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Pessoa2{
	public String nome;
	public Pessoa2(String nome) {
		this.nome = nome;}}


public class Agenda{
	public static ArrayList<Pessoa2> lista = new ArrayList<Pessoa2>();
	
	static void armazenarPessoa(Pessoa2 pessoa) {lista.add(pessoa);}
	
	static void removerPessoa(String nome) {
		Pessoa2 remover = null;
		for(Pessoa2 pessoa : lista) {
			if(pessoa.nome.equals(nome)) {
				remover = pessoa;}
		} lista.remove(remover);
	}
	
	static int buscarPessoa(String nome) {
		int index = 0;
		for(Pessoa2 pessoa : lista) {
			if(pessoa.nome.equals(nome)) {
				return index;
			}index++;
		}return index;
	}
	
	static void imprimeAgenda() {
		int posic = 1;
		int index = 0;
		for(Pessoa2 pessoa : lista) {
			System.out.println("["+index+"]"+posic+" - "+pessoa.nome);posic++;index++;
		}
	}
	
	static void imprimePessoa(int index) {
		Pessoa2 nome = lista.get(index);
		System.out.println(nome.nome);}
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[1]armazenar;\n[2]apagar;\n[3]buscar;\n[4]imprimir_agenda;\n[5]imprimir_pessoa;\n[6]Sair.");
		
		while(true) {System.out.print("-->:");
			String resp = br.readLine();
			char resposta = resp.charAt(0);
			
			if(resp.length() > 1) {System.out.println("Utilize somente números de 1 a 6!");}
			
			else if(resposta == '1') {
				if(lista.size() == 10) {System.out.println("O tamanho máximo da lista foi atingido, apague uma pessoa para poder adicionar outra.");}
				else {
				System.out.println("digite um nome a ser adicionado:");
				String nome = br.readLine();
				Pessoa2 pessoa = new Pessoa2(nome);
				armazenarPessoa(pessoa);}}
				
			
			else if(resposta == '2') {
				System.out.println("Digite um nome para ser excluído:");
				String nome = br.readLine();
				removerPessoa(nome);
			}
			
			else if(resposta == '3') {
				System.out.println("digite um nome a ser buscado:");
				String nome = br.readLine();
				int index = buscarPessoa(nome);
				int posic = index + 1;
				System.out.println("O nome "+nome+" está no índice "+index+" e na posição "+posic+" da lista.");}
			
			else if(resposta == '4') {
				imprimeAgenda();}
			
			else if(resposta == '5') {
				boolean exit = false;
				System.out.println("Digite o índice de algum elemento da lista:");
				while(exit == false) {
					System.out.print(":");
					String ind = br.readLine();
					int index = Integer.parseInt(ind);
					
					int listaLength = lista.size();
					listaLength -= 1;
					
					if(index > listaLength) {System.out.println("O número digitado é maior do que a lista.");}
					
					else if(index <= listaLength) {imprimePessoa(index);exit = true;}}}
			
			else if(resposta == '6') {System.out.println("Até logo!");break;}
			
			else {System.out.print("Utilize somente números de 1 a 6!");}}}}
