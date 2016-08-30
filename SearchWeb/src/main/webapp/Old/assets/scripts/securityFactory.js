(function() {
    
    var SecurityFactory = function () {
        this.authanticated = false;
        this.buttonName      = "LogIn";
        var factory = {}
        this.user   = '';
        
        this.activeNav = '';
        factory.setActiveNav = function (nav) {
          this.activeNav = nav;
        };
        
        factory.getActiveNav = function (nav) {
          return this.activeNav;
        };
        
        factory.setUserName = function (user) {
            this.user = user;
        };
        
        factory.getUserName = function () {
            return this.user;
        };
        
        factory.isAuthanticated = function () {
          return this.authanticated;
        };
        
        factory.getLoginButtonLabel = function () {
          return this.buttonName ;
        };
        
        factory.setAuthanticated = function (value){
            this.authanticated = true;
        };
        
        factory.setLoginButtonLabel = function (value) {
          this.buttonName = value;
        };
        
        return factory;
    };
    
    //JobController.$inject = ['$scope'];
    app.factory('appSecurity', SecurityFactory);
    
}());