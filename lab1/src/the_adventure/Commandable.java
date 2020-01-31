package the_adventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Commandable {
	private Map<String, Runnable> commands = new HashMap<>();
	private String name;

	
	public Commandable(String name) {
		this.setName(name);
		this.addCommands();
	}
	
	public int doCommand(String cmd) {
		Runnable run = this.commands.get(cmd);
		if (run != null) {
			run.run();
			return 1;
		}
		this.commandNotFound(cmd);
		return 0;
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
	
	protected abstract void addCommands();
	
	protected void deleteCommand(String cmd) {
		this.commands.remove(cmd);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
