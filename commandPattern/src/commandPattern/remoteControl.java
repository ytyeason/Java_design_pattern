package commandPattern;

public class remoteControl {
	public remoteControl(Command c){
		c.execute();//based on run time type
	}
	
	public static void main(String[] args){
		Command lightOff = new lightOffCommand();
		remoteControl r = new remoteControl(lightOff);
		
		Command lightOn = new lightOnCommand();
		remoteControl r1 = new remoteControl(lightOn);
	}
}
