package com.ManyToManyMapping.beans;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;

@Entity
@Table(name="ques1123")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String qname;   
 @ManyToMany(targetEntity=Answer.class,cascade= {CascadeType.ALL})
 @JoinTable(name="q_ans1123", 
 joinColumns= {@JoinColumn(name="q_id")},
 inverseJoinColumns= {@JoinColumn(name="ans_id") })
 private List<Answer> answers;  


public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getQname() {  
    return qname;  
}  
public void setQname(String qname) {  
    this.qname = qname;  
}  
public List<Answer> getAnswers() {  
    return answers;  
}  
public void setAnswers(List<Answer> answers) {  
    this.answers = answers;  
}      
}