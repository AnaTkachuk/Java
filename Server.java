import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4789)){
            System.out.println("Сервер работает, ждем гостей");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Есть подключение");
                new ClientHand(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
