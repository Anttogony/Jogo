package jogo;

import javax.swing.JOptionPane;

public class Quiz {
	
	public class Perguntas {
		
	}

	public int perguntar() {
		
		int nota = 0, v = 0;
		
		while(v < 1 || v > 3) {
		String resposta = JOptionPane.showInputDialog("*****PLEP1*****\n\nPergunta 1: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
		v = Integer.parseInt(resposta);
		if (v == 1) nota += 2;
		}
		
		v = 0;
		
		while(v < 1 || v > 3) {
		String resposta = JOptionPane.showInputDialog("*****PLEP1*****\n\nPergunta 2: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
		v = Integer.parseInt(resposta);
		if (v == 1) nota += 2;
		}
		
		v = 0;
		
		while(v < 1 || v > 3) {
		String resposta = JOptionPane.showInputDialog("*****PLEP1*****\n\nPergunta 3: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
		v = Integer.parseInt(resposta);
		if (v == 1) nota += 2;
		}
		
		v = 0;
		
		while(v < 1 || v > 3) {
		String resposta = JOptionPane.showInputDialog("*****PLEP1*****\n\nPergunta 4: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
		v = Integer.parseInt(resposta);
		if (v == 1) nota += 2;
		}
		
		v = 0;
		
		while(v < 1 || v > 3) {
		String resposta = JOptionPane.showInputDialog("*****PLEP1*****\n\nPergunta 5: Qual desses conteudos está incluido na disciplina de PLEP! ?\n\n1- Generos textuais\n2- Redação\n3- Estatistica\n\n**Digite o valor correspondente a sua resposta:");
		v = Integer.parseInt(resposta);
		if (v == 1) nota += 2;
		}
		
		return nota;
	}
	
	
}
