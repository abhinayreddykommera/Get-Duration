package getDuration;

public class Main {

	public static void main(String[] args) {
		getDurationString(85);

	}
	
	public static String getDurationString(int minutes,int seconds){
		if(minutes<0 || (seconds<0 || seconds>60)) {
			return "Invalid value";
		}
			int XX = minutes/60;
			int YY = minutes;
			int ZZ = seconds;
			return XX + "h" + YY+ "m" + ZZ + "s";
		}
	
	public static String getDurationString(int seconds) {
		if(seconds<0) {
			return "Invalid value";
		}
		int minutes= seconds/60;
		int remainingSeconds = seconds % 60;
		
		
		String abc= getDurationString(minutes, remainingSeconds);
		
		return abc;	
	}

}
