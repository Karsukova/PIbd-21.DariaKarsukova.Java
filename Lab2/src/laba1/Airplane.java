package laba1;

import java.awt.Color;
import java.awt.Graphics;

public class Airplane extends Plane {

	protected final int planeWidth = 163;
	protected final int planeHeight = 160;

	public Airplane(int maxSpeed, float weight, Color mainColor) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
	}
	
	@Override
	public void DrawFighter(Graphics g) {        

	g.setColor(MainColor);
		g.fillOval((int) StartPosX + 28/ 3, (int) StartPosY + 40/ 3, (int) 140/ 3, (int) 30/ 3);
 	g.setColor(Color.black);
		g.drawOval((int) StartPosX + 28/ 3, (int) StartPosY + 40/ 3, (int) 140/ 3, (int) 30/ 3);

		g.setColor(MainColor);
	    g.fillOval((int) StartPosX + 60 / 3, (int) StartPosY + 130/ 3, (int) 80/ 3, (int) 15/ 3);
		g.setColor(Color.black);
		g.drawOval((int) StartPosX + 60 / 3, (int) StartPosY + 130/ 3, (int) 80/ 3, (int) 15/ 3);

		g.setColor(MainColor);
		g.fillOval((int) StartPosX + 80/ 3, (int) StartPosY - 6/ 3, (int) 40/ 3, (int) 160/ 3);
		g.setColor(Color.black);
		g.drawOval((int) StartPosX + 80/ 3, (int) StartPosY - 6/ 3, (int) 40/ 3, (int) 160/ 3);

		g.setColor(MainColor);
		g.fillOval((int) StartPosX + 85/ 3, (int) StartPosY + 26/ 3, (int) 30/ 3, (int) 15/ 3);
		g.setColor(Color.black);
		g.drawOval((int) StartPosX + 85/ 3, (int) StartPosY + 26/ 3, (int) 30/ 3, (int) 15/ 3);

		g.setColor(MainColor);
		g.fillOval((int) StartPosX + 97/ 3, (int) StartPosY + 120/ 3, (int) 7/ 3, (int) 30/ 3);
		g.setColor(Color.black);
		g.drawOval((int) StartPosX + 97/ 3, (int) StartPosY + 120/ 3, (int) 7/ 3, (int) 30/ 3);

		g.drawLine((int) StartPosX + 100/ 3, (int) StartPosY + 25/ 3, (int) StartPosX + 100/ 3, (int) StartPosY + 40/ 3);
	}

	public void moveTransport(Direction direction) {
		float step = getMaxSpeed() * 100 / getWeight();
		switch (direction) {
		case Right:
			if (StartPosX + step < PictureWidth - planeWidth) {
				StartPosX += step;
			}
			break;

		case Left:
			if (StartPosX - step > 0) {
				StartPosX -= step;
			}
			break;

		case Up:
			if (StartPosY - step > 0) {
				StartPosY -= step;
			}
			break;

		case Down:
			if (StartPosY + step < PictureHeight - planeHeight) {
				StartPosY += step;
			}
			break;
		}
	}

}
