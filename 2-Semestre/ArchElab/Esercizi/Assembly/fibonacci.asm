.globl _start
.data 

 
.text

_start:

    #<assembler code here>
    li t0,8
    li t1,1
    li t2,0
    li t3,1
    
ciclo:

    add t1, t2, t3
    mv t2, t3
    mv t3, t1
    
    addi t0, t0, -1
    beqz t0, end
    
    j ciclo

end:
    
    
   

exit:
    addi x17, x0, 10  # call number 10 = exit
    ecall
