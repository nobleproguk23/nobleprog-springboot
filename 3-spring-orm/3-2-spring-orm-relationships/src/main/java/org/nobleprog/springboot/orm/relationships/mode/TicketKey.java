package org.nobleprog.springboot.orm.relationships.mode;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TicketKey implements Serializable {

    private String id;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
