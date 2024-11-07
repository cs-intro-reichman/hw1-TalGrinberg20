// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String suffix;

		if (hours > 12) 
		{
			suffix = "PM";
			hours = hours-12;
		}
		else 
			if (hours < 12)
			{
			suffix = "AM";
			}
			else {
				suffix = "PM";
			}
		/*if (minutes < 10){
			System.out.printf("%02d", minutes);
		}*/
System.out.println(Integer.toString(hours) + ":" + String.format("%02d", minutes) + " " + suffix);
	}
}