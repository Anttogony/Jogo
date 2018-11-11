package jogo;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class CenarioInicial {
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public CenarioInicial (Window w) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("cenario1.scn"));
		player = new Jogador(550, 550);
		teclado = janela.getKeyboard();
		
		run();
		
	}

	private void run() {
		
		while (true) {
			player.mover(janela, teclado);
			player.caminho(cena);
			
			//player.x = cena.getXOffset();
			//player.y = cena.getYOffset();
			
			cena.moveScene(player);
			player.draw();
			janela.update();
		}
	}

}