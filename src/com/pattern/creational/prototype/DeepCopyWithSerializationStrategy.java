package com.pattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCopyWithSerializationStrategy implements CloneStrategy {

	@Override
	public Employee cloneObject(Employee employee) throws Exception {
		return doDeepCopyUsingSerialization(employee);
	}

	private static Employee doDeepCopyUsingSerialization(Employee employee) throws Exception {
		System.out.println("\nCreating Deep copy of Employee object ..");
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			// create deep copy by serializing the object
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(employee);
			oos.flush();

			// return the new object by reading the serialized object
			ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bin);
			return (Employee) ois.readObject();
		} catch (Exception ex) {
			System.out.println("Exception during creation of deep copy using serialization: " + ex);
			throw ex;
		} finally {
			if (oos != null) {
				oos.close();
			}
			if (ois != null) {
				ois.close();
			}
		}
	}

}
