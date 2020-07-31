import java.util.Scanner;


public class Teste {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Moto moto = new Moto();
		Passageiro passageiro = new Passageiro();
		

		while (true) { 
			
			String line = scan.nextLine();
			System.out.println("$" + line);
			String ui[] = line.split(" ");
			if (line.equals("end"))
				break;
			
			if (ui[0].equals("potencia")) {
				moto.setPotencia(Integer.parseInt(ui[1]));
			}
			
			else if (ui[0].equals("mostrar")) {
				System.out.println("Potencia: " + moto.getPotencia() + "\nMinutos: " + moto.getTempo() + "\nPessoa: " + moto.passageiro.getNome() + " " + moto.passageiro.getIdade() + " Anos");
			}
			
			else if (ui[0].equals("subir")) {
				moto.subir();
			}
			else if (ui[0].equals("descer")) {
				moto.descer();
			}
			else if (ui[0].equals("tempo")) {
				moto.comprartempo(Integer.parseInt(ui[1]));
			}
			else if (ui[0].equals("andar")) {
				moto.dirigirtempo(Integer.parseInt(ui[1]));
			}
			else if (ui[0].equals("abastecer")) {
				moto.abastecer(Integer.parseInt(ui[1]));
			}
			else if (ui[0].equals("buzinar")) {
				moto.buzinar();
			}
		
		}

	}
}