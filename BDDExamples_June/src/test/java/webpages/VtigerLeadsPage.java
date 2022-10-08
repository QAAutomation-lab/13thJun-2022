package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerLeadsPage extends SeleniumUtility{
	WebDriver driver;
	public VtigerLeadsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addLead;
	
	@FindBy(xpath="//span[@id='select2-chosen-2']")
	private WebElement salotaionForLead;
	
	@FindBy(xpath="//div[@id='select2-drop']/ul/li[2]")
	private WebElement selectSalotationTypeForLead;
	
	@FindBy(id="Leads_editView_fieldName_firstname")
	private WebElement firstNameInputFieldForLead;
	
	@FindBy(id="Leads_editView_fieldName_lastname")
	private WebElement lastNameInputFieldForLead;
	
	@FindBy(id="Leads_editView_fieldName_phone")
	private WebElement contactNumberOfLead;
	
	@FindBy(css=".saveButton")
	private WebElement saveButtonForLead;
	
	@FindBy(css=".module-title")
	private WebElement leadHeaderLink;
	
	@FindBy(xpath="//a[contains(text(),'Champak')]")
	private WebElement newlyCreatedLeadName;
	
	@FindBy(xpath="//tr[td[span[span[a[contains(text(),'Champak')]]]]]/td[1]//input")
	private WebElement newlyCreatedLeadCheckBox;
	
	@FindBy(id="Leads_listView_massAction_LBL_DELETE")
	private WebElement deleteLeadLink;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	
	public void createNewLead(String fname,String lname,String number) {
		clickOnElement(addLead);
		clickOnElement(salotaionForLead);
		clickOnElement(selectSalotationTypeForLead);
		typeInput(firstNameInputFieldForLead, fname);
		typeInput(lastNameInputFieldForLead, lname);
		typeInput(contactNumberOfLead, number);
		clickOnElement(saveButtonForLead);
		clickOnElement(leadHeaderLink);
	}
	
	public void deleteCreatedLead() {
		clickOnElement(newlyCreatedLeadCheckBox);
		clickOnElement(deleteLeadLink);
		clickOnElement(yesButtonOnConfirmPopup);
	}
	
	public boolean checkLeadCreation() {
		return isElementExist(newlyCreatedLeadName);
	}
}
