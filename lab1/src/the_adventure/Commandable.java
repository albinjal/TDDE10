package the_adventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Commandable {
	private Map<String, Command> commands = new HashMap<String, Command>();
	private String name;

	
	public Commandable(String name) {
		this.setName(name);
		this.addCommands();
	}
	
	public int doCommand(String cmd, Player player) {
		Command cmdAction = this.commands.get(cmd);
		if (cmdAction != null) {
			cmdAction.execute(player);
			return 1;
		}
		return 0;
	}
	
	public void help() {
		this.commands.keySet().forEach((String key) -> {
			System.out.println(key);
		});
	}
	
	public void addCommand(String cmd, Command run) {
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
