package com.company;

import java.net.Socket;


public class Client {
    Socket clientSocket;

    public Client() {
    }

    public Client(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

}
