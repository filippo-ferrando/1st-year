# Invert an array in memory using swap
.globl _start

.data
     size:   .word 16
     array:  .word 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15

.text
_start:
        la    s1, size

        la    a0, array
        lw    a1, 0(s1)
        jal   print

        la    a0, array
        lw    a1, 0(s1)
        jal   invert

        la    a0, array
        lw    a1, 0(s1)
        jal   print

exit:
        li    a7, 10 #call number 10 = exit
        ecall

################################################################################
# Procedure swap(v, x, y)
# a0  -> address of v
# a1 -> index x
# a2 -> index y
# does not return anything
# swap is a leaf procedure that can be implemented with only temp registers
################################################################################
swap:
        slli  a1, a1, 2     # calculates offset of x
        slli  a2, a2, 2     # calculates offset of y
        add   t0, a0, a1    # address of v[x]
        add   t1, a0, a2    # address of v[y]

        lw    t2, 0(t0)     # sway the values
        lw    t3, 0(t1)
        sw    t3, 0(t0)
        sw    t2, 0(t1)
        ret                 # return

################################################################################
# Procedure invert(v)
# a0 -> v address
# a1 -> v size
################################################################################
invert:
        addi  sp, sp, -32
        sd    ra, 0(sp)
        sd    a0, 8(sp)
        sd    s0, 16(sp)
        sd    s1, 24(sp)

        addi  s0, zero, 0         # index of first element
        addi  s1, a1, -1          # index of last  element
LOOP_invert:
        blt   s1, s0, END_invert  # if s1 < s0 goto end

        ld    a0, 8(sp)
        mv    a1, s0
        mv    a2, s1
        jal   ra, swap
        addi  s0, s0, 1
        addi  s1, s1, -1
        j     LOOP_invert
END_invert:

        ld    ra, 0(sp)           # restore the return address
        ld    s0, 16(sp)
        ld    s1, 24(sp)
        addi  sp, sp, 32          # restore the stack pointer
        ret

################################################################################
# Procedure print(v)
# a0 -> v address
# a1 -> v size
################################################################################
print:
        addi  sp, sp, -32
        sd    s1, 0(sp)
        sd    a0, 8(sp)
        sd    a1, 16(sp)
        sd    ra, 24(sp)

        li    s1, 0
LOOP_print:
        beq   s1, a1, EXIT_print

        slli  t1, s1, 2
        add   t1, t1, a0
        lw    t0, 0(t1)

        addi  a0, t0, 0           # print a number
        li    a7, 1
        ecall

        addi  a0, zero, 0x20      # print space
        li    a7, 11
        ecall

        ld    a0, 8(sp)           # recover the value of a0
        ld    a1, 16(sp)          # recover the value of a1
        addi  s1, s1, 1           # move to the next word
        j     LOOP_print
EXIT_print:

        addi  a0, zero, 0x0A      # print new line
        li    a7, 11
        ecall

        ld    s1, 0(sp)
        ld    ra, 24(sp)
        addi  sp, sp, 32
        ret
################################################################################
