.globl _start
.data 

 
.text

_start:

    #<assembler code here>
   li t0,6
   li t1,30
   li t2,12
   
   sub t3, t0, t1
   slt t4, t3, x0
   beq t4, x0, MAX
   mv t0, t1
   
MAX:
   sub t3, t0, t2
   slt t4, t3, x0
   beq t4, x0, END
   mv t0, t2

END:
    
   

exit:
    addi x17, x0, 10  # call number 10 = exit
    ecall
