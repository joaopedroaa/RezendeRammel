<?php

$hostname = 'localhost';
$username = 'joaopedro';
$password = 'password';
$database = 'store';
$table = "client";

// $connect = new mysqli($hostname, $username, $password, $database);
$connect = mysqli_connect($hostname, $username, $password, $database);

if (!$connect) {
  // die("Connect Error: ". mysqli_error($database));
  die("Connect Error: " . mysqli_connect_error());
}
