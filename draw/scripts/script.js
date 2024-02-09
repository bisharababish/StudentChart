function uploadVideo() {
    const form = document.getElementById('uploadForm');
    const formData = new FormData(form);

    fetch('/upload-endpoint', {
        method: 'POST',
        body: formData,
    })
    .then(response => response.json())
    .then(data => {
        console.log('Video uploaded:', data);
        
    })
    .catch(error => {
        console.error('Error uploading video:', error);
        
    });
}