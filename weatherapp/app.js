const apiKey = 'https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API key}';

function getWeather() {
    const city = document.getElementById('city').value;
    const weatherInfo = document.getElementById('weather-info');

    if (city) {
        fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}`)
            .then(response => response.json())
            .then(data => {
                const temperature = Math.round(data.main.temp - 273.15); // Convert from Kelvin to Celsius
                const description = data.weather[0].description;

                weatherInfo.innerHTML = `<p>Temperature: ${temperature}°C</p><p>Description: ${description}</p>`;
            })
            .catch(error => {
                console.error('Error fetching weather data:', error);
                weatherInfo.innerHTML = 'Error fetching weather data. Please try again.';
            });
    } else {
        weatherInfo.innerHTML = 'Please enter a city name.';
    }
}
