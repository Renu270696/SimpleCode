package org.hexa;

public class ICICI extends SBI {
	
	@Override
	public void fixedDeposit() {
		System.out.println("8% interest");
	}
	
	@Override
	public void saving() {
		System.out.println("3% interest");
	}
	
	public static void main(String[] args) {
		
		ICICI i = new ICICI();
		i.fixedDeposit();
		i.saving();
		
	}

}
