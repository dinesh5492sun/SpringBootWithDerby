
package com.test.springConfig.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue
	@Column(name = "bankAcc")
	private int BankAccountNo;
	private String BankName;

	public int getBankAccountNo() {
		return BankAccountNo;
	}

	public void setBankAccountNo(int bankAccountNo) {
		BankAccountNo = bankAccountNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	@Override
	public String toString() {
		return "BankAccount [BankAccountNo=" + BankAccountNo + ", BankName=" + BankName + "]";
	}
	
}
