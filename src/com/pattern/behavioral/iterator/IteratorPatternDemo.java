package com.pattern.behavioral.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		namesRepository.addName("Robert");
		namesRepository.addName("John");
		namesRepository.addName("Julie");
		namesRepository.addName("Lora");
		
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
			if("Robert".equals(name)){
				namesRepository.removeName("John");
			}
		}
	}
}
