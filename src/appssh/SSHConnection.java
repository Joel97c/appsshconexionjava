package appssh;
import com.jcraft.jsch.JSchException;
import java.io.IOException;

public class SSHConnection {
     private static final String USERNAME = "WilyProx64";
    private static final String HOST = "209.97.150.54";
    private static final int PORT = 443;
    private static final String PASSWORD = "81761144@x64@";
 
    public static void main(String[] args) {
 
        try {
            SSHConnector sshConnector = new SSHConnector();
             
             
            sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
            String result = sshConnector.executeCommand("ls -l");
            sshConnector.disconnect();
             
            System.out.println(result);
        } catch (JSchException | IllegalAccessException | IOException ex) {
             
            System.out.println(ex.getMessage());
        }
    }
    
}
