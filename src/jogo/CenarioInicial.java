package jogo;

import java.awt.HeadlessException;
import java.io.IOException;

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
		player = new Jogador(550, 520);
		if(c == 'B') player.y = 100;
		if(c == 'M') {
			player.y = 515;
			player.x = 280;
		}
		if(c == 'R') {
			player.y = 490;
			player.x = 350;
		}
		if(c == 'W') {
			try {
				escrever("src/recursos/arquivos/stage.txt", 0);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
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
			
			mudarCenario();
			interacao();
		}
	}
	

	private void interacao() {
		if (tileColisao(04, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {

				try {
					if(ler("src/recursos/arquivos/stage.txt") == 0) {
						//JOptionPane.showMessageDialog(null, "Olá, Jovem aluno! Neste local você irá saber mais sobre o curso do BTI, quais as diciplinas da grade do curso e quais assuntos abordam.\nVa la na Coordenacao saber qual sua primeira aula!\nEla fica neste mesmo andar na sala B107");
						
						//player.setAndar(false);
						
						new Mensagem("Recepcionista.png");
						
					}
				} catch (HeadlessException | IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		if (tileColisao(02, player, cena) == true) {
				try {
					if(ler("src/recursos/arquivos/stage.txt") == 2) {
						JOptionPane.showMessageDialog(null, "FIM DO DIA 1");
						escrever("src/recursos/arquivos/stage.txt", 5);
					}
					
					if(ler("src/recursos/arquivos/stage.txt") == 7) {
						JOptionPane.showMessageDialog(null, "FIM DO DIA 2");
						escrever("src/recursos/arquivos/stage.txt", 10);
					}
					
					if(ler("src/recursos/arquivos/stage.txt") == 12) {
						JOptionPane.showMessageDialog(null, "FIM DO DIA 3");
						int mediaPLEP1 = ler("src/recursos/arquivos/PLEP1nota1.txt") + ler("src/recursos/arquivos/PLEP1nota2.txt") + ler("src/recursos/arquivos/PLEP1nota3.txt");
						int mediaPLEI1 = ler("src/recursos/arquivos/PLEI1nota1.txt") + ler("src/recursos/arquivos/PLEI1nota2.txt") + ler("src/recursos/arquivos/PLEI1nota3.txt");
						if (mediaPLEP1 > 14 && mediaPLEI1 > 14) JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado em todas as disciplinas\n\nMédia PLEP1 = "+mediaPLEP1+"Média PELI1 = "+mediaPLEI1);
						else JOptionPane.showMessageDialog(null, "REPROVADO");
						escrever("src/recursos/arquivos/stage.txt", 15);
					}
				} catch (HeadlessException | IOException e) {
					
					e.printStackTrace();
				}
		}
		
		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {
				
				janela.setVisible(false);
				new Imagens("mapa.png", 1);
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