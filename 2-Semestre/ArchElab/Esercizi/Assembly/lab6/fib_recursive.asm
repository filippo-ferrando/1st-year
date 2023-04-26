# Compute n-th element of Fibonacci
.globl _start

.data
    
.text
_start:
        # valore di prova
        addi a0,zero,8
        
        # call procedure
        jal fib

        # print result already in a0
        li    a7, 1
        ecall

exit:
        li    a7, 10 # call number 10 = exit
        ecall

################################################################################
# Procedure fib(n) - Recursive Fibonacci 
# a0 -> element to compute: note fib(0) = 0, fib(1) = 1
################################################################################
fib:
        # print the parameter, to better undestand what happens
        # but save it before print!
        # addi sp,sp,-8
        # sd a0,0(sp)
        # li a7,1
        # ecall
        # print a space
        # addi  a0, zero, 0x20      # print space
        # li    a7, 11
        # ecall
        # ld a0,0(sp)
        # addi sp,sp,8 
        
        beq a0,zero,fine   # special case n = 0 --> result = 0
        addi t0,zero,1
        beq a0,t0,fine     # special case n = 1 --> result = 1
        
        # general case n > 1
        addi sp,sp,-16             # create space in stack to save 2 registers
        sd ra,0(sp)                # save ra
        sd a0,8(sp)                # save parameter
        
        addi a0,a0,-1              # compute n-1
        jal fib                    # compute fib(n-1) 
        ld t0,8(sp)                # recover n from stack
        sd a0,8(sp)                # since I will not need n again, save fib(n-1) in place of n 
        addi a0,t0,-2              # compute n-2
        jal fib                    # compute fib(n-2)
        
        ld t0,8(sp)                # restore from stack fib(n-1)
        add a0,a0,t0               # compute fib(n) = fib(n-1) + fib(n-2)
        ld ra,0(sp)                # restore the return address
        addi sp,sp,16              # restore the stack pointer
        
fine:
        ret
        
       
