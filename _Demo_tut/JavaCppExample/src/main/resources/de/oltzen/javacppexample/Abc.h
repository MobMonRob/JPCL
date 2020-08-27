#ifndef _ABC_H
#define _ABC_H

namespace TestLibrary {
	class Abc;
}

class TestLibrary::Abc {
public:
	Abc();
	~Abc();
	int testMethod(int a);
};

#endif

