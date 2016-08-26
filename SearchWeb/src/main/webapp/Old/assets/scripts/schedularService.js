(function() {
    
    var JobService = function () {
     this.jobs= [
                { id: '1', name: 'Adhoc Job One', parent: 'JVM 1', status: 'Processing', startDate: '24-02-2016', endDate: '', type:'adhoc'},
                { id: '2', name: 'Scheduled Job One', parent: 'JVM 2', status: 'Completed', startDate: '24-02-2016', endDate: '24-02-2016', type:'scheduled'},
                { id: '3', name: 'Trigger Job Two', parent: 'JVM 2', status: 'Completed', startDate: '24-02-2016', endDate: '24-02-2016', type:'trigger'}
        ];
        
        
        this.getJobs = function () {
          return this.jobs;
        };
        
        this.getJob = function (jobId) {
            for(var i = 0; i<this.jobs.length; i++){
                if(this.jobs[i].id == parseInt(jobId)){
                    return this.jobs[i];
                }
            }
        };
        
        this.addJob = function (nJob) {
          return this.jobs.push(nJob);
        };
        
        // Filter Jobs By Type 
        this.getJobsByType = function (type) {
            
            var tempJob = [];
            this.jobs.forEach( function (job){
                if(job.type === type){
                    tempJob.push(job);
                }
            });
          return tempJob;
        };
        
        this.getJobByType = function (jobId, type) {
            for(var job in this.jobs){
                if(this.job.id == parseInt(jobId) && this.job.type === type){
                    return job;
                }
            }
        };
        
        this.addJobByType = function (nJob, type) {
          nJob.type = type;
          return this.jobs.push(nJob);
        };
        
    };
    
    //JobController.$inject = ['$scope'];
    app.service('jobService', JobService);
    
}());