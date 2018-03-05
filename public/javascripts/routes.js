var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "../view/Route/mainRoute.htm",
        controller: "mainController"
    })
    .when("/events", {
        templateUrl : "../view/Route/events.htm",
        controller: "eventsController"
    })
});