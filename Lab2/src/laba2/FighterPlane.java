package laba2;

import java.awt.Color;
import java.awt.Graphics;

public class FighterPlane extends Airplane{

    private Color DopColor;
    
    public Color getAddColor() {
        return DopColor;
    }

    public void setAddColor(Color value) {
        DopColor = value;
    }
    
    private boolean Weapon;
    
    public boolean getMagneticCushion() {
        return Weapon;
    }

    public void setMagneticCushion(boolean value) {
        Weapon = value;
    }

    private boolean Line;
    
    public boolean getBackSpoiler() {
        return Line;
    }

    public void setBackSpoiler(boolean value) {
        Line = value;
    }

    
    public FighterPlane(int maxSpeed, float weight, Color mainColor, Color addColor, boolean weapon, boolean line) {
    	super(maxSpeed, weight, mainColor);
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
        DopColor = addColor;
        Weapon = weapon;    
        Line = line;

    }
    
    @Override
    public void Draw(Graphics g) {
        g.setColor(Color.RED);
    	if (Weapon)
        {
    		
            g.fillOval((int)StartPosX + 145, (int)StartPosY + 40, (int)7, (int)25);
            g.fillOval((int)StartPosX + 134, (int)StartPosY + 35, (int)7, (int)25);
            g.fillOval((int)StartPosX + 122, (int)StartPosY + 32, (int)7, (int)25);
            
            g.fillOval((int)StartPosX + 48, (int)StartPosY + 40, (int)7, (int)25);
            g.fillOval((int)StartPosX + 59, (int)StartPosY + 35, (int)7, (int)25);
            g.fillOval((int)StartPosX + 70, (int)StartPosY + 32, (int)7, (int)25);
           
        }
    	super.Draw(g);
    	
    	if (Line)
        {
    		g.setColor(Color.RED);
            g.drawLine((int)StartPosX + 100, (int)StartPosY + 125,(int) StartPosX + 100,(int) StartPosY + 40);
            g.drawLine((int)StartPosX + 80, (int)StartPosY + 105,(int) StartPosX + 120,(int) StartPosY + 105);
        }
         
    }
}