package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class beverage_panel extends JPanel {
	ImageIcon coke_image = new ImageIcon("images/coke.jpg");
	ImageIcon soda_image = new ImageIcon("images/soda.jpg");
	ImageIcon fanta_image = new ImageIcon("images/fanta.jpg");
	JLabel coke = new JLabel();
	JLabel soda = new JLabel();
	JLabel fanta = new JLabel();
	
	public beverage_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		coke.setText("Coke 2000won");
		coke.setIcon(coke_image);
		coke.setHorizontalTextPosition(SwingConstants.CENTER);
		coke.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		soda.setText("Soda 2000won");
		soda.setIcon(soda_image);
		soda.setHorizontalTextPosition(SwingConstants.CENTER);
		soda.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		fanta.setText("Fanta 2000won");
		fanta.setIcon(fanta_image);
		fanta.setHorizontalTextPosition(SwingConstants.CENTER);
		fanta.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		 add(coke);
		 add(soda);
		 add(fanta);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
