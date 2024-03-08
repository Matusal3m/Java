<?php

$n1 = readline('Insira um valor: ');

$n2 = readline('Insira outro valor: ');

function soma($n1, $n2) {
    return $n1 + $n2;
}

echo 'O resultado é:', soma($n1, $n2);
