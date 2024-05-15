package Structural.Command;

public class Main {
    public static void main(String[] args) {
        CommandExecutor adminExecutor = new CommandExecutorProxy("admin");
        try {
            adminExecutor.executeCommand("ls -l");
            adminExecutor.executeCommand("rm -rf /"); // Admin has permission for this command
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        CommandExecutor normalUserExecutor = new CommandExecutorProxy("normal_user");
        try {
            normalUserExecutor.executeCommand("ls -l");
            normalUserExecutor.executeCommand("rm -rf /"); // Normal user doesn't have permission for this command
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
