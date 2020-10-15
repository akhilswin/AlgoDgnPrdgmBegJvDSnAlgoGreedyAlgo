package yaksha;

public class WaterConnection {
	private int numberOfHouses, numberOfPipes;
	// int arr[][]=new int[6][3];
	private int array[][];

	public WaterConnection(int numberOfHouses, int numberOfPipes, int[][] array) {
		super();
		this.numberOfHouses = numberOfHouses;
		this.numberOfPipes = numberOfPipes;
		this.array = array;
	}

	public int getNumberOfHouses() {
		return numberOfHouses;
	}

	public void setNumberOfHouses(int numberOfHouses) {
		this.numberOfHouses = numberOfHouses;
	}

	public int getNumberOfPipes() {
		return numberOfPipes;
	}

	public void setNumberOfPipes(int numberOfPipes) {
		this.numberOfPipes = numberOfPipes;
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}
}
