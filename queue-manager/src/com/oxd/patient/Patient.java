package com.oxd.patient;

import java.util.Objects;

public class Patient implements Comparable<Patient> {

    private Long ticket;
    private String name;

    public Patient(Long ticket, String name) {
        this.ticket = ticket;
        this.name = name;
    }

    public Long getTicket() {
        return ticket;
    }

    public void setTicket(Long ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(ticket, patient.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ticket);
    }

    @Override
    public String toString() {
        return
                "Ticket: " + ticket +
                " - Nome: '" + name + "'";
    }

    @Override
    public int compareTo(Patient o) {
        return this.ticket.compareTo(o.getTicket());
    }
}
