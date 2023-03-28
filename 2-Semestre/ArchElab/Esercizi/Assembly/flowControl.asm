.globl _start
.data 

 
.text

_start:

    #<assembler code here>
    li t0, 1
    li t1, 1
    
    
    sub t0, t0, t1
    bgtz t0, TRUE
    li t0, 0
    TRUE:
    	addi t1,t1,-1
    
    
    

exit:
    addi x17, x0, 10  # call number 10 = exit
    ecall
