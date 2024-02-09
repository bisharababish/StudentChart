document.addEventListener('DOMContentLoaded', function () {
    // Image Slider
    let currentIndex = 0;
    const slides = document.querySelectorAll('.slider img');
    setInterval(() => {
      slides[currentIndex].style.opacity = 0;
      currentIndex = (currentIndex + 1) % slides.length;
      slides[currentIndex].style.opacity = 1;
    }, 5000);
  
    // Modal Pop-up
    const modal = document.querySelector('.modal');
    const closeModal = document.querySelector('.close');
    const claimOfferBtn = document.getElementById('claim-offer-btn');
  
    // Show the modal after 10 seconds (for example)
    setTimeout(() => {
      modal.style.display = 'block';
    }, 10000);
  
    // Close the modal
    closeModal.addEventListener('click', function () {
      modal.style.display = 'none';
    });
  
    // Handle claim offer button click
    claimOfferBtn.addEventListener('click', function () {
      // Handle the claim offer logic or send data to the server
      modal.style.display = 'none';
    });
  });
  