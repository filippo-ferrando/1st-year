#include <stdio.h>

void swap(int v[], int x, int y) {
  int tmp;
  tmp  = v[y];
  v[y] = v[x];
  v[x] = tmp;
}

// assuming non-empty array
int min_array(int v[], int s) {
  int idx = 0;

  for (int i = 1; i < s; i++) {
    if (v[i] < v[idx]) {
      idx = i;
    }
  }
  return idx;
}

void selection_sort(int v[], int s) {
  if (s == 0)
    return;
  swap(v, 0, min_array(v, s));
  selection_sort(v+1, s-1);
}

int is_sorted(int v[], int s) {
  for (int i = 1; i < s; i++)
    if (v[i-1] > v[i])
      return 0;
  return 1;
}

int main(void) {
  int s = 10;
  int v[] = {9, 1, 8, 2, 4, 5, 0, 3, 7, 6};
//   int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//   int v[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

  printf("%d\n", is_sorted(v, s));

  selection_sort(v, s);
  for (int i = 0; i < s; i++) {
    printf("%d ", v[i]);
  }
  printf("\n");

  printf("%d\n", is_sorted(v, s));
}

