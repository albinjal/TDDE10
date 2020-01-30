package the_adventure;

import java.util.HashMap;
import java.util.Map;

public abstract class Commandable {
	Map<String, Runnable> commands = new HashMap<>();
	
	public Commandable() {
		this.commands.put("help", () -> help());
	}
	
	public void doCommand(String cmd) {
		this.commands.getOrDefault(cmd, ()-> System.out.print("hittas inte")).run();
	}
	
	final protected void help() {
		this.commands.keySet().forEach((String key) -> {
			System.out.println(key);
		});
	}
}
