package de.martenl.nettyExperiments.time;

import de.martenl.nettyExperiments.time.server.TimeServer;

import static de.martenl.nettyExperiments.ConsoleHelper.readPort;

public class TimeApp {

    public static void main() throws Exception {
        final int port = readPort();
        TimeServer timeServer = new TimeServer(port);
        timeServer.run();
    }


}
