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
		
		//Primera pregunta
		
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
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " , mucho ánimo");
				
		
		//Segunda pregunta
		
		String pregunta2 = JOptionPane.showInputDialog("¿Qué ciudad malagueña tiene un 'tajo' de 70 metros que la parte en dos mitades?");
		String respuesta2 = "ronda";
		if(pregunta2.equals(respuesta2)) {
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
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " , mucho ánimo");
	
		
		//Tercera pregunta
		
		String pregunta3 = JOptionPane.showInputDialog("¿Con qué otro nombre histórico se conoce a la República Democrática del Congo?");
		String respuesta3 = "zaire";
		if(pregunta3.equals(respuesta3)) {
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
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " , mucho ánimo");
	
		//Cuarta pregunta
		
		String pregunta4 = JOptionPane.showInputDialog("¿En qué ciudad se firmó la declaración de Independencia de EE.UU?");
		String respuesta4 = "philadelphia";
		if(pregunta4.equals(respuesta4)) {
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
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " , mucho ánimo");
	
		
		
		//Quinta pregunta
		
		String pregunta5 = JOptionPane.showInputDialog("¿Qué país, grande y frío, contiene más de la mitad de los lagos naturales de todo el mundo?");
		String respuesta5 = "ronda";
		if(pregunta5.equals(respuesta5)) {
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
		
		System.out.println("Tú número de aciertos es: " + numAciertos + " , mucho ánimo");
	
		
	}

	
	
	
	
	
	
}
