package com.jp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Greet {

	@Id
	@SequenceGenerator(name="greet_gen", sequenceName="greet_seq", allocationSize=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="greet_gen")
	@Column(name="message_id")  //name of the column in table
	private int messageId;
	
	@Column(name="message")    //name of the column in table
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	@Override
	public String toString() {
		return "Greet [messageId=" + messageId + ", message=" + message + "]";
	}
	
	
}
