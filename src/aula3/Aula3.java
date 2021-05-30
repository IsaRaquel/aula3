package aula3;

import javax.swing.JOptionPane;

public class Aula3 {
	
	public static void main(String[] args) {		
		
		String string1=JOptionPane.showInputDialog("Digite o 1° numero:");	
		String string2=JOptionPane.showInputDialog("Digite o 2° numero:");
		
		if(string1.matches("[0-9]") && string2.matches("[0-9]")) {
			
			String operacao=JOptionPane.showInputDialog("Digite:\n + para somar;\n - para subitrair;\n * para multiplicar\n / para dividir.\n ");
						
			double numero1=	Double.parseDouble(string1);
			double numero2= Double.parseDouble(string2);
			double resultado = 0;
			
			
			if(
				(operacao.equals("+"))||
				(operacao.equals("-"))||
				(operacao.equals("/"))||
				(operacao.equals("*"))) {
				
				
					if(operacao.equals("+")) {			
						resultado=numero1+numero2;			
					}
					else if(operacao.equals("-")) {
						resultado=numero1-numero2;	
					}
					else if(operacao.equals("*")) {
						resultado=numero1*numero2;	
					}
					else if(operacao.equals("/")) {
						resultado=numero1/numero2;	
					}
					
					JOptionPane.showMessageDialog(null, "O resultado é:"+resultado);
			}
			else {
				JOptionPane.showMessageDialog(null, "Eita...ERREI!");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Meu irmão digite as coisas direito, eu só aceito numero ¬¬");
		}
		
	}

}
