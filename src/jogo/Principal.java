package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;
import jplay.URL;

public class Principal {

	public static void main(String[] args) {

		Window janela = new Window(800, 600);
		GameImage plano = new GameImage (URL.sprite("inicio.png"));
		Keyboard teclado = janela.getKeyboard();
		
		while (true) {
		plano.draw();
		janela.update();
		
		if (teclado.keyDown(Keyboard.ENTER_KEY)) {
			
			new CenarioInicial(janela);
			
			}
		
		}
		
	}

}
