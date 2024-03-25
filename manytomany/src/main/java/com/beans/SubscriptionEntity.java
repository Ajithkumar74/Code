package com.beans;
import java.util.List;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;

@Entity
public class SubscriptionEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="subid_seq")
	//@SequenceGenerator(name="subsid_seq", sequenceName ="subsid_seq" )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SubsId;
	@Column(length=20)
	private String subsname;
	@ManyToMany(mappedBy="subscriptions")
	private Set<ReaderEntity> readers;
	public int getSubsId() {
		return SubsId;
	}
	public void ListSubsId(int subsId) {
		SubsId = subsId;
	}
	public String getSubsname() {
		return subsname;
	}
	public void setSubsname(String subsname) {
		this.subsname = subsname;
	}
	public Set<ReaderEntity> getReaders() {
		return readers;
	}
	public void setReaders(Set<ReaderEntity> readers) {
		this.readers = readers;
	}
	
}
