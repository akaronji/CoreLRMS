package org.vetech.lrms.core.models;
// Generated Jan 17, 2015 8:30:18 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * DocumentLending generated by hbm2java
 */
public class DocumentLending  implements java.io.Serializable {


     private Integer documentLendId;
     private int documentLenderId;
     private String lendingDocumentSerial;
     private Date dateOut;
     private Date dateIn;
     private boolean returned;

    public DocumentLending() {
    }

    public DocumentLending(int documentLenderId, String lendingDocumentSerial, Date dateOut, Date dateIn, boolean returned) {
       this.documentLenderId = documentLenderId;
       this.lendingDocumentSerial = lendingDocumentSerial;
       this.dateOut = dateOut;
       this.dateIn = dateIn;
       this.returned = returned;
    }
   
    public Integer getDocumentLendId() {
        return this.documentLendId;
    }
    
    public void setDocumentLendId(Integer documentLendId) {
        this.documentLendId = documentLendId;
    }
    public int getDocumentLenderId() {
        return this.documentLenderId;
    }
    
    public void setDocumentLenderId(int documentLenderId) {
        this.documentLenderId = documentLenderId;
    }
    public String getLendingDocumentSerial() {
        return this.lendingDocumentSerial;
    }
    
    public void setLendingDocumentSerial(String lendingDocumentSerial) {
        this.lendingDocumentSerial = lendingDocumentSerial;
    }
    public Date getDateOut() {
        return this.dateOut;
    }
    
    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
    public Date getDateIn() {
        return this.dateIn;
    }
    
    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }
    public boolean isReturned() {
        return this.returned;
    }
    
    public void setReturned(boolean returned) {
        this.returned = returned;
    }




}

