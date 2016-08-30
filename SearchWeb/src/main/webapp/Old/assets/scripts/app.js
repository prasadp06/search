var app = angular.module('schedulerApp', ['ngRoute']);
app.config(function ($routeProvider) {
    $routeProvider.when('/', {
        controller: 'LoginController',
        templateUrl: 'views/login.html'
    })
    .when('/jobs/', {
        controller: 'JobController',
        templateUrl: 'views/jobs.html'      
    })
    .when('/reports/', {
        controller: 'JobController',
        templateUrl: 'views/reports.html'      
    })
    .otherwise ({redirectTo: '/' });
    
});

// Directive For Page Navigation at top 
app.directive('pageNav', function () {
   
    return {
        restrict: 'E',
        templateUrl: 'views/directive/page-nav.html'
    };
});
