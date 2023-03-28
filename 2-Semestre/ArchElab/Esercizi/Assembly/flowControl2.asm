.globl _start
.data 

 
.text

_start:

    #<assembler code here>
    li t0,1
    li t1,2
    
    addi t0, t0, -2
    add t0, t0, t1
    
    bge t0, t1, else
    addi t0,t0,1
    
    j end
    
else:
    addi t1,t1,1
    
end:

exit:
    addi x17, x0, 10  # call number 10 = exit
    ecall
