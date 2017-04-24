package da.shared.store;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dagrawal on 24-Apr-17.
 */
public class Server implements Runnable {
    private final ServerSocket server;

    public Server() throws IOException {
        server = new ServerSocket(8080);
        server.setSoTimeout(1000);
    }


    public void run() {
        while(true) {
            try {
                Socket socket = server.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                //parse the string to json
                //identify the command and data
                //grant access to the key store
                //send confirmation back
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Server());
    }
}
