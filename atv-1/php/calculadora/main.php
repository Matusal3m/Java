<?php
include_once 'Calc.php';

$calc = new Calc;

$n1 = readline('Insira o primeiro valor: ');
$n2 = readline('Insira o segundo valor: ');

$operador = readline('Escolha qual será a operação (+, -, *, /): ');

echo 'o resultado é ', $calc->calcular($n1, $n2, $operador);
