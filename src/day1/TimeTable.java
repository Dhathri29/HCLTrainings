package day1;

public class TimeTable {
	public static void main(String[] args) {
	
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.format("%3d ", i * j);
				if ((j % 10) == 0) {
					System.out.println();
				}
			}
		}
	}
}