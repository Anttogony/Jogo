package jogo;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Imagens {
	
	public Imagens (String arquivo) {
		
		Window janela = new Window(800, 600);
		GameImage plano = new GameImage (URL.sprite(arquivo));
		Keyboard teclado = janela.getKeyboard();
		
		while (true) {
		plano.draw();
		janela.update();
		
		if (teclado.keyDown(Keyboard.ENTER_KEY)) {
			
			janela.setVisible(false);
			
		}
		
		}
	}

}
