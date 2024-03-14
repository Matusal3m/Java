<?php

$notasAlunos = [[]];
$medias = [];

for( $i = 0; $i < 10; $i++ ) {
  for( $j = 0; $j < 4; $j++ ) {
    echo "Coloque a " , $j + 1 , "ª nota do " , $i + 1 , "º aluno(a): ";
    $notasAlunos[$i][$j] = readline("");
  }
  echo "\n";
}

for( $i = 0; $i < 10; $i++ ) {
  $medias[$i] = ($notasAlunos[$i][0] + $notasAlunos[$i][1] + $notasAlunos[$i][2] + $notasAlunos[$i][3]) / 4;
}

echo "As respectivas médias são: ";

foreach ($medias as $media) {
  echo $media , " ";
}