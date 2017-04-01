package de.martenl.nettyExperiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created on 12.03.2017.
 */
public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String readHost() throws IOException {
        System.out.println("Please enter host:");
        return reader.readLine();
    }

    public static int readPort() throws IOException {
        System.out.println("Please enter port number:");
        String line = reader.readLine().trim();
        while(!line.matches("\\d*")){
            System.out.println("Invalid input. You must enter a number");
            line = reader.readLine();
        }
        return Integer.parseInt(line);
    }
}
