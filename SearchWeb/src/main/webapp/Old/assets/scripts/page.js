(function() {
    
    var PageController = function (appSecurity,$location,$timeout) {
        
        this.isValidUser = function () {
            if(appSecurity.isAuthanticated()){
                //$timeout(this.isValidUser, 1000);
                appSecurity.setAuthanticated(false);
            }
            else {
                $location.path('/');
            }
            return appSecurity.isAuthanticated();
        };
        
        this.getButtonLabel = function () {
            return appSecurity.getLoginButtonLabel();
        };
        
        this.getUserName = function () {
            return appSecurity.getUserName();
        };
        
        this.isActiveLink = function (navName) {
            return (navName == appSecurity.getActiveNav()) ? true  : false;
        };
        
        this.setLink = function (nav) {
          appSecurity.setActiveNav(nav);  
        };
    };
    
    
    PageController.$inject = ['appSecurity','$location','$timeout'];
    app.controller('PageController', PageController);
    
    var TabController = function (appSecurity) {
        this.tab = 'scheduled';
        
        this.selectTab = function (tabId) {
          this.tab = tabId;  
        };
        
        this.isSelected = function (tabId) {
            if(this.tab == tabId){
                return true;
            }
            else {
                return false;
            }
        }
        
        this.getTab = function () {
            return this.tab;
        }
        
    };
    
    
    TabController.$inject = ['appSecurity'];
    app.controller('TabController', TabController);
    
}());

