# Sum an array in memory
.globl _start

.data
     size:   .word 16
     array:  .word 2, 1, 7, 1, 2, 2, 2, 1, 12, 1, 7, 1, 2, 2, 2, 1

.text
_start:
        la    s1, size

        # print new line
        addi  a0, zero, 0x0A
        li    a7, 11
        ecall

        # interactive sum
        la    a0, array
        lw    a1, 0(s1)
        jal   ra, sumi

        # print the sum already in a0
        li    a7, 1
        ecall

        # print new line
        addi  a0, zero, 0x0A
        li    a7, 11
        ecall

        # recursive sum
        la    a0, array
        lw    a1, 0(s1)
        jal   ra, sumr

        # print the sum already in a0
        li    a7, 1
        ecall

exit:
        li    a7, 10 #call number 10 = exit
        ecall

################################################################################
# Procedure sumi(v) - interactive sum
# a0 -> v address
# a1 -> v size
################################################################################
sumi:
        addi  sp, sp, -8
        sd    ra, 0(sp)

        li    t0, 0                # final sum
LOOP_sumi:
        ble   a1, zero, END_sumi   # if s1 <= 0 goto end
        lw    t1, 0(a0)            # first element of the vector
        add   t0, t0, t1           # sum the element
        addi  a1, a1, -1           # decrement the counter
        addi  a0, a0, 4            # move to the next word in the array
        j     LOOP_sumi

END_sumi:
        mv    a0, t0               # load the result
        ld    ra, 0(sp)            # restore the return address
        addi  sp, sp, 8            # restore the stack pointer
        ret

################################################################################
# Procedure sumr(v) - recursive sum
# a0 -> v address
# a1 -> v size
################################################################################
sumr:
        addi  sp, sp, -24
        sd    ra, 0(sp)
        sd    a0, 8(sp)
        sd    s1, 16(sp)

        mv    s1, zero

        # if size <= 0 end
        ble   a1, zero, END_SUMR

        # otherwise recursively call sumr
        addi  a0, a0, 4
        addi  a1, a1, -1
        jal   ra, sumr

        # a0 has the sum of the tail of the list
        add    s1, a0, zero
        ld    a0, 8(sp)     # recover the saved a0
        ld    t0, 0(a0)     # value in the head of the list
        add   s1, s1, t0    # sum head with sumr(tail)

END_SUMR:
        mv    a0, s1        # load the result
        ld    s1, 16(sp)    # restore the saved register
        ld    ra, 0(sp)     # restore the return address
        addi  sp, sp, 24    # restore the stack pointer
        ret
