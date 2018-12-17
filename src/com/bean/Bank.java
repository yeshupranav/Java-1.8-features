package com.bean;

interface RBI {
	void withdraw();

	void deposite();

	public default void adharlink() {
		System.out.println("adharlink added");
	}

	public default void register() {
		System.out.println("register with phone number");
	}
}

class SBI implements RBI {

	public void withdraw() {
		System.out.println("SBI money withdraw");
	}

	public void deposite() {
		System.out.println("SBI money deposite");

	}
	public void adharlink() {
		System.out.println("registerd with SBI bank");
	}

}

class Axis implements RBI {
	public void withdraw() {
		System.out.println("Axis  money withdraw");
	}

	public void deposite() {
		System.out.println("Axis money deposited");
	}

}

public class Bank {

	public static void main(String[] args) {

		RBI sbiuser = new SBI();
		sbiuser.deposite();
		sbiuser.withdraw();
		sbiuser.adharlink();
		sbiuser.register();
		
		RBI axisuser = new Axis();
		axisuser.deposite();
		axisuser.withdraw();
		axisuser.adharlink();
		axisuser.register();

	}

}
