/*
 Examples of how to calculate the size of memory structures.
 
  Preston Lee <preston@asu.edu>
  Copyright © 2010 Preston Lee Ventures, LLC. All rights reserved.
*/ 


#include <stdio.h>

struct position {
	int x;
	int y;
	int z;
	// short s1;
	// short s2;
	// short s3;
	// short s4;
	// char c1;
	// char c2;
	// char c3;
	// char c4;
};

int main()
{
	int size = sizeof(struct position);
	printf("How big is a position structure? %u\n", size);

	struct position p;
	p.x = 7;
	p.y = 9;
	p.z = 11;
	
	printf("%u %u %u", p.x, p.y, p.z);
	
	return 0;
}
