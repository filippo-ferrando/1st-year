#include <stdio.h>

int MCD(int a, int b) {
	while (a != b)
		if (a > b)
			a = a - b;
		else
			b = b - a;
   return a;
}

void main() {
    int a = 24;
    int b = 30;
    int result;

    result = MCD(a,b);

    printf("%d\n", result);
}
