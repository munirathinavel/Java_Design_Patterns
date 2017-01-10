package com.pattern.behavioral.memento;

public class MementoPatternDemo {
	
	public static void main(String[] args) {
		final FileWritingUtil originator = new FileWritingUtil("top-performers.txt");
		originator.write("Top Technical Performers:");
		originator.write("\nEmployee1");
		originator.write("\nEmployee2");
		originator.write("\nEmployee3");

		FileWritingCareTaker careTaker = new FileWritingCareTaker();
		originator.write("\nEmployee4");
		careTaker.add(originator.saveToMemento());

		originator.write("\nEmployee5");
		careTaker.add(originator.saveToMemento());

		originator.write("\nEmployee6");
		System.out.println("\nFile current content: \n" + originator.getFileContent());

		originator.restoreFromMemento(careTaker.get(1));
		System.out.println("\nAfter restoring to second saved content: \n"
				+ originator.getFileContent());

		originator.restoreFromMemento(careTaker.get(0));
		System.out.println("\nAfter restoring to first saved content: \n"
				+ originator.getFileContent());
	}

}