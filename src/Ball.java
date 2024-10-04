import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{
	
	Random random;
	//how fast the ball will move on the X-axis
	int xVelocity;
	//how fast the ball will move on the Y-axis
	int yVelocity;
	
	Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if (randomXDirection == 0) 
			randomXDirection = 1;
		setXDirection(randomXDirection * 2);
		
		int randomYDirection = random.nextInt(2);
		if (randomYDirection == 0) 
			randomYDirection = 1;
		setYDirection(randomYDirection * 2);
	
		
	}
	
	public void setXDirection(int xDirection) {
		xVelocity = xDirection;
	}
	
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
