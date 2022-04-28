package com.edu;

public class Human {
	private Heart heartob;

	 
	public Heart getHeartob() {
		return heartob;
	}


	public void setHeartob(Heart heartob) {
		this.heartob = heartob;
	}


	public void humanFunction()
	{
	
		if(heartob!=null)
		{
			heartob.pump();
		}
		else
		{
			System.out.println("not alive");
		}
	}
	

}
