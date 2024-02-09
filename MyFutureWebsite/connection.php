<?php

$servername="localhost";
$username="root";
$password="";
$dbname = "registerinformation";
$conn = mysqli_connect($servername, $username, $password, $dbname);

if($conn){
echo"Connection is good";
}
else{
    echo "Retry Connection".mysqli_connect_error();
}
?>