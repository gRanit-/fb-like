package com.granicki.fb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.hateoas.Identifiable;

/**
 * Created by wojciechgranicki on 29.05.2017.
 */
public class DomainObject implements Identifiable<String> {
    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomainObject)) return false;

        DomainObject that = (DomainObject) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
