package UI.Ebay.StepDefinitions;

import UI.Ebay.Utilities.excel.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    private ExcelUtil excelUtil;
    @And("I load the Excel file {string}")
    public void iLoadTheExcelFile(String arg0) {
        String filePath = "C:/Users/YourName/Desktop/Test.xlsx"; // Update to the correct path
        excelUtil = new ExcelUtil(filePath, arg0);
    }

    @When("I perform the test using data {string} and {string}")
    public void iPerformTheTestUsingDataAnd(String arg0, String arg1) {
        String cellData = excelUtil.getCellData(1, 2);
        System.out.println("Data from Excel: " + cellData);
    }

    @Then("I validate the result")
    public void iValidateTheResult() {
    }

}
