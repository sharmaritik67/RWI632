package program;

public class finalVariable {
 
	final int speedLimit=90;
	void run() {
		speedLimit=400;//compile time error
	}
	public static void main(String[] args) {
		finalVaribale b=new finalVariable();
		b.run();
		
		}
}
