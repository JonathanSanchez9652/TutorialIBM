package pattern.command;

import java.time.Duration;

public class ExtendedCommand extends Command {

		
	public ExtendedCommand(Duration duration) {
		super(duration);
	}
	
	@Override
	public void run() {
		System.out.println("Hello from extendend command");
	}
	
	public final static void main(String[] args) {
		Command command = new ExtendedCommand(Duration.parse("pt1s"));
		System.out.println("Command must run at "+command.timeToRun());
		command.run();
	}

}
