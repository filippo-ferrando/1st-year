#include <stdio.h>
int main(){
    float from = 1;
    float to = 10;
    float step = 0.1;

    for(float index = from; index <= to; index += step){
        printf("value: %f\n", index);
    }
    return 0;
}

//l'errore introdotto è dovuto alla codifica in virgola mobile, che non è esatta e introduce un errore già visibile alla seconda cifra decimale dopo relativaente poche iterazioni