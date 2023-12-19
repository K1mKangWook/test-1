package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class setMenu_panel extends JPanel {
	ImageIcon ramen_coke_image = new ImageIcon("images/ramen_coke.jpg");
	ImageIcon ramen_coke_rice_image = new ImageIcon("images/ramen_coke_rice.jpg");
	JLabel ramen_coke = new JLabel();
	JLabel ramen_coke_rice = new JLabel();
	
	public setMenu_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		ramen_coke.setText("Ramen + Coke 6000won");
		ramen_coke.setIcon(ramen_coke_image);
		ramen_coke.setHorizontalTextPosition(SwingConstants.CENTER);
		ramen_coke.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		ramen_coke_rice.setText("Ramen + Coke + Rice 7000won");
		ramen_coke_rice.setIcon(ramen_coke_rice_image);
		ramen_coke_rice.setHorizontalTextPosition(SwingConstants.CENTER);
		ramen_coke_rice.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		 add(ramen_coke);
		 add(ramen_coke_rice);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
