#include <stdio.h>

int MCD(int a, int b) {
	while (a != b)
		if (a > b)
			a = a - b;
		else
			b = b - a;
   return a;
}

int MCM(int a, int b) {
    return (a*b) / MCD(a,b);
}

void main() {
    int a = 12;
    int b = 9;
    int result;

    result = MCM(a,b);

    printf("%d\n", result);
}
