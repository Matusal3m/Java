<?php

$numInteiros = [];

for( $i = 0; $i < 15; $i++ ) {
  $numInteiros[$i] = $i * 2;
}

array_reverse($numInteiros);

foreach ( $numInteiros as $numInteiro ) {
  echo $numInteiro , "\n";  
}