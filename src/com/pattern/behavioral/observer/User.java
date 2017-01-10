package com.pattern.behavioral.observer;

public class User implements Observer {
	private String name;
	private String article;

	public User(String name){
		this.name=name;
	}
	
	@Override
	public void update(Subject blog) {
		System.out.println("State change notified by Subject to "+getName());
		article = (String) blog.getUpdate();
	}

	public String getName() {
		return name;
	}

	public void setUserName(String name) {
		this.name = name;
	}

	public String getArticle() {
		return article;
	}

}