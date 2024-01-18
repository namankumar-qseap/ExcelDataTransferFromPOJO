import DTO.CoverPage;
import DTO.SummaryPage;
import DTO.VulnerabilityAssessment;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\qSEAp\\Documents\\Report\\VA-Report-Teamplatev1.4.xlsx";
        FileInputStream fis = new FileInputStream(inputFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet coverPage = workbook.getSheetAt(0);
        Sheet summaryPage = workbook.getSheetAt(1);
        Sheet vulnerabilityAssessment = workbook.getSheetAt(2);

        writeInCoverPage(coverPage);

        writeInSummaryPage(summaryPage);
        List<SummaryPage> tableList = new ArrayList<>();
        writeInSummaryPage(summaryPage, tableList);

        List<VulnerabilityAssessment> va = new ArrayList<>();
        writeInVulnerabilityAssessment(vulnerabilityAssessment, va);

        String outputFilePath = "C:\\Users\\qSEAp\\Documents\\Report\\Updated-VA-Report-Teamplatev1.4.xlsx";
        FileOutputStream fos = new FileOutputStream(outputFilePath);
        workbook.write(fos);

        fos.close();
        fis.close();
        workbook.close();
    }

    public static void writeInCoverPage(Sheet coverPage){
        CoverPage page = new CoverPage();
        page.setSecurityConsultant("Mourya");
        page.setClientLogo("Logo.png");
        page.setEndClientName("ICICI Bank");
        page.setReportId("ICIC00009");
        page.setScopeOfScan(Arrays.asList("Scope1", "Scope2", "Scope3"));
        page.setCreationDate("12-12-2023");
        page.setSecurityAuthorName("Mourya");
        page.setYear("2023-24");
        page.setSCCName("Mourya");
        page.setSCCAddress("Ghansholi");
        page.setSCCSalesEmailId("mourya@qseap.com");

        Map<String, Object> dynamicMap = new LinkedHashMap<>();
        dynamicMap.put("<Dynamic-0>", page.getSecurityConsultant());
        dynamicMap.put("<Dynamic-1>", page.getClientLogo());
        dynamicMap.put("<Dynamic-2>", page.getEndClientName());
        dynamicMap.put("<Dynamic-001>", page.getReportId());
        dynamicMap.put("<Dynamic-3>", page.getEndClientName());
        dynamicMap.put("<Dynamic-201>", page.getScopeOfScan());
        dynamicMap.put("<Dynamic-4>", page.getCreationDate());
        dynamicMap.put("<Dynamic-5>", page.getSecurityAuthorName());
        dynamicMap.put("<Dynamic-6>", page.getYear());
        dynamicMap.put("<Dynamic-7>", page.getSCCName());
        dynamicMap.put("<Dynamic-8>", page.getSCCAddress());
        dynamicMap.put("<Dynamic-9>", page.getSCCSalesEmailId());

        //Replace logic
        for (Row row : coverPage) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    String cellValue = cell.getStringCellValue();
                    for (Map.Entry<String, Object> entry : dynamicMap.entrySet()) {
                        cellValue = cellValue.replace(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    cell.setCellValue(cellValue);
                }
            }
        }
    }

    public static void writeInSummaryPage(Sheet summaryPage){
        SummaryPage sp = new SummaryPage();
        sp.setEndClientName("Axis Bank");
        sp.setYear("2024");
        sp.setSCCName("qSEAp");
        sp.setSCCAddress("MBP, Ghansholi ");
        sp.setSCCSalesEmailId("qseap.sales@qseap.com");

        Map<String, String> dynamicMap = new LinkedHashMap<>();
        dynamicMap.put("<Dynamic-10>", sp.getEndClientName());
        dynamicMap.put("<Dynamic-6>", sp.getYear());
        dynamicMap.put("<Dynamic-7>", sp.getSCCName());
        dynamicMap.put("<Dynamic-8>", sp.getSCCAddress());
        dynamicMap.put("<Dynamic-9>", sp.getSCCSalesEmailId());

        //Replace logic
        for (Row row : summaryPage) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    String cellValue = cell.getStringCellValue();
                    for (Map.Entry<String, String> entry : dynamicMap.entrySet()) {
                        cellValue = cellValue.replace(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    cell.setCellValue(cellValue);
                }
            }
        }
    }

    public static void writeInSummaryPage(Sheet summaryPage, List<SummaryPage> tableList){

        int targetRow = 19; // Assuming the table starts from the second row (adjust as needed)
        int targetColumnC = 2;   // Assuming you want to add rows to the second column (adjust as needed)
        int targetColumnD = 3;

        tableList.add(new SummaryPage("4","18"));
        tableList.add(new SummaryPage("17","11"));
        tableList.add(new SummaryPage("8","18"));
        tableList.add(new SummaryPage("21","7"));
        tableList.add(new SummaryPage("12","7"));
        tableList.add(new SummaryPage("17","7"));
        tableList.add(new SummaryPage("19","7"));

        for (int i = 0; i < tableList.size(); i++) {
            SummaryPage data = tableList.get(i);

            // Access the current row or create a new row if it doesn't exist
            Row row = summaryPage.getRow(targetRow + i);
            if (row == null) {
                row = summaryPage.createRow(targetRow + i);
            }

            // Insert data into Column C
            Cell cellC = row.createCell(targetColumnC);
            cellC.setCellValue(data.getTypesOfAssets());

            // Insert data into Column D
            Cell cellD = row.createCell(targetColumnD);
            cellD.setCellValue(data.getNumOfTypes());
        }
    }

    public static void writeInVulnerabilityAssessment(Sheet vulnerabilityAssessment, List<VulnerabilityAssessment> va){

        va.add(new VulnerabilityAssessment("101", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("102", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("103", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("104", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("105", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("106", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("107", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("108", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("109", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("110", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));
        va.add(new VulnerabilityAssessment("111", "1212", "Low", "12;12;21;/13", "221123", "231", "Axis Blackbox", "9182jns", "isdiasm akjsd kj", "Delete it", "Why This?", "zero", "1st April"));


        //Write data into file
        for (int i = 0; i < va.size(); i++) {
            Row dataRow = vulnerabilityAssessment.createRow(i + 1); // Starting from row 2

            VulnerabilityAssessment data = va.get(i);
            dataRow.createCell(0).setCellValue(data.getSrNo());
            dataRow.createCell(1).setCellValue(data.getCve());
            dataRow.createCell(2).setCellValue(data.getRisk());
            dataRow.createCell(3).setCellValue(data.getHost());
            dataRow.createCell(4).setCellValue(data.getProtocol());
            dataRow.createCell(5).setCellValue(data.getPort());
            dataRow.createCell(6).setCellValue(data.getVulnerabilityName());
            dataRow.createCell(7).setCellValue(data.getSynopsis());
            dataRow.createCell(8).setCellValue(data.getDescription());
            dataRow.createCell(9).setCellValue(data.getSolution());
            dataRow.createCell(10).setCellValue(data.getSeeAlso());
            dataRow.createCell(11).setCellValue(data.getPluginOutput());
            dataRow.createCell(12).setCellValue(data.getIdentifiedOnDate());
        }

    }

}
