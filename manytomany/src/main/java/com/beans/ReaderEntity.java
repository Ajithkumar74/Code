package com.beans;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;


@Entity
public class ReaderEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="readerid_seq")
		@SequenceGenerator(name="readerid_seq", sequenceName ="readerid_seq" )
		
		private int readerId;
			@Column(length=20)	
			private String readerName;
			
			
			@ManyToMany(cascade=CascadeType.ALL)
			@JoinTable(name="reader_subscriptions", joinColumns= {@JoinColumn(name="readerId")}, inverseJoinColumns= {@JoinColumn(name="SubsId")})
			private Set<SubscriptionEntity>subscriptions;
			public int getReaderId() {
				return readerId;
			}
			public void setReaderId(int readerId) {
				this.readerId = readerId;
			}
			public String getReaderName() {
				return readerName;
			}
			public void setReaderName(String readerName) {
				this.readerName = readerName;
			}
			public Set<SubscriptionEntity> getSubscriptions() {
				return subscriptions;
			}
			public void setSubscriptions(Set<SubscriptionEntity> subscriptions) {
				this.subscriptions = subscriptions;
			}
}
