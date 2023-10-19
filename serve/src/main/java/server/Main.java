package server;

import com.corundumstudio.socketio.*;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(3001);

        SocketIOServer server = new SocketIOServer(config);
        /*SocketConfig sockConfig = new SocketConfig();
        sockConfig.setReuseAddress(true);*/

        server.addConnectListener(client -> {
            System.out.println("\n" + //
                    "\n" + //
                    "#    ___  __   __ _  ____  ___  ____  __   ____   __  \n" + //
                    "#   / __)/  \\ (  ( \\(  __)/ __)(_  _)/ _\\ (    \\ /  \\ \n" + //
                    "#  ( (__(  O )/    / ) _)( (__   )( /    \\ ) D ((  O )\n" + //
                    "#   \\___)\\__/ \\_)__)(____)\\___) (__)\\_/\\_/(____/ \\__/ \n" + //
                    "\n" + //
                    "");
        });
        
        server.addDisconnectListener(client -> {
            System.out.println("\n" + //
                    "\n" + //
                    "#   ____  ____  ____   ___  __   __ _  ____  ___  ____  __   ____   __  \n" + //
                    "#  (    \\(  __)/ ___) / __)/  \\ (  ( \\(  __)/ __)(_  _)/ _\\ (    \\ /  \\ \n" + //
                    "#   ) D ( ) _) \\___ \\( (__(  O )/    / ) _)( (__   )( /    \\ ) D ((  O )\n" + //
                    "#  (____/(____)(____/ \\___)\\__/ \\_)__)(____)\\___) (__)\\_/\\_/(____/ \\__/ \n" + //
                    "\n" + //
                    "");
        });
        
        server.start();
        System.out.println("Server inicializado em: http://" + config.getHostname() + ":" + config.getPort());

    }
}