package com.granicki.fb.domain;

import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Date;

/**
 * Created by wojciechgranicki on 29.05.2017.
 */
public class Comment extends DomainObject {
    private User author;
    private Post post;
    private Date created;
    private String content;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
