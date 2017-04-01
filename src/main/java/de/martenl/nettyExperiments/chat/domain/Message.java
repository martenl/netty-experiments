package de.martenl.nettyExperiments.chat.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

public class Message {

    @JsonProperty
    final private DateTime timestamp;
    @JsonProperty
    final String body;

    public Message() {
        timestamp = DateTime.now();
        body = "";
    }

    public Message(DateTime timestamp, String body) {
        this.timestamp = timestamp;
        this.body = body;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public String getBody() {
        return body;
    }
}
