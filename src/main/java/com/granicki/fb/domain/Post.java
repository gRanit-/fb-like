package com.granicki.fb.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by wojciechgranicki on 29.05.2017.
 */

public class Post extends DomainObject {

    private User author;
    private Date created;
    private String title;
    private String content;
    private List<Comment> comments;


    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
