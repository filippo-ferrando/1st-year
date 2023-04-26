# procedure to return the MCD
.globl _start

.text
_start:
        li    a0, 9
        li    a1, 12
        jal   mcm
        mv    t0, a0
print:
        addi  a0, t0, 0    	 # print the result
        li    a7, 1
        ecall
exit:
        li    a7, 10         # call number 10 = exit
        ecall

###################################
# Procedure MCM(a,b)
# a0 -> a
# a1 -> b
# return MCM su a0
###################################
mcm:
          addi    sp, sp, -8
          sd      ra, 0(sp)

          mul     t1, a0, a1
          jal     mcd         # after this, a0 has mcd
          div     a0, t1, a0

          ld      ra, 0(sp)
          addi    sp, sp, 8       # restore the stack pointer
          ret

###################################
# Procedure MCD(a,b)
# a0 -> a
# a1 -> b
# return MCD su a0
###################################
mcd:

mcd_while:
          beq     a0, a1, mcd_end
          bge     a1, a0, mcd_else
          sub     a0, a0, a1
          j       mcd_while
mcd_else:
          sub     a1, a1, a0
          j       mcd_while
mcd_end:
          ret
###################################
