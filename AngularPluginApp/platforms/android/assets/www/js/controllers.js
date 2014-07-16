var pluginControllers = angular.module('pluginControllers',[]);

pluginControllers.controller('HomeController',function($scope){

	$scope.handleClick = function(){

		console.log("In handleClick");

		customplugin.createEvent(

			function(){
            },

            function(error){
                alert(error);
            }

		);
	}

});


