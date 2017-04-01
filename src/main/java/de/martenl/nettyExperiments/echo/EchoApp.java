package de.martenl.nettyExperiments.echo;

import de.martenl.nettyExperiments.echo.client.EchoClient;
import de.martenl.nettyExperiments.echo.server.EchoServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static de.martenl.nettyExperiments.ConsoleHelper.*;

/**
 * Created on 11.03.2017.
 */
public class EchoApp {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws Exception {
        System.out.println("Welcome to Echo App");
        System.out.println("Press s for Server or c for client");
        String choice = reader.readLine().trim();
        if(choice.equals("s")){
            runServer();
        }else{
            runClient();
        }
    }

    private static void runServer() throws IOException, InterruptedException {
        System.out.println("Running in server mode");
        final int port = readPort();
        final EchoServer echoServer = new EchoServer(port);
        echoServer.run();
    }

    private static void runClient() throws Exception {
        System.out.println("Running in client mode");
        final String host = readHost();
        final int port = readPort();
        final EchoClient echoClient = new EchoClient(host,port);
        echoClient.run();
    }
}
