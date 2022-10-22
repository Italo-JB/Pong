package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	
	public double x,y;
	public int width, height;
	
	//metodo construtor
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		
		
	}
	
	
	public void tick() {
		x += (Game.ball.x - x - 6) * 0.07;
		
		Rectangle rect1 = new Rectangle((int)x, (int)y, width, height);
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}
		else if(x < 0) {
			x = 0;
		}
	
		
		
	}
	
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		//tem que ser valor inteiro a posição
		g.fillRect((int)x,(int) y, 40, 5);
		
		
		
	}

}
