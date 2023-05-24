#!/bin/bash

if [[ $1 == "" ]]; then
  echo usage: compila.sh FILE.C
  exit 1
fi;

# get the assember file name without the extension ".s"
filename="$(basename $1 .c)"

#riscv64-linux-gnu-gcc -O0 -x c -nostartfiles -mno-strict-align $filename.c -o $filename.o
#riscv64-linux-gnu-gcc -O1 -g -x c -nostartfiles $filename.c -o $filename.o
#riscv64-linux-gnu-objdump -d -S $filename.o
# gcc -o exec $filename.c
# rm $filename.o


riscv64-linux-gnu-gcc -O0 -o- -S $filename.c
