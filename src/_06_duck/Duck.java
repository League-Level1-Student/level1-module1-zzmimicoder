package _06_duck;
public class Duck {
	String favoriteFood;
	int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	void quack() {
		System.out.println("QUACK QUACK QUACK");
	}
	void waddle() {
		System.out.println("WADDLE WADDLE WADDLE");
	}
}
