import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Televisao{
	public static int canalAtual = 10;
	public static int volume = 50; 
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("v - mudar o volume;\nc - trocar de canal;\nr - consultar o canal atual e o volume;\ns - sair.");
			String ui = br.readLine();
			char userInput = ui.charAt(0);
			if(userInput == 'v') {controleRemoto.volume();}
			
			else if(userInput == 'c') {controleRemoto.canal();}
			
			else if(userInput == 'r') {controleRemoto.consulta();}
			
			else if(userInput == 's') {System.out.println("Até logo!");break;}
			
			else {System.out.println("Comando inválido");}}
	}
}

class controleRemoto{
	
	public static void volume() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean volumeTrue = true;
		System.out.println("+ aumenta o volume; - diminui o volume; v voltar.\nVolume em:"+Televisao.volume);
		
		// para mudar de volume
		while(volumeTrue == true) {
			String resp = br.readLine();
			char resposta = resp.charAt(0);
			
			if(resposta == '+') {
				if(Televisao.volume < 100) {
					Televisao.volume += 1;
					System.out.println("+ aumentar o volume; - diminuir o volume; v voltar.\nVolume em:"+Televisao.volume);
				}else {
					System.out.println("Volume no máximo!");
					System.out.println("+ aumentar o volume; - diminuir o volume; v voltar.\nVolume em:"+Televisao.volume);}
			}
	
			else if(resposta == '-') {
				if(Televisao.volume > 0) {
					Televisao.volume -= 1;
					System.out.println("+ aumentar o volume; - diminuir o volume; v voltar.\nVolume em:"+Televisao.volume);
				}else {
					System.out.println("Volume no mínimo!");
					System.out.println("+ aumentar o volume; - diminuir o volume; v voltar.\nVolume em:"+Televisao.volume);}
			}
				
			
			else if(resposta == 'v') {volumeTrue = false;}
			
			else {System.out.println("Comando inválido");}
		}
	}
	
	// para mudar de canal
	public static void canal() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 - trocar de canal um de cada vez; 2 - trocar para um canal indicado");
		String resp = br.readLine();
		char resposta = resp.charAt(0);
		
		if(resposta == '2') {
			System.out.println("Digite o novo canal:");
			String NCanal = br.readLine();
			int NovoCanal = Integer.parseInt(NCanal);
			
			if(NovoCanal < 0 || NovoCanal > 500) {
				System.out.println("Este canal não existe");
			}
			else {
				Televisao.canalAtual = NovoCanal;
				System.out.println("Canal atual:"+Televisao.canalAtual);
			}
		}
		
		else if(resposta == '1') {
			boolean canalTrue = true;
			System.out.println("+ para o próximo canal; - para o canal anterior; v para voltar;");
			
			while(canalTrue == true) {
				String resp2 = br.readLine();
				char resposta2 = resp2.charAt(0);
				
				if(resposta2 == '+') {
					if(Televisao.canalAtual < 500) {
						Televisao.canalAtual++;
						System.out.println("Canal atual:"+Televisao.canalAtual);
					}else {
						System.out.println("Não há canal acima");
						System.out.println("Canal atual:"+Televisao.canalAtual);
					}
				}
					
					
				
				else if(resposta2 == '-') {
					if(Televisao.canalAtual > 1) {
						Televisao.canalAtual--;
						System.out.println("Canal atual:"+Televisao.canalAtual);
					}else {
						System.out.println("Não há canal abaixo");
						System.out.println("Canal atual:"+Televisao.canalAtual);
					}
				} 
					
				
				else if(resposta2 == 'v') {canalTrue = false;}
				
				else {System.out.println("Comando inválido");}
			}
		}
	}
	
	// para consultar o canal atual e o volume.
	public static void consulta() {
		System.out.println("Volume atual da televisão:"+Televisao.volume+" | canal atual da televisão:"+Televisao.canalAtual);
		System.out.println("Volume máximo e mínimo : 100,0 | canal máximo e mínimo: 500,1");
	}
}
