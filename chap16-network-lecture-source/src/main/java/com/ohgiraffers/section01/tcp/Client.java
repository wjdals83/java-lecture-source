package com.ohgiraffers.section01.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {     // cmd 에서 ipconfig 입력 -> IPv4 확인

        int port = 8500;

        String serverIp = "192.168.0.51";   // server 와 client. client 가 server 의 아이디

        Socket socket = new Socket(serverIp, port);

        if(socket != null) {
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader((input)));  // 보조스트림
            PrintWriter pw = new PrintWriter(output);

            Scanner sc = new Scanner(System.in);

            do {

                System.out.print("메세지 입력 : ");
                String message = sc.nextLine();

                pw.println(message);
                pw.flush();
                if(message.equals("exit")) {
                    break;
                }

            } while (true);

            br.close();
            pw.close();
            socket.close();

        }

    }

}
