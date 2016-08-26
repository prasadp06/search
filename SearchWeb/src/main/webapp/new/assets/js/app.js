

(function (){

	var starJson = [
	{
		name: 'Sheraton Stamford',
		price: 100,
		currency: 'USD',
		points: 10000,
		category: 4,
		address:  { address1 : '700 East Main Street ', city: 'Stamford', state: 'Connecticut', pin: '06902', country: 'United States' },
		description: 'Close to Fortune 500 offices and easy access to New York, our hotel has everything you need for a successful business or leisure trip.',
		distance: '0.92 km / 0.57 miles from center of Stamford.',
		images: [{ thumb: 'assets/img/hotelimage1.jpg', full:''}]
	}
	];

	var app = angular.module('Starwood',['hotel']);
	
	app.controller('StarwoodController', function () {
  		this.hotels = starJson;
  	});

	app.controller('TabController', function() {
    	this.tab = 1;
    	this.setTab = function(value){
      		this.tab = value;
    	};
	    this.isTabSelected = function(value){
	    	if(this.tab == value) return true;
	      return false;
	    };
	});

	app.controller('SearchController', function(){
		this.search = {};

		this.doSearch = function(){
			alert(this.search);
		};
	});

	


})();
