# ########################################################################
# Scrivere una funzione RISC-V isnumber che controlla se una stringa ricevuta
# come parametro � la rappresentazione di un numero intero positivo in ASCII.
# Controllare vuol dire: restituire 1 se la condizione � vera, 0 altrimenti.
# 
# isnumber deve utilizzare la funzione isdigit realizzata nell'esercizio
# precedente.
# ########################################################################


.globl _start

.data
  in_str: .string "12w34" 

.text

_start:
  la a0, in_str
  li a1, 48
  li a2, 57

  jal isnumber
  
  li a7, 1 # stampo risultato {0,1}
  ecall

exit:
  li a7, 10
  ecall


# ######################################################################## int
# isnumber(char* in_str){
#   char* cursor = in_str;
#
#   if(!(*cursor)){return 0;}
#
#   while(*cursor){
#     if(!isdigit(*cursor)){
#       return 0;
#     }
#     ++cursor;
#   }
#   return 1;
# }
# 

isnumber:
	addi sp,sp,-16
	sd ra,0(sp)
	sd s0,8(sp)
	
	mv s0,a0
	
  	
ciclo:
	lbu t0,0(s0)
	beqz t0,true
	jal isdigit
	
	beqz t1,false
	
	addi s0,s0,1
	
	j ciclo
	

false:
	li a0,0
	j fine

true:
	li a0,1

fine:
	ld s0,8(sp)
	ld ra,0(sp)
	addi sp,sp,16
	ret


# =================================
# int isdigit(char in_char) {
#   return (in_char >= 48 && in_char <= 57) ? 1 : 0;
# }
# =================================
# a0 --> in_char
# 

isdigit:
	blt t0,a1,retfalse
	bgt t0,a2,retfalse
	
	li t1,1

	ret
	
retfalse:
	li t1,0
	ret
  

















