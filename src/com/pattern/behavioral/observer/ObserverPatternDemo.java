package com.pattern.behavioral.observer;

public class ObserverPatternDemo {

	public static void main(String args[]) {
		Blog blog = new Blog();

		User user1 = new User("User1");
		blog.registerObserver(user1);

		User user2 = new User("User2");
		blog.registerObserver(user2);

		System.out.println("Before change notification to " + user1.getName() + ", article: " + user1.getArticle());
		System.out.println("Before change notification to " + user2.getName() + ", article: " + user2.getArticle());

		blog.postNewArticle();

		System.out.println("After change notification to " + user1.getName() + ", article: " + user1.getArticle());
		System.out.println("After change notification to " + user2.getName() + ", article: " + user2.getArticle());
	}

}
