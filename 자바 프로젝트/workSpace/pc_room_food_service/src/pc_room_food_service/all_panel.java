package pc_room_food_service;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class all_panel extends JPanel {
	//meal
	ImageIcon kimchi_rice_image = new ImageIcon("images/kimchi_rice.jpg");
	ImageIcon chicken_mayo_image = new ImageIcon("images/chicken_mayo.jpg");
	ImageIcon Nakgbibimbab_image = new ImageIcon("images/Nakgbibimbab.jpg");
	JLabel kimchi_rice = new JLabel();
	JLabel chicken_mayo = new JLabel();
	JLabel Nakgbibimbab = new JLabel();
	
	//Ramen
	ImageIcon jin_ramen_image = new ImageIcon("images/jin_ramen.jpg");
	ImageIcon sin_ramen_image = new ImageIcon("images/sin_ramen.jpg");
	ImageIcon buldak_image = new ImageIcon("images/buldak.jpg");
	JLabel jin_ramen = new JLabel();
	JLabel sin_ramen = new JLabel();
	JLabel buldak = new JLabel();
	
	//Beverage
	ImageIcon coke_image = new ImageIcon("images/coke.jpg");
	ImageIcon soda_image = new ImageIcon("images/soda.jpg");
	ImageIcon fanta_image = new ImageIcon("images/fanta.jpg");
	JLabel coke = new JLabel();
	JLabel soda = new JLabel();
	JLabel fanta = new JLabel();
	
	//Snack
	ImageIcon hotbar_image = new ImageIcon("images/hotbar.jpg");
	ImageIcon nugget_image = new ImageIcon("images/nugget.jpg");
	ImageIcon mandoo_image = new ImageIcon("images/mandoo.jpg");
	JLabel hotbar = new JLabel();
	JLabel nugget = new JLabel();
	JLabel mandoo = new JLabel();
	
	GoodsOrder goodsOrder;
	
	public all_panel(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
		setLayout(new FlowLayout(FlowLayout.LEFT,10,15));
		
		//meal
		 kimchi_rice.setText("Kimchi Rice 6000won");
		 kimchi_rice.setIcon(kimchi_rice_image);
		 kimchi_rice.setHorizontalTextPosition(SwingConstants.CENTER);
		 kimchi_rice.setVerticalTextPosition(SwingConstants.BOTTOM);
		 kimchi_rice.addMouseListener(goodsOrder.orderList);
		
		 chicken_mayo.setText("Chicken Mayo 6000won");
		 chicken_mayo.setIcon(chicken_mayo_image);
		 chicken_mayo.setHorizontalTextPosition(SwingConstants.CENTER);
		 chicken_mayo.setVerticalTextPosition(SwingConstants.BOTTOM);
		 chicken_mayo.addMouseListener(goodsOrder.orderList);
		 
		 Nakgbibimbab.setText("NakgiBibimbab 8000won");
		 Nakgbibimbab.setIcon(Nakgbibimbab_image);
		 Nakgbibimbab.setHorizontalTextPosition(SwingConstants.CENTER);
		 Nakgbibimbab.setVerticalTextPosition(SwingConstants.BOTTOM);
		 Nakgbibimbab.addMouseListener(goodsOrder.orderList);
		
	
		 add(kimchi_rice);
		 add(chicken_mayo);
		 add(Nakgbibimbab);
	
		 //ramen
		 jin_ramen.setText("Jin Ramen 3000won");
		 jin_ramen.setIcon(jin_ramen_image);
		 jin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		 jin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		 jin_ramen.addMouseListener(goodsOrder.orderList);
			
		 sin_ramen.setText("Sin Ramen 3000won");
		 sin_ramen.setIcon(sin_ramen_image);
		 sin_ramen.setHorizontalTextPosition(SwingConstants.CENTER);
		 sin_ramen.setVerticalTextPosition(SwingConstants.BOTTOM);
		 sin_ramen.addMouseListener(goodsOrder.orderList);
			
		 buldak.setText("Buldak 3000won");
		 buldak.setIcon(buldak_image);
		 buldak.setHorizontalTextPosition(SwingConstants.CENTER);
		 buldak.setVerticalTextPosition(SwingConstants.BOTTOM);
		 buldak.addMouseListener(goodsOrder.orderList);
			
		
		 add(jin_ramen);
		 add(sin_ramen);
		 add(buldak);
		 
		 
		 //beverage
		 coke.setText("Coke 2000won");
		 coke.setIcon(coke_image);
		 coke.setHorizontalTextPosition(SwingConstants.CENTER);
		 coke.setVerticalTextPosition(SwingConstants.BOTTOM);
		 coke.addMouseListener(goodsOrder.orderList);
			
		 soda.setText("Soda 2000won");
		 soda.setIcon(soda_image);
		 soda.setHorizontalTextPosition(SwingConstants.CENTER);
		 soda.setVerticalTextPosition(SwingConstants.BOTTOM);
		 soda.addMouseListener(goodsOrder.orderList);
			
		 fanta.setText("Fanta 2000won");
		 fanta.setIcon(fanta_image);
		 fanta.setHorizontalTextPosition(SwingConstants.CENTER);
		 fanta.setVerticalTextPosition(SwingConstants.BOTTOM);
		 fanta.addMouseListener(goodsOrder.orderList);
			
		
		 add(coke);
		 add(soda);
	     add(fanta);
		 
		 
		//snack 
		hotbar.setText("Hotbar 2000won");
		hotbar.setIcon(hotbar_image);
		hotbar.setHorizontalTextPosition(SwingConstants.CENTER);
		hotbar.setVerticalTextPosition(SwingConstants.BOTTOM);
		hotbar.addMouseListener(goodsOrder.orderList);
		
		nugget.setText("Nugget 3000won");
		nugget.setIcon(nugget_image);
		nugget.setHorizontalTextPosition(SwingConstants.CENTER);
		nugget.setVerticalTextPosition(SwingConstants.BOTTOM);
		nugget.addMouseListener(goodsOrder.orderList);
		
		mandoo.setText("Mandoo 3000won");
		mandoo.setIcon(mandoo_image);
		mandoo.setHorizontalTextPosition(SwingConstants.CENTER);
		mandoo.setVerticalTextPosition(SwingConstants.BOTTOM);
		mandoo.addMouseListener(goodsOrder.orderList);
		
	
		 add(hotbar);
		 add(nugget);
		 add(mandoo);
		
		setBackground(Color.white);
		setSize(1100,850);
	}
}
