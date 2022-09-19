function initMap() {
    const center = {lat: 40.774102, lng: -73.971734};
    const options = {zoom: 15, scaleControl: true, center: center};
    console.log(document.getElementById("map"));
    var map = new google.maps.Map(document.getElementById("map"), options);
    const addressFrom = {lat: 40.7767644, lng: -73.9761399};
    const addressTo = {lat: 40.771209, lng: -73.9673991};
    var markerToAddresFrom = new google.maps.Marker({position: addressFrom, map: map});
    var markerToAddresTo = new google.maps.Marker({position: addressTo, map: map});
    var lineDistance = new google.maps.Polyline({path: [addressFrom, addressTo], map: map});
    // console.log(markerToAddresFrom, markerToAddresTo);
 }
 window.initMap = initMap;
