<?php
date_default_timezone_set('America/Sao_Paulo');

$horas = (int)date('H');

if ($horas >= 5 && $horas <= 11) {
    echo 'Bom dia';
} elseif ($horas >= 12 && $horas <= 18) {
    echo 'Boa tarde';
} elseif ($horas >= 19 && $horas <= 23) {
    echo 'Boa noite';
} else{
    echo 'Vai dormir';
}
