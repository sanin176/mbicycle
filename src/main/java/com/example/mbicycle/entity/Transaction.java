package com.example.mbicycle.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime timestamp;

    private String type;

    private String actor;

    @ElementCollection
    private Map<String, String> transactionData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Map<String, String> getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(Map<String, String> transactionData) {
        this.transactionData = transactionData;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", type='" + type + '\'' +
                ", actor='" + actor + '\'' +
                ", transactionData=" + transactionData +
                '}';
    }
}
