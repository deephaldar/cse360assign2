
package cse360assign2;

public class AddingMachine {

	private int total; 
	private String history;
	
	//Initializes the required variables used throughout the program
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0"; //sets the string of history to 0
	}
	
	//Returns the total
	public int getTotal () {
		return total;
	}
	
	//A certain value of transaction is added to the current total
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	//A certain value of transaction is subtracted from the current total
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	//Returns all the transaction history from 0
	public String toString () {
		return history;
	}

	//Clears the history and total by setting them back to 0
	public void clear() {
		total = 0;
		history = "0";
	}
}
