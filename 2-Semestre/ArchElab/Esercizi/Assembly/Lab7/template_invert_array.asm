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
	slli t0,a1,2
	add t0,t0,a0 #indirizzo primo elemento
	
	slli t1,a2,2
	add t1,t1,a2 #indirizzo secondo element0
	
	lw t3,0(t0) #valore primo elemento
	lw t4,0(t1) #valore secondo elemento
	
	sw t3,0(t1) #scambio
	sw t4,0(t0)

      	ret                 # return

################################################################################
# Procedure invert(v)
# a0 -> v address
# a1 -> v size
################################################################################
invert:
      




      # jal   ra, swap
      




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

      li    s1, 0               # index
LOOP_print:
      beq   s1, a1, EXIT_print

      slli  t1, s1, 2           # calculates offset in the array
      add   t1, t1, a0          # t1 has the address of the element
      lw    t0, 0(t1)           # t0 has the number to print

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
