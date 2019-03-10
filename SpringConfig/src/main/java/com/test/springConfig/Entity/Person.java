
package com.test.springConfig.Entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int aadharNo;
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@Cascade(value = { org.hibernate.annotations.CascadeType.ALL })
	@JoinColumn(name = "BANK_ACCOUNT", referencedColumnName = "bankAcc")
	private BankAccount parent;

	public int getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getParent() {
		return parent;
	}

	public void setParent(BankAccount parent) {
		this.parent = parent;
	}

	/*
	 * @Override public String toString() { return "Person [aadharNo=" + aadharNo +
	 * ", name=" + name + ", parent=" + parent + "]"; }
	 */
	
}
