# #############################################################################
# Esercizio 7 SELECTION SORT
# 
# #############################################################################

.globl _start

.data
  size:   .word 4
  array:  .word 3, 2, 7, 1


.text
_start:

  la a0, array      # load the vector address
  la a1, size       # indirizzo array[0]
  lw a1, 0(a0)      # a1 size dell'array
  jal casobase

  la a0, array      # load the vector address
  la a1, size       # indirizzo array[0]
  lw a1, 0(a0)      # a1 size dell'array
  jal print

exit:
  li a7, 10
  ecall

# #############################################################################
# void selectionSort(int array[], int size){
###############################################################################

casobase:
	bgtz a1,selection_sort
	ret


selection_sort:	
	addi sp,sp,-24
	sd ra,0(sp)
	sd a0,8(sp) #salvo l'array residuo 
	sd a1,16(sp) #salvo lunghezza vettore residuo
	
	jal minarray #ottengo indice del minore
	
	mv a1,a0
	li a2,0
	ld a0,8(sp)
	
	jal swap
	
	ld a0,8(sp)
	addi a0,a0,4
	ld a1,16(sp)
	addi a1,a1,-1
	
	jal casobase

	ld ra,0(sp)
	addi sp,sp,24
	
	ret
	

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











