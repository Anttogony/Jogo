package jogo;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class CenarioInicial extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public CenarioInicial (Window w, char c) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("cenario1.scn"));
		player = new Jogador(550, 550);
		if(c == 'B') player.y = 100;
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
			
			mudarCenario();
			interacao();
		}
	}
	

	private void interacao() {
		if (tileColisao(04, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "Olá, Jovem aluno! Neste local você irá saber mais sobre o curso do BTI, quais as diciplinas da grade do curso e quais assuntos abordam.\nVa la na Coordenacao saber qual sua primeira aula!\nEla fica neste mesmo andar na sala B107");
		}
		
		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				new Imagens("mapa.png");
			}
		}
		
		if (tileColisao(07, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				
			}
		}
		
	}

	private void mudarCenario() {
		if (tileColisao(05, player, cena) == true) {
	
			new Sala(janela, 'X');
		}
	}

}