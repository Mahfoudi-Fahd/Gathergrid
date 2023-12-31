package com.example.gathergrid.domain;

import jakarta.persistence.*;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private Integer evaluation;
    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    public Commentaire(String text, Integer evaluation, User user, Event event) {
        this.text = text;
        this.evaluation = evaluation;
        this.user = user;
        this.event = event;
    }

    public Commentaire() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "text='" + text + '\'' +
                ", evaluation=" + evaluation +
                ", user=" + user +
                ", event=" + event +
                '}';
    }

}
