<?php

class Calc {
    public function calcular($n1, $n2 , $operador){

        if ($operador == '/'){
            $result = $n1 / $n2;
        } elseif ($operador == '*') {
            $result = $n1 * $n2;
        } elseif ($operador == '-') {
            $result = $n1 - $n2;
        } else {
            $result = $n1 + $n2;
        }

        return $result;
    }

}
