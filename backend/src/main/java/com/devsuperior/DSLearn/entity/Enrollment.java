package com.devsuperior.DSLearn.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {

    private static final long serialVersionUID = 1L;

    //Como é algo criado por nós mesmo, precisamos inicializar na criação.
    //EmbeddedId é a anotação para fazer a ligação com a classe que fornece as informações.
    @EmbeddedId
    private EnrollmentPk id = new EnrollmentPk();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private Boolean available;
    private Boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonsDone = new HashSet<>();

    public Enrollment() {

    }

    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, Boolean available, Boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public Enrollment(EnrollmentPk id, Instant enrollMoment, Instant refundMoment, Boolean available, Boolean onlyUpdate) {
        this.id = id;
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public User getStudents() {
        return id.getUser();
    }

    public void setStudents(User user) {
        id.setUser(user);
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);
    }

    public Instant getEnrollMoment() {
        return enrollMoment;
    }

    public void setEnrollMoment(Instant enrollMoment) {
        this.enrollMoment = enrollMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(Boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enrollment)) return false;
        Enrollment that = (Enrollment) o;
        return id.equals(that.id) && getEnrollMoment().equals(that.getEnrollMoment()) && getRefundMoment().equals(that.getRefundMoment()) && getAvailable().equals(that.getAvailable()) && getOnlyUpdate().equals(that.getOnlyUpdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getEnrollMoment(), getRefundMoment(), getAvailable(), getOnlyUpdate());
    }
}