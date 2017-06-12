app.controller("myCtrl", function($scope, $http) {

  var callEvery = 10000;
  var USDUrl = "http://localhost:8080/quotation/USD";
  var oscillationQuotations = [1, -1, 0.1, -0.1, 0.01, -0.01, 0.001, -0.001]
  $scope.quotations = [];

  var randomOscillation = function () {
    return oscillationQuotations[Math.floor(Math.random()*oscillationQuotations.length)];
  }

  var currentDate = function () {
    var now = new Date();
    return now.getDate() + "/"
         + now.getMonth()  + "/"
         + now.getFullYear() + " "
         + now.getHours() + ":"
         + now.getMinutes()
  }

  var addRandomQuotation = function (aCurrency, buyBase, sellBase) {
    var randomOsc = randomOscillation();
    var now = new Date();
    $scope.quotations.unshift({
      currency: aCurrency,
      buy: (buyBase + randomOsc).toString(),
      sell: (sellBase + randomOsc).toString(),
      timestamp: "Actualizada al " + currentDate()
    })
  }

  var addUSDQuotation = function () {
    $http.get(USDUrl).
      success(function(data) {
        $scope.quotations.unshift({
          currency: "USD",
          buy: data[0],
          sell: data[1],
          timestamp: data[2]
        })
      }).
      error(function(data){
        console.log("ERROR");
      });
  }

  var saveDataInLocalStorage = function () {
    localStorage.setItem("quotation", JSON.stringify($scope.quotations));
  }

  var getDataFromLocalStorage = function () {
    var storagedData = JSON.parse(localStorage.getItem("quotation"));
    if(storagedData != null) {
      $scope.quotations = storagedData;
    }
  }

  setInterval(function(){
    addUSDQuotation();
    addRandomQuotation("ARS", 1, 1);
    addRandomQuotation("BRL", 4.83, 4.90);
    //localStorage.removeItem("quotation");
    //saveDataInLocalStorage();
  }, callEvery)

  //getDataFromLocalStorage();








});