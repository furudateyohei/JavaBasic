package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	
	int run() {
		this.gasoline-=1;
		if(this.gasoline<0) {
			return -1;
		}
		int distance = new java.util.Random().nextInt(15);
		return distance +1;
	}
	
}
