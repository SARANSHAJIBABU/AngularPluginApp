var pluginApp = angular.module('pluginApp', [
	'ngRoute',
	'pluginControllers'
	]);

pluginApp.config(['$routeProvider', function($routeProvider) {
  $routeProvider.
  when('/', {
    templateUrl: 'partials/home.html',
    controller: 'HomeController'
  }).
  otherwise({
    redirectTo: '/home'
  });
}]);