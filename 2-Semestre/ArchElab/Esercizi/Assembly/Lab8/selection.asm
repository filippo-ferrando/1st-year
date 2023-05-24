	.file	"selection.c"
	.option pic
	.text
	.align	1
	.globl	swap
	.type	swap, @function
swap:
	slli	a2,a2,2
	add	a2,a0,a2
	lw	a5,0(a2)
	slli	a1,a1,2
	add	a0,a0,a1
	lw	a4,0(a0)
	sw	a4,0(a2)
	sw	a5,0(a0)
	ret
	.size	swap, .-swap
	.align	1
	.globl	min_array
	.type	min_array, @function
min_array:
	mv	a6,a0
	li	a5,1
	ble	a1,a5,.L6
	addi	a3,a0,4
	li	a4,1
	li	a0,0
	j	.L5
.L4:
	addiw	a4,a4,1
	addi	a3,a3,4
	beq	a1,a4,.L8
.L5:
	slli	a5,a0,2
	add	a5,a6,a5
	lw	a2,0(a3)
	lw	a5,0(a5)
	bge	a2,a5,.L4
	mv	a0,a4
	j	.L4
.L8:
	ret
.L6:
	li	a0,0
	ret
	.size	min_array, .-min_array
	.align	1
	.globl	selection_sort
	.type	selection_sort, @function
selection_sort:
	bne	a1,zero,.L15
	ret
.L15:
	addi	sp,sp,-32
	sd	ra,24(sp)
	sd	s0,16(sp)
	sd	s1,8(sp)
	mv	s1,a0
	mv	s0,a1
	call	min_array
	mv	a2,a0
	li	a1,0
	mv	a0,s1
	call	swap
	addiw	a1,s0,-1
	addi	a0,s1,4
	call	selection_sort
	ld	ra,24(sp)
	ld	s0,16(sp)
	ld	s1,8(sp)
	addi	sp,sp,32
	jr	ra
	.size	selection_sort, .-selection_sort
	.align	1
	.globl	is_sorted
	.type	is_sorted, @function
is_sorted:
	li	a5,1
	ble	a1,a5,.L19
	mv	a5,a0
	addiw	a4,a1,-2
	slli	a3,a4,32
	srli	a4,a3,30
	addi	a0,a0,4
	add	a4,a4,a0
.L18:
	lw	a2,0(a5)
	lw	a3,4(a5)
	bgt	a2,a3,.L20
	addi	a5,a5,4
	bne	a5,a4,.L18
	li	a0,1
	ret
.L19:
	li	a0,1
	ret
.L20:
	li	a0,0
	ret
	.size	is_sorted, .-is_sorted
	.section	.rodata.str1.8,"aMS",@progbits,1
	.align	3
.LC1:
	.string	"%d\n"
	.align	3
.LC2:
	.string	"%d "
	.text
	.align	1
	.globl	main
	.type	main, @function
main:
	addi	sp,sp,-80
	sd	ra,72(sp)
	sd	s0,64(sp)
	sd	s1,56(sp)
	sd	s2,48(sp)
	lla	a5,.LANCHOR0
	ld	a1,0(a5)
	ld	a2,8(a5)
	ld	a3,16(a5)
	ld	a4,24(a5)
	ld	a5,32(a5)
	sd	a1,8(sp)
	sd	a2,16(sp)
	sd	a3,24(sp)
	sd	a4,32(sp)
	sd	a5,40(sp)
	li	a1,10
	addi	s0,sp,8
	mv	a0,s0
	call	is_sorted
	mv	a1,a0
	lla	a0,.LC1
	call	printf@plt
	li	a1,10
	mv	a0,s0
	call	selection_sort
	addi	s2,sp,48
	lla	s1,.LC2
.L23:
	lw	a1,0(s0)
	mv	a0,s1
	call	printf@plt
	addi	s0,s0,4
	bne	s0,s2,.L23
	li	a0,10
	call	putchar@plt
	li	a1,10
	addi	a0,sp,8
	call	is_sorted
	mv	a1,a0
	lla	a0,.LC1
	call	printf@plt
	li	a0,0
	ld	ra,72(sp)
	ld	s0,64(sp)
	ld	s1,56(sp)
	ld	s2,48(sp)
	addi	sp,sp,80
	jr	ra
	.size	main, .-main
	.section	.rodata
	.align	3
	.set	.LANCHOR0,. + 0
.LC0:
	.word	9
	.word	1
	.word	8
	.word	2
	.word	4
	.word	5
	.word	0
	.word	3
	.word	7
	.word	6
	.ident	"GCC: (Debian 11.2.0-9) 11.2.0"
	.section	.note.GNU-stack,"",@progbits
