import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		
	
		int numAciertos = 0;
		
		System.out.println("\r\n" + 
				".______    __   _______ .__   __. ____    ____  _______ .__   __.  __   _______   ______   \r\n" + 
				"|   _  \\  |  | |   ____||  \\ |  | \\   \\  /   / |   ____||  \\ |  | |  | |       \\ /  __  \\  \r\n" + 
				"|  |_)  | |  | |  |__   |   \\|  |  \\   \\/   /  |  |__   |   \\|  | |  | |  .--.  |  |  |  | \r\n" + 
				"|   _  <  |  | |   __|  |  . `  |   \\      /   |   __|  |  . `  | |  | |  |  |  |  |  |  | \r\n" + 
				"|  |_)  | |  | |  |____ |  |\\   |    \\    /    |  |____ |  |\\   | |  | |  '--'  |  `--'  | \r\n" + 
				"|______/  |__| |_______||__| \\__|     \\__/     |_______||__| \\__| |__| |_______/ \\______/  \r\n" + 
				"                                                                                           \r\n" + 
				"");
		
		System.out.println("Introduce tu respuesta en letras minusculas");
		
		String pregunta1 = JOptionPane.showInputDialog("¿Qué estado de EE.UU tiene el litoral más largo?");
		String respuesta1 = "alaska";
		if(pregunta1.equals(respuesta1)) {
			numAciertos ++;
			System.out.println("\r\n" + 
					"     ___       ______  __   _______ .______     .___________.  ______   \r\n" + 
					"    /   \\     /      ||  | |   ____||   _  \\    |           | /  __  \\  \r\n" + 
					"   /  ^  \\   |  ,----'|  | |  |__   |  |_)  |   `---|  |----`|  |  |  | \r\n" + 
					"  /  /_\\  \\  |  |     |  | |   __|  |      /        |  |     |  |  |  | \r\n" + 
					" /  _____  \\ |  `----.|  | |  |____ |  |\\  \\----.   |  |     |  `--'  | \r\n" + 
					"/__/     \\__\\ \\______||__| |_______|| _| `._____|   |__|      \\______/  \r\n" + 
					"                                                                        \r\n" + 
					"");
			
		}else {
			System.out.println("\r\n" + 
					" _______    ___       __       __        ______   \r\n" + 
					"|   ____|  /   \\     |  |     |  |      /  __  \\  \r\n" + 
					"|  |__    /  ^  \\    |  |     |  |     |  |  |  | \r\n" + 
					"|   __|  /  /_\\  \\   |  |     |  |     |  |  |  | \r\n" + 
					"|  |    /  _____  \\  |  `----.|  `----.|  `--'  | \r\n" + 
					"|__|   /__/     \\__\\ |_______||_______| \\______/  \r\n" + 
					"                                                  \r\n" + 
					"");
			
		}
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " ánimo"
				);
	}

}
