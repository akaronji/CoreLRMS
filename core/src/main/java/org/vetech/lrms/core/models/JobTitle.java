package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0



/**
 * JobTitle generated by hbm2java
 */
public class JobTitle  implements java.io.Serializable {


     private Integer jobTitleId;
     private String jobTitle;
     private String jobDescription;

    public JobTitle() {
    }

    public JobTitle(String jobTitle, String jobDescription) {
       this.jobTitle = jobTitle;
       this.jobDescription = jobDescription;
    }
   
    public Integer getJobTitleId() {
        return this.jobTitleId;
    }
    
    public void setJobTitleId(Integer jobTitleId) {
        this.jobTitleId = jobTitleId;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }
    
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }




}

