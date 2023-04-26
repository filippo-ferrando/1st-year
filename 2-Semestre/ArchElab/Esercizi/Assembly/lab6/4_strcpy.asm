# strlen
.globl _start

.data
      src: .string "source"
      dst: .string "-------------"

.text
_start:

      # print the size of src
      la   a0, src
      jal  strlen
      li   a7, 1
      ecall

      # print new line
      addi a0, zero, 0x0A
      li   a7, 11
      ecall

      # print the size of dst
      la   a0, dst
      jal  ra, strlen
      li   a7, 1
      ecall

      # print new line
      addi a0, zero, 0x0A
      li   a7, 11
      ecall

      # call strcpy
      la   a0, src
      la   a1, dst
      jal  strcpy

      # print the size of dst
      la   a0, dst
      jal  strlen
      li   a7, 1
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
# a0 = const char *str
# a1 = const char *dst
################################################################################
strcpy:
      addi sp, sp, -32
      sd   ra, 0(sp)
      sd   a0, 8(sp)
      sd   a1, 16(sp)
      sd   s1, 24(sp)

      jal  strlen            # strlen src
      add  s1, a0, zero          # s1 = n

      ld   a0, 16(sp)            # strlen dst
      jal  strlen
      add  t0, a0, zero          # t0 = m -> assuming m > n
      sub  t1, t0, s1            # t1 = m-n

      ld   a0, 8(sp)             # recover a0
      ld   a1, 16(sp)            # recover a1
STRCPY_L1:
      beq  t0, zero, STRCPY_L4   # done if i == m
      ble  t0, t1, STRCPY_L2     # if > m-n, copy char
      lb   t2, 0(a0)             # dereference str[i]
      sb   t2, 0(a1)             # str[i] -> dst[i]
      addi a0, a0, 1             # increment a0
      j    STRCPY_L3
STRCPY_L2:                       # else put a \0
      sb   zero, 0(a1)
STRCPY_L3:
      addi a1, a1, 1             # increment the other registers
      addi t0, t0, -1
      j    STRCPY_L1             # loop
STRCPY_L4:
      ld   s1, 24(sp)
      ld   ra, 0(sp)
      addi sp, sp, 32
      ret

################################################################################
