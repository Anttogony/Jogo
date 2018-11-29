package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Imagens {
	
	public Imagens (String caminho, int n) {
		
		Window janela = new Window(800, 600);
		GameImage plano = new GameImage (URL.sprite(caminho));
		Keyboard teclado = janela.getKeyboard();
		
		while (true) {
			plano.draw();
			janela.update();
			
			if (teclado.keyDown(Keyboard.ENTER_KEY)) {
				
				if (n == 1) new CenarioInicial(janela, 'M');
				if (n == 2) new CenarioInicial(janela, 'W');
				if (n == 3) new B203(janela, '1');
				if (n == 4) new B203(janela, '2');
				if (n == 5) new B203(janela, '3');
				
				
			}
		}
	}
}
