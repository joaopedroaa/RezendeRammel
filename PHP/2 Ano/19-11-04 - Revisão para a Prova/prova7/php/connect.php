<?php

  $hostname = "localhost";
  $username = "root";
  $password = "";
  $database = "phprova"; 
  $table = "cliente";

  $conn = mysqli_connect($hostname, $username, $password, $database);

  if(!$conn){
    die("Connect Error: ". mysqli_connect_error());
  }
  
?>