package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceResponse {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public ServiceResponse(
            @JsonProperty("id") String ID,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = ID;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getID() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "\n id:" + id +
                "\n text:=" + text +
                "\n type:" + type +
                "\n user:" + user +
                "\n upvotes:" + upvotes;
    }
}