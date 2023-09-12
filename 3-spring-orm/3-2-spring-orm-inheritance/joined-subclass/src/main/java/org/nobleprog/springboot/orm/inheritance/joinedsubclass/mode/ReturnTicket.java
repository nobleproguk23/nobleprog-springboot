package org.nobleprog.springboot.orm.inheritance.joinedsubclass.mode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "return_ticket")
public class ReturnTicket extends Ticket {

    private LocalDate arrivalDate;

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
