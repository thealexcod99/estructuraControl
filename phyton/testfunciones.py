#!/usr/bin/env python
# -*- coding: utf-8 -*-
#En java hariamos funciones.factorial(6)
from funciones import factorial, divisiblesPorSeis
#En java sería: Scanner sc = new Scanner(System.in)
numero = int(input('Introduce número: '))

print ('El factorial de ', numero, ' vale ', factorial(numero))

divisiblesPorSeis(numero)
