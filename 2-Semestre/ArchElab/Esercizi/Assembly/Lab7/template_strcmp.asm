# strcmp
.globl _start

.data
      str1: .string "daje"
      str2: .string "daje"

.text
_start:

      # call strcmp
      la   a0, str1
      la   a1, str2
      jal  ra, strcmp

      # result in a0
      li    a7, 1
      ecall
exit:
      #call number 10 = exit
      li    a7, 10
      ecall

################################################################################
# a0 = const char *str1
# a1 = const char *str2
################################################################################
strcmp:
	lbu t0,(a0)
	lbu t1,(a1)
	
	beqz t0,first
	
	bne t0,t1,false
	
	addi a0,a0,1
	addi a1,a1,1
	
	j strcmp
	
false:
	li a0,1
	ret
	
first:
	beqz t1,second
	li a0,1
	ret

second:
	li a0,0
	ret
      

################################################################################

