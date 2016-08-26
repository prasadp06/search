(function() {
    
    var LoginController = function (appSecurity,$location,$timeout) {
        this._USERNAME = 'test';
        this._PASSWORD = 'test';
        
        this.userName = '';
        this.inputPassword = '';
        this.displayMessage = ''
        this.isMessage = false;
        
        this.doLogin = function(){
          if(this.userName === this._USERNAME && this.inputPassword === this._PASSWORD){
              this.displayMessage = 'Logged in !!';
              appSecurity.setAuthanticated(true);
              appSecurity.setLoginButtonLabel("LogOut");
              appSecurity.setUserName(this.userName);
              $location.path('/jobs/');
              appSecurity.setActiveNav('jobs');
//              $timeout(function () {
//                var response;
//                alert("Hello");
//                }, 100);
          } else {
              this.isMessage = false;
              this.displayMessage = 'Invalid User Id or Pasword ';
              appSecurity.setAuthanticated(true);
              appSecurity.setLoginButtonLabel("LogIn");
          }
          
        };
        
        
        
    };

    
   LoginController.$inject = ['appSecurity','$location','$timeout'];
   app.controller('LoginController', LoginController);    

    
}());

