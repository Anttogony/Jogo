package jogo;

import java.awt.Point;
import java.util.Vector;

import jplay.GameObject;
import jplay.Scene;
import jplay.TileInfo;

public abstract class CenarioP {
	
	protected boolean tileColisao(int valor, Jogador player, Scene cena) {
		
		Point min = new Point ((int)player.x, (int)player.y);
		Point max = new Point ((int)(player.x + player.width), (int)(player.y + player.height));
		Vector<?> tiles = cena.getTilesFromPosition(min, max);
		
		for(int i = 0; i < tiles.size(); i++) {
			
			TileInfo tile = (TileInfo) tiles.elementAt(i);
			if (tileColisao(player, tile, valor)) return true;
			
		}
		
		return false;
	}
	
	private boolean tileColisao(GameObject object, TileInfo tile, int valor) {
		
		if((tile.id == valor) && object.collided(tile)) return true;
		return false;
		
	}

}
