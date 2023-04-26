.globl _start

.text

_start:
	li	a0,1	#put values in varables
	li	a1, 2
	jal	sum	#jal tto procedure
	
print:
	li	a7,1	#print result
	ecall

exit:
	li	a7,10	#ecall exit
	ecall

#sum procedure
sum:
	add a0,a0,a1

sum_end:
	ret
