 package com.userdefinedexxception;

public class Test {
	
	public void getOrderId(int orderid) throws OrderNotFoundException {
		if(orderid==101) {
			throw new OrderNotFoundException("The order not found Exception with id "+orderid);
		}
	}
  public static void main(String[] args) throws OrderNotFoundException {
	  try {
		  Test obj=new Test();
		  obj.getOrderId(101);
		  
	  }catch(Exception e) {
		  System.out.println("Exception caughted");
	  }
	  
}
}
