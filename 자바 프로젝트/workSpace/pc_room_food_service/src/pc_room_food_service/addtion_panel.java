package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class addtion_panel  extends JPanel{
	ImageIcon kimchi_image = new ImageIcon("images/kimchi.jpg");
	ImageIcon danmooji_image = new ImageIcon("images/danmooji.jpg");
	JLabel kimchi = new JLabel();
	JLabel danmooji = new JLabel();
	
	public addtion_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		kimchi.setText("Kimchi Free");
		kimchi.setIcon(kimchi_image);
		kimchi.setHorizontalTextPosition(SwingConstants.CENTER);
		kimchi.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		danmooji.setText("Danmooji Free");
		danmooji.setIcon(danmooji_image);
		danmooji.setHorizontalTextPosition(SwingConstants.CENTER);
		danmooji.setVerticalTextPosition(SwingConstants.BOTTOM);
	
		add(kimchi);
		add(danmooji);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
