#include "Abc.h"

#include <string>
#include <iostream>
#include <stdio.h>

using namespace TestLibrary;

Abc::Abc() {
	std::cout << "Constructor called!" << std::endl;
}

Abc::~Abc() {
	std::cout << "Destructor called!" << std::endl;
}

int Abc::testMethod(int a) {
	std::cout << "Processing Abc with " << a << " ..." << std::endl;
	return 2 * a * a;
}

