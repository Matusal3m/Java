<?php

$letras = [];

for ($i = 0; $i < 7; $i++) {
  $letras[$i] = readline("Digite uma letra: ");
}

foreach($letras as $letra) {
  if ($letra == "a" || $letra == "e" || $letra == "i" || $letra == "o" || $letra == "u") {
    echo $letra , "\n";
    }
}