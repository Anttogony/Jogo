package jogo;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B2 extends CenarioP{
	
	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;
	
	public B2 (Window w, char c) {
		
		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B2.scn"));
		player = new Jogador(250, 400);
		//if (c == 'D') player.y = 100;
		if (c == 'A') player.x = 500;
		if (c == 'E') {
			player.x = 550;
			player.y = 100;
		}
		if (c == 'F') {
			player.x = 350;
			player.y = 100;
		}
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
		if (tileColisao(04, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "Ol�, Jovem aluno! Neste local voc� ir� saber mais sobre o curso do BTI, quais as diciplinas da grade do curso e quais assuntos abordam.\nVa la na Coordenacao saber qual sua primeira aula!\nEla fica neste mesmo andar na sala B107");
		}
		
		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) JOptionPane.showMessageDialog(null, "AQUI APARECER;A O MAPA DO PRIMEIRO ANDAR");
		}
		
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {
	
			new A2(janela, 'B');
		}
		
		if (tileColisao(13, player, cena) == true) {
			
			new Sala(janela, '2');
		}
		
		if (tileColisao(15, player, cena) == true) {
			
			new B203(janela, 'X');
		}
		
		if (tileColisao(17, player, cena) == true) {
			
			new B204(janela, 'X');
		}
	}

}