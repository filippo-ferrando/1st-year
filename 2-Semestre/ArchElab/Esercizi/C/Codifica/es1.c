#include <stdio.h>
#include <stdint.h>

int main(){
    uint16_t counter = 0;   //char 0->127, -128->0, di nuovo
                            //uint8_t 0->255, overflow a 0
                            //uint16_t 0->512, no overflow

    for(int i = 0; i <= 512; i += 1){
        printf("value: %d\n", counter);
        counter += 1;
    }
    return 0;
}