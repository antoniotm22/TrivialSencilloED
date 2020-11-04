import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
		//He modificADO esta linea para comprobar el gitignore 2.0
	
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
	
		
		//Sexta pregunta
		
		String pregunta6 = JOptionPane.showInputDialog("¿Cual es la ciudad mas poblada de todo el mundo?");
		String respuesta6 = "tokio";
		if(pregunta6.equals(respuesta6)) {
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
		
		
		//Séptima pregunta
		
		String pregunta7 = JOptionPane.showInputDialog("¿En qué ciudad se hizo la primera llamada desde un telefono móvil?");
		String respuesta7 = "nueva york";
		if(pregunta7.equals(respuesta7)) {
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
		
		
		//Octaba pregunta
		
		String pregunta8 = JOptionPane.showInputDialog("¿Qué pais ha declarado qué eleminará todas sus ratas para 2050?");
		String respuesta8 = "nueva zelanda";
		if(pregunta8.equals(respuesta8)) {
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
		
		//Novena pregunta
		
		String pregunta9 = JOptionPane.showInputDialog("¿Qué ciudad presume de haber tenido el primer metro del mundo?");
		String respuesta9 = "londres";
		if(pregunta9.equals(respuesta9)) {
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
		
		//Décima pregunta
		
		String pregunta10 = JOptionPane.showInputDialog("¿Qué pais africano obtuvo la independencia de Sudán en 2011?");
		String respuesta10 = "sudan del sur";
		if(pregunta10.equals(respuesta10)) {
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
