package pong;

import java.awt.Color;
import java.awt.Graphics;
//pontuação do inimigo
public class Pontuacao {
	public static int p, e;
	
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString(this.toString(p), 0, Game.HEIGHT/2);
		g.setColor(Color.yellow);
		g.drawString(this.toString(e), Game.WIDTH - 6, Game.HEIGHT/2);
		
	}

	private String toString(int e2) {
		// TODO Auto-generated method stub
		return null;
	}
	



}
