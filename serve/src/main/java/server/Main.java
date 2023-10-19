package server;

import com.corundumstudio.socketio.*;
import com.corundumstudio.socketio.listener.DataListener;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(3001);

        SocketIOServer server = new SocketIOServer(config);
        
        server.start();
        System.out.println("Server inicializado em: http://" + config.get;

    }
}