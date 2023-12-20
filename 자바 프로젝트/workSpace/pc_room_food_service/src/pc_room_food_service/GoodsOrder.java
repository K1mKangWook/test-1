package pc_room_food_service;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class GoodsOrder extends JFrame {
	Container c;
	JTextArea order_details;
	JTextArea sum;
	OrderList orderList = new OrderList(this);
	SumofOrder sumofOrder = new SumofOrder();
	
	public GoodsOrder() {
		setTitle("GoodsOrder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		/*
		 * origin panel
		 */
		all_panel all_panel = new all_panel(this);
		all_panel.setLocation(0, 50);
		c.add(all_panel);	
		/*
		 * Define JLabel
		 */
		JLabel Back_right = new JLabel();
		JLabel Back_menu_bar = new JLabel();
		JLabel best = new JLabel("Best", SwingConstants.CENTER);
		JLabel all = new JLabel("All", SwingConstants.CENTER);
		JLabel setMenu = new JLabel("SetMenu", SwingConstants.CENTER);
		JLabel meal = new JLabel("Meal", SwingConstants.CENTER);
		JLabel ramen = new JLabel("Ramen", SwingConstants.CENTER);
		JLabel beverage = new JLabel("Beverage", SwingConstants.CENTER);
		JLabel snack = new JLabel("Snack", SwingConstants.CENTER);
		JLabel addition = new JLabel("Addition", SwingConstants.CENTER);
			
		JLabel order_box = new JLabel(); //It means Order information like (price, quantity so on..)
			
		JLabel pay_box = new JLabel(); //It means pay_method Frame
		JLabel pay_information = new JLabel("Pay Information"); //It means that how to pay
		
		/*
		 * /Define order button  
		 */
		ImageIcon order_image = new ImageIcon("images/order_button_image.jpg");
		JButton order = new JButton();
		order.setIcon(order_image);
		
	
			
		/*
		 * Define radio Button
		 */
		ButtonGroup pay_group = new ButtonGroup(); //How to pay Group
		JRadioButton howtopay[] = new JRadioButton[2]; //How to pay with JRadioButton
		String pay_name[] = {"Credit", "Cash"}; //set Button name
		
		//set the Radio button(how to pay) to add on the container and add ItemListener
		for (int i = 0; i < 2; i++) {
			howtopay[i] = new JRadioButton(pay_name[i]);
			pay_group.add(howtopay[i]);
			c.add(howtopay[i]);
		} 
		
		/*
		 * Define JTextField
		 */
		JTextField request = new JTextField("Request", 20); //Users can write their request 
		
		/*
		 * Define JComboBox
		 */
		String[] money = {"1000", "5000" , "10000" , "50000"}; //Users can select the money to pay
		JComboBox<String> moneycombo = new JComboBox<String>(money); 
		
		/*
		 * Define JTextArea
		 */
		order_details = new JTextArea(7,20);
		JScrollPane scrollPane = new JScrollPane(order_details);
		order_details.append("You can check the product you ordered.\n");
		scrollPane.setBounds(1132,450,420,160);
		c.add(scrollPane);
		
		sum = new JTextArea(7,20);
		sum.setBounds(1132,620, 420,30);
		c.add(sum);
		
		/*
		 * Define reset button
		 */
		JButton reset = new JButton("Reset");
		reset.addMouseListener(new ClickReset(this));
		reset.setBounds(1452,424,100,20);
		c.add(reset);
		
		/*
		 * set Location background
		 */
		Back_right.setBounds(1100,0,500,900);
		Back_menu_bar.setBounds(0,0,1600,50);
		
		/*
		 * set Location Menu
		 */
		all.setBounds(0,0,137,50);
		best.setBounds(137,0,137,50);
		setMenu.setBounds(274,0,137,50);
		meal.setBounds(411,0,137,50);
		ramen.setBounds(548,0,137,50);
		beverage.setBounds(685,0,137,50);
		snack.setBounds(822,0,137,50);
		addition.setBounds(959,0,141,50);
			
		/*
		 * set location order area
		 */
		order_box.setBounds(1105,5,473,390); //order information
		
		/*
		 * set location pay	area
		 */
		pay_box.setBounds(1105 ,400, 473, 455);
		pay_information.setBounds(1120,400,200,50); //pay information
		order.setBounds(1130,737, 423,100); //order button
		request.setBounds(1132, 660, 420,30); //Text request
		//set Location Button
		howtopay[0].setBounds(1132, 700,100,30);
		howtopay[1].setBounds(1232,700,100,30);
		moneycombo.setBounds(1335,700,60,30);
					
		//set background color Label
		c.setBackground(Color.black);
		Back_right.setBackground(Color.white);
		Back_right.setOpaque(true);
		Back_menu_bar.setBackground(Color.white);
		Back_menu_bar.setOpaque(true);
		all.setBackground(Color.white);
		all.setOpaque(true);
		best.setBackground(Color.white);
		best.setOpaque(true);
		setMenu.setBackground(Color.white);
		setMenu.setOpaque(true);
		meal.setBackground(Color.white);
		meal.setOpaque(true);
		ramen.setBackground(Color.white);
		ramen.setOpaque(true);
		beverage.setBackground(Color.white);
		beverage.setOpaque(true);
		snack.setBackground(Color.white);
		snack.setOpaque(true);
		addition.setBackground(Color.white);
		addition.setOpaque(true);
			
		order_box.setBackground(Color.gray);
		order_box.setOpaque(true);
			
		pay_box.setBackground(Color.gray);
		pay_box.setOpaque(true);
			
		//set foreground color Label
		pay_information.setForeground(Color.white);
						
		//set border Label
		LineBorder border = new LineBorder(Color.black,2);
		all.setBorder(border);
		best.setBorder(border);
		setMenu.setBorder(border);
		meal.setBorder(border);
		ramen.setBorder(border);
		beverage.setBorder(border);
		snack.setBorder(border);
		addition.setBorder(border);
			
		//set font, size
		best.setFont(best.getFont().deriveFont(20.0f));
		all.setFont(all.getFont().deriveFont(20.0f));
		setMenu.setFont(setMenu.getFont().deriveFont(20.0f));
		all.setFont(all.getFont().deriveFont(20.0f));
		meal.setFont(meal.getFont().deriveFont(20.0f));
		ramen.setFont(ramen.getFont().deriveFont(20.0f));
		beverage.setFont(beverage.getFont().deriveFont(20.0f));
		snack.setFont(snack.getFont().deriveFont(20.0f));
		addition.setFont(addition.getFont().deriveFont(20.0f));
		pay_information.setFont(pay_information.getFont().deriveFont(20.0f));
						
		//add MouseListener
		OnTheMenu click_motion = new OnTheMenu(this);
		all.addMouseListener(click_motion);
		best.addMouseListener(click_motion);
		setMenu.addMouseListener(click_motion);
		meal.addMouseListener(click_motion);
		ramen.addMouseListener(click_motion);
		beverage.addMouseListener(click_motion);
		snack.addMouseListener(click_motion);
		addition.addMouseListener(click_motion);
		
		order.addMouseListener(new ClickOrder(this));
		
												
		//Menu area
		c.add(all);
		c.add(best);
		c.add(setMenu);
		c.add(meal);
		c.add(ramen);
		c.add(beverage);
		c.add(snack);
		c.add(addition);
			
		c.add(Back_menu_bar);
			
		// right area			
		c.add(order_box);			
		c.add(pay_information);
		c.add(order);
		c.add(moneycombo);
		c.add(pay_box);
		c.add(request);
		c.add(Back_right);
	
									
		setSize(1600,900);
		setVisible(true);
	}
	
	public Container getContainer() {
		return c;
	}
	
	public JTextArea getTextArea() {
		return order_details;
	}
		
	public JTextArea getSum() {
		return sum;
	}
	
	public SumofOrder getSumofOrder() {
		return sumofOrder;
	}
	
	public void switchPanel(JPanel panel) {
		c.removeAll();
		c.add(panel);
		c.revalidate();
		c.repaint();
	}
	
}


