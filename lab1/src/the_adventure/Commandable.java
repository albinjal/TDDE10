package the_adventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Commandable {
	private Map<String, Runnable> commands = new HashMap<>();
	
	public Commandable() {
		this.addCommands();
	}
	
	public boolean doCommand(String cmd) {
		Runnable run = this.commands.get(cmd);
		if (run != null) {
			run.run();
			return true;
		}
		this.commandNotFound(cmd);
		return false;
	}
	
	protected void help() {
		this.commands.keySet().forEach((String key) -> {
			System.out.println(key);
		});
	}
	
	protected void addCommand(String cmd, Runnable run) {
		this.commands.put(cmd, run);
	}
	
	protected abstract void commandNotFound(String cmd);
	
	protected void cantExecuteCommand() {
		System.out.println("This command cant be executed at this point and time");
	}
	
	protected void addCommands() {
		this.commands.put("help", () -> help());
	}
}
