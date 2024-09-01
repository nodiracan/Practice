package org.example.read_from_url;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts {

    private String userID;
    private String id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "Posts{" +
                "userID='" + userID + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
