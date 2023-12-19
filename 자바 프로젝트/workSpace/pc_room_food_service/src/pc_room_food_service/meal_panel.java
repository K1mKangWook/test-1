package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class meal_panel extends JPanel {
	ImageIcon kimchi_rice_image = new ImageIcon("images/kimchi_rice.jpg");
	ImageIcon chicken_mayo_image = new ImageIcon("images/chicken_mayo.jpg");
	ImageIcon Nakgbibimbab_image = new ImageIcon("images/Nakgbibimbab.jpg");
	JLabel kimchi_rice = new JLabel();
	JLabel chicken_mayo = new JLabel();
	JLabel Nakgbibimbab = new JLabel();
	
	public meal_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		 kimchi_rice.setText("Kimchi Rice 6000won");
		 kimchi_rice.setIcon(kimchi_rice_image);
		 kimchi_rice.setHorizontalTextPosition(SwingConstants.CENTER);
		 kimchi_rice.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		 chicken_mayo.setText("Chicken Mayo 6000won");
		 chicken_mayo.setIcon(chicken_mayo_image);
		 chicken_mayo.setHorizontalTextPosition(SwingConstants.CENTER);
		 chicken_mayo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 
		 Nakgbibimbab.setText("NakgiBibimbab 8000won");
		 Nakgbibimbab.setIcon(Nakgbibimbab_image);
		 Nakgbibimbab.setHorizontalTextPosition(SwingConstants.CENTER);
		 Nakgbibimbab.setVerticalTextPosition(SwingConstants.BOTTOM);
		
	
		 add(kimchi_rice);
		 add(chicken_mayo);
		 add(Nakgbibimbab);
		
		setBackground(Color.white);
		setSize(1100,850);
	}

}
