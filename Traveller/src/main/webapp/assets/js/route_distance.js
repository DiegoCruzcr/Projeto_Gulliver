function initMap() {
    const center = {lat: 40.774102, lng: -73.971734};
    const options = {zoom: 15, scaleControl: true, center: center};
    console.log(document.getElementById("map"));
    var map = new google.maps.Map(document.getElementById("map"), options);
    const addressFrom = {lat: -23.4735669, lng: -46.6865107};
    const addressTo = {lat: -23.5836023, lng: -46.6644988};
    var markerAddresFrom = new google.maps.Marker({position: addressFrom, map: map});
    var markerAddresTo = new google.maps.Marker({position: addressTo, map: map});
    var lineDistance = new google.maps.Polyline({path: [addressFrom, addressTo], map: map});
    var distance = haversine_distance(markerAddresFrom, markerAddresTo);
    document.getElementById('msg').innerHTML = distance.toFixed(3) + " km.";
    // console.log(markerToAddresFrom, markerToAddresTo);
 }
 function haversine_distance(mk1, mk2) {
    var R = 6371.0710; // Radius of the Earth in miles
    var rlat1 = mk1.position.lat() * (Math.PI/180); // Convert degrees to radians
    var rlat2 = mk2.position.lat() * (Math.PI/180); // Convert degrees to radians
    var difflat = rlat2-rlat1; // Radian difference (latitudes)
    var difflon = (mk2.position.lng()-mk1.position.lng()) * (Math.PI/180); // Radian difference (longitudes)

    var d = 2 * R * Math.asin(Math.sqrt(Math.sin(difflat/2)*Math.sin(difflat/2)+Math.cos(rlat1)*Math.cos(rlat2)*Math.sin(difflon/2)*Math.sin(difflon/2)));
    return d;
 }
window.initMap = initMap;
