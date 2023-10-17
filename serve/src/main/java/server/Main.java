package server;

import com.corundumstudio.socketio.*;
import com.corundumstudio.socketio.listener.DataListener;

public class Main {
    public static void main(String[] args) {

        try {
            
            // cria o objeto que vai configurar o server
            Configuration config = new Configuration();
            config.setHostname("localhost");        // nome do server a ser criado
            config.setPort(5002);                       // define a porta que o server vai ser acessado

            // cria um server do socket.io
            SocketIOServer server = new SocketIOServer(config);             
            SocketConfig sockConfig = new SocketConfig();
            sockConfig.setReuseAddress(true);  

            server.addConnectListener(client -> {
                System.out.println("Client Connected");
            });
        

            // escutando o server e realizando uma ação caso algum evento ocorra
            server.addEventListener("message", String.class, new DataListener<String>() {

                @Override
                public void onData(SocketIOClient cliente, String data, AckRequest ackRequest) throws Exception {
                    System.out.println("Received message from client: " + data);
                }            

            });

            server.start();
            System.out.println("Servidor funcionando em http://" + config.getHostname() + ":" + config.getPort());
            
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            System.exit(1);
        }
        
        

    }
}