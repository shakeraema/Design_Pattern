package Structural.Command;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void executeCommand(String command) throws Exception {
        // Simulating command execution
        System.out.println("Executing command: " + command);
    }
}
