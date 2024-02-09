<?php
$name = $_POST['name'];
$email = $_POST['email'];
$number = $_POST['number'];
$message = $_POST['message'];

$conn = new mysqli('localhost', 'root','', 'contactus');

if ($conn->connect_error) {
    die('Connection Failed :  ' . $conn->connect_error);
} else {
    $stmt = $conn->prepare("Insert Into Table(name,email,number,message) values(?,?,?,?)");
    $stmt->bind_param("ssis", $name, $email, $number, $message);
    $stmt->execute();
    echo "Message Accepted!";
    $stmt->close();
    $conn->close();
} ?>