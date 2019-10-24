import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Canvas");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    
	    frame.add(panel);

	    frame.setSize(500, 500);
	    frame.setVisible(true);

	}
	
	public void paintComponent(Graphics g){
		Color tomatoesSuck = new Color (252, 48, 85);
		Color meanGreenBeans = new Color (94, 235, 73);
		
		//g.drawLine(0,0,50,50); 
		g.setColor(tomatoesSuck);
		//g.drawOval(75,75,75,75);
		g.fillOval(120, 120, 220, 220);
		
		g.setColor(meanGreenBeans);
		int x [] = {230, 180, 210};
		int y [] = {110, 140, 160};
		g.fillPolygon(x, y, 3);
		
		int xOne [] = {230, 220, 240};
		int yOne [] = {110, 160, 150};
		g.fillPolygon(xOne, yOne, 3);
		
		int xTwo [] = {230, 280, 260};
		int yTwo [] = {110, 140, 160};
		g.fillPolygon(xTwo, yTwo, 3);
		
		int xThird [] = {230, 190, 190};
		int yThird [] = {110, 100, 120};
		g.fillPolygon(xThird, yThird, 3);
		
		int xFourth [] = {230, 270, 270};
		int yFourth [] = {110, 90, 110};
		g.fillPolygon(xFourth, yFourth, 3);
		
		//g.drawRect (225, 105, 20, 60);
		//g.fillRect (225, 70, 10, 60);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 32));
		g.drawString("Games", 180, 270);
		g.drawString("Noodle", 180, 220);
		
	}

}
