package DTO;

public class SummaryPage {

    private String endClientName;
    private String typesOfAssets;
    private String numOfTypes;
    private int noOfCriticalVulnsTypeAssets;
    private int noOfHighVulnsTypeAssets;
    private int noOfMediumVulnsTypeAssets;
    private int noOfLowVulnsTypeAssets;
    private int noOfInfoVulnsTypeAssets;
    private int noOfTotalVulnsTypeAssets = noOfCriticalVulnsTypeAssets + noOfHighVulnsTypeAssets + noOfMediumVulnsTypeAssets + noOfLowVulnsTypeAssets + noOfInfoVulnsTypeAssets;
    private String year;
    private String SCCName;
    private String SCCAddress;
    private String SCCSalesEmailId;

    public SummaryPage() {
    }

    public SummaryPage(String typesOfAssets, String numOfTypes) {
        this.typesOfAssets = typesOfAssets;
        this.numOfTypes = numOfTypes;
    }

    public String getEndClientName() {
        return endClientName;
    }

    public void setEndClientName(String endClientName) {
        this.endClientName = endClientName;
    }

    public String getTypesOfAssets() {
        return typesOfAssets;
    }

    public void setTypesOfAssets(String typesOfAssets) {
        this.typesOfAssets = typesOfAssets;
    }

    public String getNumOfTypes() {
        return numOfTypes;
    }

    public void setNumOfTypes(String numOfTypes) {
        this.numOfTypes = numOfTypes;
    }

    public int getNoOfCriticalVulnsTypeAssets() {
        return noOfCriticalVulnsTypeAssets;
    }

    public void setNoOfCriticalVulnsTypeAssets(int noOfCriticalVulnsTypeAssets) {
        this.noOfCriticalVulnsTypeAssets = noOfCriticalVulnsTypeAssets;
    }

    public int getNoOfHighVulnsTypeAssets() {
        return noOfHighVulnsTypeAssets;
    }

    public void setNoOfHighVulnsTypeAssets(int noOfHighVulnsTypeAssets) {
        this.noOfHighVulnsTypeAssets = noOfHighVulnsTypeAssets;
    }

    public int getNoOfMediumVulnsTypeAssets() {
        return noOfMediumVulnsTypeAssets;
    }

    public void setNoOfMediumVulnsTypeAssets(int noOfMediumVulnsTypeAssets) {
        this.noOfMediumVulnsTypeAssets = noOfMediumVulnsTypeAssets;
    }

    public int getNoOfLowVulnsTypeAssets() {
        return noOfLowVulnsTypeAssets;
    }

    public void setNoOfLowVulnsTypeAssets(int noOfLowVulnsTypeAssets) {
        this.noOfLowVulnsTypeAssets = noOfLowVulnsTypeAssets;
    }

    public int getNoOfInfoVulnsTypeAssets() {
        return noOfInfoVulnsTypeAssets;
    }

    public void setNoOfInfoVulnsTypeAssets(int noOfInfoVulnsTypeAssets) {
        this.noOfInfoVulnsTypeAssets = noOfInfoVulnsTypeAssets;
    }

    public int getNoOfTotalVulnsTypeAssets() {
        return noOfTotalVulnsTypeAssets;
    }

    public void setNoOfTotalVulnsTypeAssets(int noOfTotalVulnsTypeAssets) {
        this.noOfTotalVulnsTypeAssets = noOfTotalVulnsTypeAssets;
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
