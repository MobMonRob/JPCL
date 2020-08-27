/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.oltzen.javacppexample;

/**
 *
 * @author fabian
 */
public class AbcTest {

	public static void main(String[] args) {
		// Test call
		// Create the Abc instance also in C++.
		Abc abc = new Abc();
			// Test call
			System.out.println("out=" + abc.testMethod(2));
			// Call the destructor
	}
}
