package main;

class Player {
	int heat = 50;
	int hunger = 50;
	int thirst = 50;
	int energy = 50;
	int time = 0;
	public static void main(String[] args) {
		
	}
	public void rest(int t, int fire) {
		time = t;
		heat += t*25;
		energy += t*10;
	}


}
