console.log("AAAAAAA")
function CalculateDistanceBetweenAddress() {
    console.log("bbbbb")
    // var destinationFrom = document.getElementById();
    // var destinationTo = document.getElementById();
    var distancematrix = document.getElementById("distancematrix");
    console.log(distancematrix);
    // var axios = require('axios');

    // axios.get({
    //     url: 'https://maps.googleapis.com/maps/api/distancematrix/json?origins=Washington%2C%20DC&destinations=New%20York%20City%2C%20NY&units=imperial&key=AIzaSyCO7cjgtY8a8TLK8XCxVChOx0VrrFmf4jM',
    //     method: 'get'
    //   });
    var url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Washington%2C%20DC&destinations=New%20York%20City%2C%20NY&units=imperial&key=AIzaSyCO7cjgtY8a8TLK8XCxVChOx0VrrFmf4jM";
    var headers = {
        headers: {
            'Access-Control-Allow-Origin': '*',
            'Access-Control-Allow-Methods': '*',
            'mode':'cors'
          }       
    }
    var req = fetch(url, headers);
    console.log(req);
    // var config = {
    //   method: 'get',
    //   url: 'https://maps.googleapis.com/maps/api/distancematrix/json?origins=Washington%2C%20DC&destinations=New%20York%20City%2C%20NY&units=imperial&key=AIzaSyCO7cjgtY8a8TLK8XCxVChOx0VrrFmf4jM',
    //   headers: { }
    // };
    // axios(config)
    // .then(function (response) {
    //   console.log(JSON.stringify(response.data));
    //   distancematrix.innerHTML = "response.data";
    // })
    // .catch(function (error) {
    //   console.log(error);
    // });
    // distancematrix.innerHTML=url;
    console.log(url);
 }
window.onload=CalculateDistanceBetweenAddress();







