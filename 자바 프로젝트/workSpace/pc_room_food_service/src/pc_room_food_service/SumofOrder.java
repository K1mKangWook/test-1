package pc_room_food_service;

public class SumofOrder {
	int sum;
	
	public SumofOrder() {
		sum = 0;
	}
	
	public void addsum(int price) {
		sum = sum + price;
	}
	
	public int getSum() {
		return sum;
	}
}
