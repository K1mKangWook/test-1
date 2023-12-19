package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class best_panel extends JPanel {

	ImageIcon buldak_image = new ImageIcon("images/buldak.jpg");
	ImageIcon Nakgbibimbab_image = new ImageIcon("images/Nakgbibimbab.jpg");
	ImageIcon Mandoo_image = new ImageIcon("images/mandoo.jpg");
	JLabel buldak = new JLabel();
	JLabel Nakgbibimbab = new JLabel();
	JLabel mandoo = new JLabel();
	
	public best_panel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		buldak.setText("Buldak 3000won");
		buldak.setIcon(buldak_image);
		buldak.setHorizontalTextPosition(SwingConstants.CENTER);
		buldak.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		Nakgbibimbab.setText("NakgBibimBab 8000won");
		Nakgbibimbab.setIcon(Nakgbibimbab_image);
		Nakgbibimbab.setHorizontalTextPosition(SwingConstants.CENTER);
		Nakgbibimbab.setVerticalTextPosition(SwingConstants.BOTTOM);
			
		 mandoo.setText("Mandoo 3000won");
		 mandoo.setIcon(Mandoo_image);
		 mandoo.setHorizontalTextPosition(SwingConstants.CENTER);
		 mandoo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 
		 add(buldak);
		 add(Nakgbibimbab);
		 add(mandoo);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
