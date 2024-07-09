package org.example;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        String host = "127.0.0.1";
        int port = 8080;

        try (Socket clientSocket = new Socket(host, port);) {

            PrintWriter out = new
                    PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()));

            out.println("Netology");

            String serverWord = in.readLine();
            System.out.println(serverWord);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}