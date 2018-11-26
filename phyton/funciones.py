#!/usr/bin/env python
# -*- coding: utf-8 -*-
#En java sería: public static int factorial(int numero) {....
def	factorial(numero):	
	contador = 1
	acumulador = 1
	
	while (contador <= numero):
		acumulador *= contador
		contador += 1
	
	return acumulador
	
#En java seria: public static void divisiblesPorDosYTres(int numero)

def divisiblesPorSeis(numero):
	
	for i in range(1, numero): #Para excluir el 0 del contador
		
		if i % 2 == 0 and i % 3 == 0:
			print(i, ' es divisible por 2 y por 3')
		else:
			print(i, ' NO es divisible por 2 y por 3')
