package DTO;

import java.util.List;

public class CoverPage {
    private String securityConsultant;
    private String reportId;
    private String clientLogo;
    private String endClientName;
    private List<String> scopeOfScan;
    private String creationDate;
    private String securityAuthorName;
    private String year;
    private String SCCName;
    private String SCCAddress;
    private String SCCSalesEmailId;

    public String getSecurityConsultant() {
        return securityConsultant;
    }

    public void setSecurityConsultant(String securityConsultant) {
        this.securityConsultant = securityConsultant;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getClientLogo() {
        return clientLogo;
    }

    public void setClientLogo(String clientLogo) {
        this.clientLogo = clientLogo;
    }

    public String getEndClientName() {
        return endClientName;
    }

    public void setEndClientName(String endClientName) {
        this.endClientName = endClientName;
    }

    public List<String> getScopeOfScan() {
        return scopeOfScan;
    }

    public void setScopeOfScan(List<String> scopeOfScan) {
        this.scopeOfScan = scopeOfScan;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getSecurityAuthorName() {
        return securityAuthorName;
    }

    public void setSecurityAuthorName(String securityAuthorName) {
        this.securityAuthorName = securityAuthorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSCCName() {
        return SCCName;
    }

    public void setSCCName(String SCCName) {
        this.SCCName = SCCName;
    }

    public String getSCCAddress() {
        return SCCAddress;
    }

    public void setSCCAddress(String SCCAddress) {
        this.SCCAddress = SCCAddress;
    }

    public String getSCCSalesEmailId() {
        return SCCSalesEmailId;
    }

    public void setSCCSalesEmailId(String SCCSalesEmailId) {
        this.SCCSalesEmailId = SCCSalesEmailId;
    }

}
