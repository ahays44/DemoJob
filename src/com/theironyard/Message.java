
package com.theironyard;

/**
 * Created by zach on 6/8/16.
 */
public class Message {
    int id;
    int replyId;
    String author;
    String title;
    String location;
    int size;

    public Message(int id, int replyId, String author, String title, String location, int size) {
        this.id = id;
        this.replyId = replyId;
        this.author = author;
        this.title = title;
        this.location = location;
        this.size = size;
    }
}