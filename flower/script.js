document.getElementById("giveFlowerBtn").addEventListener("click", function() {
    // Animate the guy giving a flower to the girl
    const guy = document.getElementById("guy");
    const girl = document.getElementById("girl");

    guy.style.transform = "translateX(-50px)";
    girl.style.transform = "translateX(50px)";

    setTimeout(function() {
        guy.style.transform = "translateX(0)";
        girl.style.transform = "translateX(0)";
    }, 1000); // Reset the position after 1 second
});
