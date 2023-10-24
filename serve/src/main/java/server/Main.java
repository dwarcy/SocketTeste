package server;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.corundumstudio.socketio.*;
import com.corundumstudio.socketio.listener.DataListener;
//import com.fasterxml.jackson.databind.util.JSONPObject;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(4001);

        SocketIOServer server = new SocketIOServer(config);
        SocketConfig sockConfig = new SocketConfig();
        sockConfig.setReuseAddress(true);

        server.addConnectListener(client -> {
            Map<String, List<String>> querySent = client.getHandshakeData().getUrlParams();             // Recebe todos parâmetros enviados pelo query em um MAP
            String jsonString = querySent.get("json").get(0);                                           // Guarda o parâmetro 'json' dentro da string jsonString
            JSONObject jsonObject = new JSONObject(jsonString);                                         // Tranforma a string novamente em um objeto JSON

            // guarda as dados das respectivas chaves em variáveis
            int clientId = jsonObject.getInt("clientId");                                               
            String nome = jsonObject.getString("nome");
            String message = jsonObject.getString("message");
            
            System.out.println("\n" + //
                    "\n" + //
                    "#    ___  __   __ _  ____  ___  ____  __   ____   __  \n" + //
                    "#   / __)/  \\ (  ( \\(  __)/ __)(_  _)/ _\\ (    \\ /  \\ \n" + //
                    "#  ( (__(  O )/    / ) _)( (__   )( /    \\ ) D ((  O )\n" + //
                    "#   \\___)\\__/ \\_)__)(____)\\___) (__)\\_/\\_/(____/ \\__/ \n" + //
                    "\n" + //
                    "");
            
            System.out.println("ClientID: " + clientId);
            System.out.println("Nome: " + nome);
            System.out.println("Message: " + message);

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

        server.addEventListener("emiteMensagem", String.class, new DataListener<String>() {

            @Override
            public void onData(SocketIOClient client, String data, AckRequest ackSender) throws Exception {
                System.out.println("Mensagem Recebida do cliente: " + data);
                ackSender.sendAckData("Mensagem enviada do ack");
            }
            
        });
        
        server.start();
        System.out.println("Server inicializado em: http://" + config.getHostname() + ":" + config.getPort());

    }
}