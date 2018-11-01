package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Scene;

import jplay.Window;
import jplay.URL;

public class CenarioInicial {
	
	private Window janela;
	private Scene cena;
	
	public CenarioInicial (Window window) {
		
		janela = window;
		cena = new Scene();
		GameImage plano = new GameImage (URL.tile("fundo.png"));
		
		plano.draw();
		janela.update();
		
		
	}

}