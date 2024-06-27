#include <stdio.h>
#include <stdlib.h>

int main() {
    // Simple stack variable
    int x = 5;

    // malloc allocates memory from the heap (like new keyword for object creation in Java)
    int* y = malloc(sizeof(int));

    *y = 10;

    printf("%d\n", x);  // 5
    printf("%d\n", *y); // 10
    printf("%p\n", y);  // 0x5621a40f22a0 (memory address assigned in this run)

    return 0;
}
