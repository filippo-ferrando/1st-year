# #############################################################################
# Esercizio 6 – minarray
# 
# Scrivere una funzione minarray(v, s) che restituisca l’indice del valore
# minimo presente nell’array v.
# 
# Nota: L'indirizzo di v deve essere passato come parametro a minarray insieme a
# s (size), che rappresenta il numero di word in v.
# #############################################################################

.globl _start

.data
  size:   .word 5
  array:  .word 3, 2, 3, 1, 7


.text
_start:
  la a0, array      # load the vector address
  la a1, size       # load the size address
  lw a1, 0(a1)      # load the actual size

  jal minarray

  li a7, 1
  ecall

exit:
  li a7, 10
  ecall

# int minarray(int* array, int size){
#   int min_idx = 0;
#   int min_val = array[0];
#   int i = 1;
#
#   while(i < size){
#     if(array[i] < min_val){
#       min_idx = i;
#       min_val = array[i];
#     }
#     ++i;
#   }
#   return min_idx;
# }
# #############################################################################
# a0 --> indirizzo del vettore
# a1 --> val della size
# #############################################################################
minarray:
	li t0,0	#indice primo elemento
	lw t1,0(a0) #valore primo elemento
	
	addi a1,a1,-1 #x elementi rimanenti
	addi t3,t3,1 #indice prox elemento
	
ciclo:
	beqz a1,end
	
	addi a0,a0,4
	lw t2,0(a0)	#avanzo e leggo prox elemento
	
	bge t2,t1,avanti #confronto tramite maggiore -> salto se non è minore
	#se sono qui è il nuovo minore
	
	mv t0,t3
	mv t1,t2
	
avanti: #aggiorno elemento
	addi t3,t3,1
	addi a1,a1,-1
	j ciclo
	

end:
	mv a0,t0
	ret

