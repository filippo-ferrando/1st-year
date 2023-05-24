# ########################################################################
# Esercizio 4  atoi() 
# Scrivere una funzione RISC-V atoi che converta una stringa ASCII con un numero
# intero positivo in una variabile numerica (intero in complemento a 2). Il
# valore ottenuto deve essere restituito al chiamante nel registro a0.
# ########################################################################

.globl _start

.data
  size:   .word 3
  in_str: .string "123" 

.text

_start:
  la a0, in_str    # a0 contiene indirizzo della stringa
  la a1, size      # indirizzo size (temporaneamente)
  lw a1, 0(a1)     # a1 contiene la size della stringa

  jal atoi
  
  
  li a7, 1         # stampo risultato presente in a0
  ecall

exit:
  li a7, 10
  ecall


# ########################################################################
# unsigned long atoi_new (char* str, unsigned long n){
#   if(n==1)
#     return str[0]-'0';
#   return (10*atoi_new(str, n-1) + str[n-1]-'0');
# }
# ########################################################################
# 
# a0 --> indirizzo di in_str
# a1 --> size della stringa

atoi:
  
  
  
  
  
  
	ret
# ########################################################################


















