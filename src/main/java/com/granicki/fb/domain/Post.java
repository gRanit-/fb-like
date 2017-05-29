package com.granicki.fb.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by wojciechgranicki on 29.05.2017.
 */

public class Post {
    private User author;
    private Date creationDate;
    private String title;
    private String description;
    private List<Comment> comments;


    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
