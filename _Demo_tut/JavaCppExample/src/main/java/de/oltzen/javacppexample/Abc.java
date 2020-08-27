package de.oltzen.javacppexample;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;


@Properties(
	value = {
		@Platform(
			//includepath = "./src/main/resources/de/oltzen/javacppexample/",
			//linkpath = "./target/classes/de/oltzen/javacppexample/linux-x86_64/",
			include = {"Abc.h", "Abc.cpp"} //.h
			//link = "Abc"
		)
	}
)

// A name space is useful.
@Namespace("TestLibrary")

/*
public class Abc implements InfoMapper {
	@Override
	public void map(InfoMap infoMap) {
		
	}
}
*/


// The java class and the C++ class must be the same name.
public class Abc extends Pointer {

	static {
		Loader.load();
	}

	public Abc() {
		allocate();
	}

	private native void allocate();

	//Method that we implement in C++.
	public native int testMethod(int a); 

	public static void main(String[] args) {
            // Test call
            try ( // Create the Abc instance also in C++.
                    Abc abc = new Abc()) {
                // Test call
                System.out.println("out=" + abc.testMethod(2));
                // Call the destructor
            }
	}
}


