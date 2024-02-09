
// Get the element with the id 'new-arrivals-gallery'

const newArrivalsGallery = document.getElementById('new-arrivals-gallery');
// Array of image sources for new arrivals

const newArrivalsImages = ['images/tshirt.jpeg', 'images/jeans.jpeg', 'images/jacket.jpeg'];
// Iterate through each image source in the array

newArrivalsImages.forEach(imageSrc => {
     // Create a new 'img' element

    const img = document.createElement('img');
    // Set the 'src' attribute of the image element to the current image source

    img.src = imageSrc;
    // Append the created image element to the 'newArrivalsGallery' container

    newArrivalsGallery.appendChild(img);
});
