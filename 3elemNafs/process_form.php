<?php
// Replace these values with your actual database credentials
$host = 'localhost';
$db_name = 'psychologist_office';
$username = 'root';
$password = '';

try {
    // Connect to MySQL using PDO
    $pdo = new PDO("mysql:host=$host;dbname=$db_name", $username, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Get form data
    $name = $_POST['name'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $message = $_POST['message'];

    // Prepare and execute the SQL query to insert data into the 'appointments' table
    $stmt = $pdo->prepare("INSERT INTO appointments (name, email, phone, message) VALUES (:name, :email, :phone, :message)");
    $stmt->bindParam(':name', $name);
    $stmt->bindParam(':email', $email);
    $stmt->bindParam(':phone', $phone);
    $stmt->bindParam(':message', $message);
    $stmt->execute();

    // Close the database connection
    $pdo = null;

    // Redirect back to the main page after successful submission
    header('Location: index.html');
    exit();
} catch (PDOException $e) {
    // Handle database errors
    echo "Error: " . $e->getMessage();
    die();
}
?>
