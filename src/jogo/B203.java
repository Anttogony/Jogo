package jogo;

import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B203 extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public B203 (Window w) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B203.scn"));
		player = new Jogador(550, 450);
		teclado = janela.getKeyboard();
		//Audio.play("Ebano.mid");
		
		run();
		
	}

	private void run() {
		
		while (true) {
			player.mover(janela, teclado);
			player.caminho(cena, janela);
			
			cena.moveScene(player);
			player.draw();
			janela.update();
			
			interacao();
			mudarCenario();
		
		}
	}
	
	private void interacao() {
		if (tileColisao(02, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				
				try {
					
					if (ler("src/recursos/arquivos/PLEP1.txt") == 0) JOptionPane.showMessageDialog(null, "Ol�, Jovem aluno!\nEu sou o Professor Luc�lio e ministro as aulas de PRATICAS DE LEITURA E ESCRITA EM PORTUGUES\nV� at� a sua cadeira!\n");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				
				Quiz questao = new Quiz();
				int resul = questao.perguntar();
				JOptionPane.showMessageDialog(null, "SUA NOTA HOJE FOI: "+resul+"\nVoc� acertou "+resul/2+ " quest�es");
			}
		}
	}
	
	

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new B2(janela, 'E');
		}
	}

}