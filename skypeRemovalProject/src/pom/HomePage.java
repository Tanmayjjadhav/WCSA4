package pom;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import ganeric.WorkLib;

public class HomePage {

	
	@FindBy(xpath = "//div[text()='People, groups, messages']") private WebElement searchBox;
	@FindBy(xpath = "//button[@aria-label='Groups']") private WebElement gruopsButton;
	@FindBy(xpath = "//input[@placeholder='Search Groups']") private WebElement searchGroupsTB;
	@FindBy(xpath="//button[contains(@title,'participants')]") private WebElement participantsButton;
	@FindBy(xpath = "(//button[@role='checkbox' and (@aria-label='Share group via link')])[1]") private WebElement SharegroupLink ;
	@FindBy(xpath = "//div[@data-text-as-pseudo-element='Remove']") private WebElement removeButton;
	
	@FindBy(xpath = "//button[@aria-label='Show more']") private WebElement showMoreLink;
    @FindBy(xpath = "//div[@role='group' and (@tabindex='0')]") private List<WebElement> listOfMembers;
	
	
    @FindBy(xpath = "//button[@aria-label='Remove']") private WebElement remove2;
    
    @FindBy(xpath = "//div[@data-text-as-pseudo-element='Leave']") private WebElement leaveButton;
    @FindBy(xpath = "//button[@title='Close search']") private WebElement close;


	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}




	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getGruopsButton() {
		return gruopsButton;
	}


	public WebElement getParticipantsButton() {
		return participantsButton;
	}


	public WebElement getSharegroupLink() {
		return SharegroupLink;
	}


	public WebElement getRemoveButton() {
		return removeButton;
	}


	public WebElement getShowMoreLink() {
		return showMoreLink;
	}


	public WebElement getSearchGroupsTB() {
		return searchGroupsTB;
	}
	

	public List<WebElement> getListOfMembers() {
		return listOfMembers;
	}


	public WebElement getRemove2() {
		return remove2;
	}


	
	public WebElement getLeaveButton() {
		return leaveButton;
	}




	public WebElement getClose() {
		return close;
	}




	public void searchGroup(String groupName) throws InterruptedException, AWTException
	{
		WorkLib wb = new WorkLib();
		Thread.sleep(2000);
		searchBox.click();
		Thread.sleep(4000);
		gruopsButton.click();
		Thread.sleep(4000);
		wb.activeEle(groupName);
		Thread.sleep(4000);
		wb.hitEnter();
		Thread.sleep(4000);
		wb.hitEnter();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(4000);
	    participantsButton.click();
	   Thread.sleep(4000);
		SharegroupLink.click();
		Thread.sleep(4000);
		showMoreLink.click();
		
	
	


	}


           public void removeParticipants() throws InterruptedException, AWTException
           {
        	   
        	
        		WorkLib wb = new WorkLib();
        	   for( WebElement lm :listOfMembers)
        	   {
        		   Thread.sleep(2000);
        		   wb.mouseHover(lm);
        		   Thread.sleep(2000);
        	
        		   removeButton.click();
        		   Thread.sleep(2000);
        		   remove2.click();
        		   Thread.sleep(2000);
        	   
        	   }
        	   leaveButton.click();
        	   Thread.sleep(2000);
        	   wb.hitEnter();
           }

}