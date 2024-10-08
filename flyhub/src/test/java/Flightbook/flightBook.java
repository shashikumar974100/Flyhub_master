package Flightbook;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FlightBook.FlightBookLib;
import Testcomponents.BaseTest;
import loginuat.LoginLibUat;

public class flightBook {

	public class LoginTest extends BaseTest {

		public WebDriver driver;
		private FlightBookLib FlightBookSource;

		@BeforeClass
		public void beforeClass() throws IOException, InterruptedException {
			driver = BaseTest.initializeDriver();
			FlightBookSource = new FlightBookLib(driver);

		}

		@BeforeMethod
		public void beforeMethod() throws Exception {
			LoginLibUat.driver = driver;
			LoginLibUat.navigateToAgentPortal("http://bd.uat.flyhub.com/login/");

		} 
		
		@AfterMethod
		public void afterMethod() throws Exception {
			LoginLibUat.driver = driver;
			LoginLibUat.navigateToAgentPortal("http://bd.uat.flyhub.com/login/");

		} 
		
		

/*		@Test
		public void verifyFlightBookingforoneadult() throws InterruptedException, AWTException
		{
		//	Thread.sleep(2000);
	        FlightBookSource.login();
	    
	      //  Thread.sleep(20000);
	       FlightBookSource.domesticOneWayBookAdult();               
	        
	        
	        FlightBookSource.viewFareorBookNow();
	        
	        FlightBookSource.bookingForOnewayagentportal ();
	       
	        
	     //  FlightBookSource.bookingConfirmationEmail();
	    
	    //   FlightBookSource.clearCache();   
	          
	     //   FlightBookSource.loginn();
	       
	    //   FlightBookSource.ticketedConfirmationEmail();  
	      
	    
			
		}   
		
	  @Test
		public void verifydomesticOneWayBookAdultandchild() throws Exception {
			
		   FlightBookSource.login();
			
			FlightBookSource.domesticOneWayBookAdultandchild();
			
			FlightBookSource. viewFareorBookNow();
			FlightBookSource.bookingfordomesticOneWayBookAdultandchild();
			
		//	FlightBookSource.bookingConfirmationEmail();
	        
		//	FlightBookSource.clearCache();
		    
		//	FlightBookSource.midOfficeTicketingFordomesticOneWayBookAdultandchild();
		
		 //   FlightBookSource.ticketedConfirmationEmail(); 
		    
		}  */
		
	 @Test
		public void VerifydomesticReturnBooktwoAdults() throws InterruptedException, AWTException {
			FlightBookSource.login();
//			Thread.sleep(35000);
			
			FlightBookSource.domesticReturnBooktwoAdults();
			Thread.sleep(5000);
			FlightBookSource. viewFareorBookNow();
			FlightBookSource.bookingdomesticReturnBooktwoAdults(); 
			
			
			
		//	FlightBookSource.bookingConfirmationEmail();
		//	Thread.sleep(5000);
		//	FlightBookSource.clearCache();
	    //    Thread.sleep(5000);
	   //   FlightBookSource.loginn();
	  //    Thread.sleep(5000);
	  //     FlightBookSource.ticketedConfirmationEmail();
	  //      Thread.sleep(5000);  
	        
			

		} 
	
	/*	@Test
	public void VerifyInternationalOnewayoneAdultoneChildoneInfant() throws InterruptedException
	{
			FlightBookSource.login();
		FlightBookSource.InternationalOnewayoneAdultoneChildoneInfant();
		Thread.sleep(5000);
		FlightBookSource. viewFareorBookNow();
		FlightBookSource.bookingInternationalOnewayoneAdultoneChildoneInfant();
	}  
		
		@Test
		public void VerifyInternationalReturnTwoAdultTwoChildOneInfant() throws InterruptedException
		{
				FlightBookSource.login();
				FlightBookSource.InternationalReturnTwoAdultTwoChildOneInfant();
				Thread.sleep(5000);
				FlightBookSource. viewFareorBookNow();
				Thread.sleep(5000);
				FlightBookSource.BookingforInternationalReturnTwoAdultTwoChildOneInfant();
		} 
		 
		@Test
		public void VerifymultiWayTwoAdults() throws InterruptedException
		{
				FlightBookSource.login();
				FlightBookSource.multiWayTwoAdults();
				Thread.sleep(5000);
				FlightBookSource. viewFareorBookNow();
				Thread.sleep(5000);
				FlightBookSource.bookingformultiWayTwoAdults();
		}  */
		
		
	} 
	}
	
	

