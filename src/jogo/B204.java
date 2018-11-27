package jogo;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;
import jplay.URL;

public class B204 extends CenarioP {

	private Window janela;
	private Scene cena;
	private Jogador player;
	private Keyboard teclado;

	public B204(Window w) {

		janela = w;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("B204.scn"));
		player = new Jogador(550, 450);
		teclado = janela.getKeyboard();
		// Audio.play("Ebano.mid");

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

					if (ler("src/recursos/arquivos/stage.txt") == 1)
						JOptionPane.showMessageDialog(null,
								"Olá, Jovem aluno!\nEu sou o Professor Wagner e ministro as aulas de PRATICAS DE LEITURA E ESCRITA EM INGLES\nVá até a sua cadeira!\n");
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

		if (tileColisao(03, player, cena) == true) {
			if (teclado.keyDown(Keyboard.D_KEY)) {

				try {
					if (ler("src/recursos/arquivos/stage.txt") == 1) {

						Quiz questao = new Quiz();
						int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
						JOptionPane.showMessageDialog(null,
								"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
						try {
							escrever("src/recursos/arquivos/stage.txt", 2);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (ler("src/recursos/arquivos/stage.txt") == 6) {

						Quiz questao = new Quiz();
						int resul = questao.perguntar(ler("src/recursos/arquivos/stage.txt"));
						JOptionPane.showMessageDialog(null,
								"SUA NOTA HOJE FOI: " + resul + "\nVocê acertou " + resul / 2 + " questões");
						try {
							escrever("src/recursos/arquivos/stage.txt", 10);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (HeadlessException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void mudarCenario() {
		if (tileColisao(06, player, cena) == true) {

			new B2(janela, 'F');
		}
	}

}