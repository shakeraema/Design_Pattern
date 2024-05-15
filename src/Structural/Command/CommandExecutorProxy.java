package Structural.Command;

public class CommandExecutorProxy implements CommandExecutor{
    private String userRole;
    private CommandExecutor executor;

    public CommandExecutorProxy(String userRole) {
        this.userRole = userRole;
        this.executor = new CommandExecutorImpl();
    }
    @Override
    public void executeCommand(String command) throws Exception {
        if ("admin".equalsIgnoreCase(userRole)) {
            executor.executeCommand(command);
        } else if ("normal_user".equalsIgnoreCase(userRole)) {
            if (!command.toLowerCase().startsWith("rm -rf")) {
                executor.executeCommand(command);
            } else {
                throw new Exception("Permission denied for command: " + command);
            }
        } else {
            throw new Exception("Invalid user role");
        }
    }
}

