/**
 * $id : $
 * $author:$
 * @author rakes
 */
package com.indus.training;

public class SingletonExample {

	private static SingletonExample singleton = new SingletonExample();

	private SingletonExample() {
	}

	public static SingletonExample getInstance() {
		return singleton;
	}

	protected static void demoMethod() {
		System.out.println("this is for singleton");
		System.out.println("This is Vineeth's secondS modification");
		System.out.println("This is Maurya's third revision");
		System.out.println("This is Vineeth's 4th Modification");
		System.out.println("This is Avinash First Modification");
		System.out.println("This is Nikhil First Modification");
	}

}