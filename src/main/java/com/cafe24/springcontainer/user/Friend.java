package com.cafe24.springcontainer.user;

public class Friend {
	private String name = "윤민호";

	public Friend() {
	}
	public Friend(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
}
