package ru.demo.socket.tcp.square;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Работа по протоколу TCP
 * Клиент отправляет байт (число) серверу,
 * затем получает квадрат числа
 */
public class SqClient {
    public static void main(String[] args) throws IOException {
        int fuf = 0;
        try(Socket socket = new Socket("LAPTOP-EQR48ANI", 1020)){
            fuf++;
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(fuf);
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();

            while(fuf < 10){
                int response = inputStream.read();
                System.out.println(response);
            }

        }
    }
}

