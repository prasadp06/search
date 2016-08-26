(function (){
	var app = angular.module('hotel',[]);

	app.directive("hotelDetails", function() {
	    return {
	      restrict: 'E',
	      templateUrl: "hotel-details.html",
	      controller: function() {
	      	this.tab = 1;
	    	this.setTab = function(value){
	      		this.tab = value;
	    	};
		    this.isTabSelected = function(value){
		    	if(this.tab == value) return true;
		      return false;
		    };
	      },
	      controllerAs: 'tab'
	    };
	  });
})();