package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ramen_panel extends JPanel {
	ImageIcon jin_ramen_image = new ImageIcon("images/jin_ramen.jpg");
	ImageIcon sin_ramen_image = new ImageIcon("images/sin_ramen.jpg");
	ImageIcon buldak_image = new ImageIcon("images/buldak.jpg");
	JLabel jin_ramen = new JLabel();
	JLabel sin_ramen = new JLabel();
	JLabel buldak = new JLabel();
	
	public ramen_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		jin_ramen.setText("Jin Ramen 3000won");
		jin_ramen.setIcon(jin_ramen_image);
		jin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		jin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		sin_ramen.setText("Sin Ramen 3000won");
		sin_ramen.setIcon(sin_ramen_image);
		sin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		sin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		buldak.setText("Buldak 3000won");
		buldak.setIcon(buldak_image);
		buldak.setHorizontalTextPosition(SwingConstants.CENTER);
		buldak.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		 add(jin_ramen);
		 add(sin_ramen);
		 add(buldak);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
