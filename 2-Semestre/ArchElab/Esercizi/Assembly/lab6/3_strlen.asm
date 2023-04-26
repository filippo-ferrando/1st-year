# strlen
.globl _start

.data
      src: .string "This is the source string."

.text
_start:

      # call strlen
      la   a0, src
      jal  strlen

      # print the size, ret in a0
      li    a7, 1
      ecall
exit:
      #call number 10 = exit
      li    a7, 10
      ecall

################################################################################
# a0 = const char *str
################################################################################
strlen:
      add  t0, zero, zero        # i = 0

                                 # Start of for loop
strlen_loop:
      add  t1, t0, a0            # Add the byte offset for str[i]
      lb   t1, 0(t1)             # dereference str[i]
      beq  t1, zero, strlen_end  # if str[i] == 0, break for loop
      addi t0, t0, 1             # i++
      j    strlen_loop           # loop

strlen_end:
      addi a0, t0, 0             # Move t0 into a0 to return
      ret

################################################################################
