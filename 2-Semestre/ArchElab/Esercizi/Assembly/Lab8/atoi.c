#include <stdio.h>

unsigned long strlen(char *str) {
  unsigned long i;
  for (i = 0; str[i] != 0x00; i++);
  return i;
}

int digit(char c) {
  if (c >= 0x30 && c <= 0x39)
    return 1;
  else
    return 0;
}

int isnumber(char *s) {
  for (int i = 0; s[i] != '\0'; i++)
    if (!digit(s[i]))
      return 0;
  return 1;
}

unsigned long atoi(char *str, unsigned long n) {
  if (n == 1)
    return str[0] - '0';
  return (10*atoi(str, n-1) + str[n-1]-'0');
}

int main(void) {
  char str1[] = "11";

  if (isnumber(str1)) {
    unsigned long x = atoi(str1, strlen(str1));
    printf("%d\n", x*x);
  }
  return 0;
}

