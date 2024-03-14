<?php

$notasAlunos = [[]];

for( $i = 0; $i < 10; $i++ ) {
  for( $j = 0; $j < 4; $j++ ) {
    $notasAlunos[$i][$j] = readline("Coloque a " , $i , "ª nota do " , $j , "º aluno(a)");
  }
  echo "\n";
}
