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
	// char c1;
	// char c2;
	// char c3;
	// char c4;
};

struct coordinates {
	float latitude;
	double longitude;
};

struct woozle {
  char name[7]; // 7 bytes
  unsigned long fuzzyiess; // 32-bits == 4 bytes
  double quality; // 2 * 32-bits == 8 bytes
}; // 7 + 4 + 8 == 21

int main()
{
	int size = sizeof(struct position);
	printf("How big is a position structure? %u\n", size);
	
	size = sizeof(struct coordinates);
	printf("How big is a coordinate struct? %u\n", size);

	size = sizeof(struct woozle);
	printf("How big is a woozle? %u\n", size);
	
	return 0;
}
