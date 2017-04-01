package de.martenl.nettyExperiments;

import de.martenl.nettyExperiments.echo.EchoApp;
import de.martenl.nettyExperiments.time.TimeApp;

import static de.martenl.nettyExperiments.ConsoleHelper.readLine;
/**
 * Created on 11.03.2017.
 */
public class App {


    public static void main(String[] args) throws Exception {
        for(String key : System.getenv().keySet()){
            System.out.println(key+": "+ System.getenv(key));
        }
        System.out.println("Welcome to netty Experiments.\n" +
                "Please choose your experiment\n" +
                "e : EchoApp\n" +
                "t : TimeApp");
        final String choice = readLine();
        switch (choice){
            case "e":
                EchoApp.main(args);
                break;
            case "t":
                TimeApp.main();
            default:
                System.out.println("Choice not found :-(");
        }
    }
}
