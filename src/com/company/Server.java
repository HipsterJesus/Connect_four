package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{


    private ServerSocket serverSocket;
    private boolean serverRunning = false;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public final int serverPortNumber = 1337;
    public final String serverIp = "localhost";

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public Server() {
    }

    private void startServer(){
        System.out.println("starting server...");

        try {
            serverSocket = new ServerSocket(serverPortNumber);
            serverRunning = true;

            System.out.println("waiting for client to join");
            clientSocket = serverSocket.accept();
            System.out.println("Client joined");

            out = new PrintWriter(clientSocket.getOutputStream(),true);
            System.out.println("Printwriter created");
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("BufferReader created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void run() {

    }
}
