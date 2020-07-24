package br.ufc.qx;
import java.util.Scanner;




public class Executa {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Pet pet = new Pet();	
	pet.setEnergia(3);
	pet.setLimpo(3);
	

	while (true) { 
		String line = scan.nextLine();
		System.out.println("$" + line);
		if (line.equals("end"))
			break;
		String ui[] = line.split(" ");
		
		
		if (ui[0].equals("mostrar")) {
			System.out.println("Diamante: " + pet.getDiamantes() + "\nEnergia: " + pet.getEnergia() + "\nFaminto: " + pet.getFome() + "\nlimpo: " + pet.getLimpo() + "\nidade: " + pet.getIdade());
		}
		
		else if (ui[0].equals("brincar")) {
			pet.brincar();
		}
		else if (ui[0].equals("banho")) {
			pet.banho();
		}
		else if (ui[0].equals("comer")) {
			pet.comer();
		}
		else if (ui[0].equals("dormir")) {
			pet.dormir();
		}
	}
	
}

}
