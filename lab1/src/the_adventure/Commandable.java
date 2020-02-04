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
		return 0;
	}
	
	public void help() {
		this.commands.keySet().forEach((String key) -> {
			System.out.println(key);
		});
	}
	
	public void addCommand(String cmd, Runnable run) {
		this.commands.put(cmd, run);
	}
	
	public void cantExecuteCommand() {
		System.out.println("This command cant be executed at this point and time");
	}
	
	public abstract void addCommands();
	
	public void deleteCommand(String cmd) {
		this.commands.remove(cmd);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
