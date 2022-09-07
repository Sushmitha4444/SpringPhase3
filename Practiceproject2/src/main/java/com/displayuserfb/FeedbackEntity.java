package com.displayuserfb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//bean class

@Entity
public class FeedbackEntity {
	//Variable Declaration
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
   
    
    @Column(length=20)
    private String user;
    @Column(length=50)
    private String feedback;
    
    
    //Constructor
    public FeedbackEntity() {
        super();
    }
    public FeedbackEntity(int id, String user, String feedback) {
        super();
        this.id = id;
        this.user = user;
        this.feedback = feedback;
    }
    
    //getter and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }   
}