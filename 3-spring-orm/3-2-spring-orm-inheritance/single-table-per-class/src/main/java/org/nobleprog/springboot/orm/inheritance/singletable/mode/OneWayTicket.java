package org.nobleprog.springboot.orm.inheritance.singletable.mode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;


public class OneWayTicket extends Ticket {

    private LocalDate departureDate;

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
}
