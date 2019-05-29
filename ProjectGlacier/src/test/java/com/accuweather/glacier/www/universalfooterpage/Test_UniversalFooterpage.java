package com.accuweather.glacier.www.universalfooterpage;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.accuweather.glacier.www.AccuWeatherBaseTest;
import com.accuweather.glacier.www.pages.UniversalFooterPage;
import com.chameleon.selenium.web.WebPageLoaded;

public class Test_UniversalFooterpage extends AccuWeatherBaseTest {
		
	String landingPageURL;
	private static final String footerCompany="Company";
	private static final String footerProductsandServices="Products & Services";
	private static final String footerAppsandDownloads= "Apps & Download";
	private static final String footerSubscriptionServices="Subscription Services";
	  
	  
	private static final String superiorAccuracyAction = "Superior Accuracy in Action";
	private static final String aboutAccuweather="About AccuWeather";
	private static final String mediaKit="Media kit";
	private static final String carrers="Carrers";
	private static final String press="Press";
	private static final String coupons ="Coupons";
	private static final String contactus="Contact Us";
      
	private static final  String enterpriseSolutions="Enterprise Solutions";
	private static final  String d3dataDrivendecision ="D3 Data Driven Decisions";
	private static final  String accuweatherNetwork="AccuWeather Network";
	private static final  String storyTeller="Story Teller";
	private static final  String toolsBroadcast="Tools for Broadcast";
	private static final  String radioAndNewspaper="Radio and Newspaper";
	private static final  String accuWeatherapis="AccuWeather APIs";
	private static final  String accuWeatherstatus= "AccuWeather Status";
	private static final  String podcast= "Podcast";
	  
	private static final  String iphoneapp="iPhone App";
	private static final  String androidapp="Android App";
	private static final  String windowsapp ="Windows App";
	private static final  String appsanddownload="See all Apps & Downloads";
	  
	private static final  String accuWeatherpremium="AccuWeather Premium";
	private static final  String accuWeatherprofessional="AccuWeather Professional";
	  
	private static final  String iconDownload="Social icon download";
	private static final  String iconFacebook="Social icon facebook";
	private static final  String iconTwitter="Social icon twitter";
	private static final  String iconTV="Social icon tv";
	
	private UniversalFooterPage footerpage=new UniversalFooterPage();
	  
	private static final String expectedURL="https://development.accuweather.com/";
	private static final String expectedUrlforSuperioraAcuracy="https://corporate.accuweather.com/";
	private static final String expectedUrlforAboutAccuweather="https://corporate.accuweather.com/";
	private static final String expectedUrlforMediaKit="https://mediakit.accuweather.com/";
	private static final String expectedUrlforCarrers="https://careers.accuweather.com/";
	private static final String expectedUrlforPress="https://development.accuweather.com/en/press";
	private static final String expectedUrlforCoupons="https://www.accuweather.com/coupons";            //Landing for Production URL 
	private static final String expectedUrlforContactus="https://development.accuweather.com/en/contact";
	  
	  
	private static final String expectedUrlforEnterpriseSolutions="https://enterprisesolutions.accuweather.com/";
	private static final String expectedUrlforD3DataDrivenDecision="https://d3.accuweather.com/";
	private static final String expectedUrlforAccuweatherNetwork ="https://getaccuweather.tv/?utm_source=adc&utm_medium=icon&utm_campaign=footer";
	private static final String expectedUrlforStoryTeller ="https://storyteller.accuweather.com/";
	private static final String expectedUrlforBroadcast ="https://corporate.accuweather.com/broadcast";
	private static final String expectedUrlforRadio="https://corporate.accuweather.com/radio";
	private static final String expectedUrlforAccuweatherApis="https://developer.accuweather.com/";
	private static final String expectedUrlforAccuweatherStatus ="https://status.accuweather.com/";
	private static final String expectedUrlforPodcast="https://development.accuweather.com/podcast";
	  
	  
	private static final String expectedUrlforiphoneApp="https://itunes.apple.com/us/app/accuweather-weather-for-life/id300048137?mt=8";
	private static final String expectedUrlforAndroidApp="https://play.google.com/store/apps/details?id=com.accuweather.android";
	private static final String expectedUrlforWindowsApp="https://www.microsoft.com/en-us/p/accuweather-weather-for-life/9wzdncrfj1cf?activetab=pivot:overviewtab";
	private static final String expectedUrlforAppsandDownload="https://downloads.accuweather.com/?shortlink=aba0397&pid=accuweatherDADC&c=Downloads";
	 
	private static final String expectedUrlforAccuweatherPremium="https://wwwl.accuweather.com/premium_login.php";  
	private static final String expectedUrlforAccuweatherProfessional="https://wwwl.accuweather.com/pro_login.php";
	  
	private static final String expectedUrlforSocialiconDownload="https://downloads.accuweather.com/";
	private static final String expectedUrlforSocialiconFacebook="https://www.facebook.com/AccuWeather";
	private static final String expectedUrlforSocialiconTwitter="https://twitter.com/BreakingWeather";
	private static final String expectedUrlforSocialiconTV="https://getaccuweather.tv/?utm_source=adc&utm_medium=icon&utm_campaign=footer";
	  
	  
	  @Test(priority=1,enabled=true)
		public void TC1_validatingBaseFooterDisplayedforEnglish() {
			testStart("Navigating to  test application and validating whether Footer is Displayed for English");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.footerisDisplayed());		   		
		}
	  
	  @Test(priority=2,enabled=true)
		public void TC2_validatingBaseFooterhasCompanydisplayed() {
			testStart("Navigating to  test application and validating whether Base Footer has header Company Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.isbaseFooterContainsLink(footerCompany));		   		
		}
	  
	  @Test(priority=3,enabled=true)
		public void TC3_validatingBaseFooterhasProductandServicesDisplayed() {
			testStart("Navigating to test application and validating whether Base Footer has header Products & Services Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.isbaseFooterContainsLink(footerProductsandServices));			   		
		}
	  
	  @Test(priority=4,enabled=true)
		public void TC4_validatingBaseFooterhasAppsandDownloadsDisplayed()  {
			testStart("Navigating to test application and validating whether Base Footer has Apps & Downloads Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.isbaseFooterContainsLink(footerAppsandDownloads));			   		
		}
	  
	  @Test(priority=5,enabled=true)
		public void TC5_validatingBaseFooterhasSubscriptionServicesDisplayed() {
			testStart("Navigating to test application and validating whether Base Footer has Subscription Services Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.isbaseFooterContainsLink(footerSubscriptionServices));			   		
		}
	    
	  
	  @Test(priority=6,enabled=true)
		public void TC6_validatingCompanyFooterhasSuperiorAccuracyinActionlinkDisplayed(){
			testStart("Navigating to  test application and validating whether Company Footer has Superior Accuracy in Action link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(superiorAccuracyAction));	
	  }
	
	  @Test(priority=7,enabled=true)
		public void TC6_validatingCompanyFooterhasAboutAccuWeatherlinkDisplayed()  {
			testStart("Navigating to  test application and validating whether Company Footer has About AccuWeather link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(aboutAccuweather));	
	  }	  
	  
	  @Test(priority=8,enabled=true)
		public void TC6_validatingCompanyFooterhasMediakitlinkDisplayed()  {
			testStart("Navigating to  test application and validating whether Company Footer has Media kit link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(mediaKit));	
	  }
	  	  
	  @Test(priority=9,enabled=true)
		public void TC6_validatingCompanyFooterhasCarrerslinkDisplayed()  {
			testStart("Navigating to  test application and validating whether Company Footer has Carrers link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(carrers));	
	  }
	  
	  @Test(priority=10,enabled=true)
		public void TC6_validatingCompanyFooterhasPresslinkDisplayed()  {
			testStart("Navigating to  test application and validating whether Company Footer has Press link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			WebPageLoaded.isDomInteractive();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(press));	
	  }
	  
	  @Test(priority=11,enabled=true)
		public void TC6_validatingCompanyFooterhasCouponslinkDisplayed() {
			testStart("Navigating to  test application and validating whether Company Footer has Coupons link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(coupons));	
	  }
	  
	  @Test(priority=12,enabled=true)
		public void TC6_validatingCompanyFooterhasContactUslinkDisplayed()  {
			testStart("Navigating to  test application and validating whether Company Footer has Contact Us link Displayed");	
			WebPageLoaded.isDomInteractive();
			footerpage.scrolldownpage();
			Assert.assertTrue(footerpage.CompanyFooterContainsLink(contactus));	
	  }  
	  
	 @Test(priority=13,enabled=true)
	    public void TC7_validatingurlwhenclickedonSuperiorAccuracylink(){
		testStart("Navigating to test application and clicking on SuperiorAccuracyinAction");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();	
		footerpage.isclickedonfooterlink(superiorAccuracyAction);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals( landingPageURL, expectedUrlforSuperioraAcuracy);	    
		

	}
	
	@Test(priority=14,enabled=true)
	    public void TC8_validatingurlwhenclickedonAboutAccuweather() {
		testStart("Navigating to test application and clicking on About AccuWeather");
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(aboutAccuweather);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAboutAccuweather);			    
	}
	
	@Test(priority=15,enabled=true)
	public void TC9_validatingurlwhenclickedonMediakit() {
		testStart("Navigating to test application and clicking on Media kit");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(mediaKit);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforMediaKit);			  		
	}
	
	@Test(priority=16,enabled=true)
	    public void TC10_validatingurlwhenclickedonCarrers(){
		testStart("Navigating to test application and clicking on Carrers");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(carrers);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforCarrers);		 
	}
	
	@Test(priority=17,enabled=true)
	public void TC11_validatingurlwhenclickedonPress() {
		testStart("Navigating to  test application and clicking on Press");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(press);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforPress);		 		
	}
	
	@Test(priority=18,enabled=true)
	    public void TC12_validatingurlwhenclickedonCoupons()  {
		testStart("Navigating to  test application and clicking on Coupons");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(coupons);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforCoupons);	    		
	}
	
	@Test(priority=19,enabled=true)
	public void TC13_validatingurlwhenclickedonContactUs() {
		testStart("Navigating to  test application and clicking on Contact Us");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(contactus);
	    landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforContactus);					  		
	}
	
	@Test(priority=20,enabled=true)
	    public void TC14_validatingProductandServiceshasEnterpriseSolutionslinkDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has Enterprise Solutions link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(enterpriseSolutions));	
  }
	
	@Test(priority=21,enabled=true)
	public void TC14_validatingProductandServiceshasD3DataDrivenDecisionsDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has D3 Data Driven Decisions link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(d3dataDrivendecision));	
  }
	
	@Test(priority=22,enabled=true)
	    public void TC14_validatingProductandServiceshasAccuWeatherNetworkDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has AccuWeather Network link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(accuweatherNetwork));	
  }
	
	@Test(priority=23,enabled=true)
	public void TC14_validatingProductandServiceshasStoryTellerDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has Story Teller link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(storyTeller));	
  }
	@Test(priority=24,enabled=true)
	public void TC14_validatingProductandServiceshasToolsforBroadcastDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has Tools for Broadcast link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(toolsBroadcast));	
  }
	@Test(priority=25,enabled=true)
	    public void TC14_validatingProductandServiceshasRadioandNewspaperDisplayed(){
		testStart("Navigating to  test application and validating whether Company Footer has Radio and Newspaper link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(radioAndNewspaper));	
  }
	
	@Test(priority=26,enabled=true)
	public void TC14_validatingProductandServiceshasAccuWeatherAPIsDisplayed()  {
		testStart("Navigating to  test application and validating whether Company Footer has AccuWeather APIs link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(accuWeatherapis));	
  }
	
	@Test(priority=27,enabled=true)
	    public void TC14_validatingProductandServiceshasAccuWeatherStatusDisplayed()  {
		testStart("Navigating to  test application and validating whether Company Footer has AccuWeather Status link Displayed");	
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(accuWeatherstatus));	
  }
	
	@Test(priority=28,enabled=true)
	    public void TC14_validatingProductandServiceshasPodcastDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has Podcast link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.ProductandServicesContainsLink(podcast));	
  }
	
	
	@Test(priority=29,enabled=true)
	    public void TC15_validatingurlwhenclickedonEnterpriseSolutions(){
		testStart("Navigating to  test application and clicking on Enterprise Solutions");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(enterpriseSolutions);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforEnterpriseSolutions);					  		
	}
	
	@Test(priority=30,enabled=true)
	    public void TC16_validatingurlwhenclickedonD3DataDrivenDecisions() {
		testStart("Navigating to  test application and clicking on D3 Data Driven Decisions");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(d3dataDrivendecision);
		WebPageLoaded.isDomInteractive();
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforD3DataDrivenDecision);	
	}
	
	@Test(priority=31,enabled=true)
	    public void TC17_validatingurlwhenclickedonAccuWeatherNetwork(){
		testStart("Navigating to  test application and clicking on AccuWeather Network");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(accuweatherNetwork);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAccuweatherNetwork);	
	}

	@Test(priority=32,enabled=true)
	    public void TC18_validatingurlwhenclickedonStoryTeller() {
		testStart("Navigating to  test application and clicking on Story Teller");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(storyTeller);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforStoryTeller);	
	}

	@Test(priority=33,enabled=true)
	    public void TC19_validatingurlwhenclickedontoolsforbroadcast() {
		testStart("Navigating to  test application and clicking on tools for broadcast");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(toolsBroadcast);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforBroadcast);	
	}
	
	@Test(priority=34,enabled=true)
	    public void TC20_validatingurlwhenclickedonRadioandNewspaper() {
		testStart("Navigating to  test application and clicking on Radio and Newspaper");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(radioAndNewspaper);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforRadio);	
	}
	
	@Test(priority=35,enabled=true)
	    public void TC21_validatingurlwhenclickedonAccuWeatherAPIs() {
		testStart("Navigating to  test application and clicking on AccuWeather APIs");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(accuWeatherapis);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAccuweatherApis);	
	}
	
	@Test(priority=36,enabled=true)
	    public void TC22_validatingurlwhenclickedonAccuWeatherStatus() {
		testStart("Navigating to  test application and clicking on Weather Status");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(accuWeatherstatus);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAccuweatherStatus);	
	}
	
	@Test(priority=37,enabled=true)
	    public void TC23_validatingurlwhenclickedonPodcast() {
		testStart("Navigating to  test application and clicking on Podcast");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(podcast);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforPodcast);	
	}
	
	@Test(priority=38,enabled=true)
	    public void TC24_validatingAppsandDownloadhasiPhoneAppDisplayed(){
		testStart("Navigating to  test application and validating whether Apps & Download Footer has iPhoneApp link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.AppsandDownloadContainsLink(iphoneapp));	
  }
	
	@Test(priority=39,enabled=true)
	    public void TC24_validatingAppsandDownloadhasAndroidAppDisplayed() {
		testStart("Navigating to  test application and validating whether Apps & Download Footer has Android App link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.AppsandDownloadContainsLink(androidapp));	
  }
	
	@Test(priority=40,enabled=true)
	    public void TC24_validatingAppsandDownloadhasWindowsAppDisplayed() {
		testStart("Navigating to  test application and validating whether Apps & Download Footer has Windows App link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.AppsandDownloadContainsLink(windowsapp));	
  }

	@Test(priority=41,enabled=true)
	    public void TC24_validatingAppsandDownloadhasSeeallAppsandDownloadsDisplayed() {
		testStart("Navigating to  test application and validating whether Apps & Download Footer has See all Apps & Downloadslink Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.AppsandDownloadContainsLink(appsanddownload));	
  }
	
	@Test(priority=42,enabled=true)
	    public void TC25_validatingurlwhenclickedoniphoneapp() {
		testStart("Navigating to  test application and clicking on iphone app");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(iphoneapp);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforiphoneApp);	
	}
	
	@Test(priority=43,enabled=true)
	    public void TC26_validatingurlwhenclickedonandroidapp()  {
		testStart("Navigating to  test application and clicking on android app");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(androidapp);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAndroidApp);	
	}
	
	@Test(priority=44,enabled=true)
	    public void TC27_validatingurlwhenclickedonWindowsapp() {
		testStart("Navigating to  test application and clicking on Windows app");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomComplete(800000);
		footerpage.isclickedonfooterlink(windowsapp);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforWindowsApp);	
	}
	
	@Test(priority=45,enabled=true)
	    public void TC28_validatingurlwhenclickedonappsanddownload() {
		testStart("Navigating to  test application and clicking on apps and download");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(appsanddownload);
		WebPageLoaded.isDomInteractive();
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAppsandDownload);	
	}
	
	@Test(priority=46,enabled=true)
		public void TC29_validatingSubscriptionServiceshasAccuWeatherPremiumDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has AccuWeather Premium  link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SubscriptionServicesContainsLink(accuWeatherpremium));	
  }
	
	@Test(priority=47,enabled=true)
		public void TC29_validatingSubscriptionServiceshasAccuWeatherProfessionalDisplayed() {
		testStart("Navigating to  test application and validating whether Company Footer has AccuWeather Professional  link Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SubscriptionServicesContainsLink(accuWeatherprofessional));	
  }
		
	@Test(priority=48,enabled=true)
		public void TC30_validatingurlwhenclickedonaccuWeatherpremium() {
		testStart("Navigating to  test application and clicking on accuWeather premium");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(accuWeatherpremium);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAccuweatherPremium);	
	}
	
	@Test(priority=49,enabled=true)
		public void TC31_validatingurlwhenclickedonaccuWeatherprofessional() {
		testStart("Navigating to  test application and clicking on accuWeather professional");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(accuWeatherprofessional);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforAccuweatherProfessional);	
	}
	
	@Test(priority=50,enabled=true)
		public void TC32_validatingSocailmedialinkshasDownloadiconDisplayed()  {
		testStart("Navigating to  test application and validating whether Socail media links has Download icon Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SocailmedialinkContains(iconDownload));	
  }
	@Test(priority=51,enabled=true)
	public void TC32_validatingSocailmedialinkshasFacebookiconDisplayed()  {
		testStart("Navigating to  test application and validating whether Socail media links has facebook icon Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SocailmedialinkContains(iconFacebook));	
  }
	@Test(priority=52,enabled=true)
		public void TC32_validatingSocailmedialinkshasTwittericonDisplayed() {
		testStart("Navigating to  test application and validating whether Socail media links has twitter icon Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SocailmedialinkContains(iconTwitter));	
  }
	
	@Test(priority=53,enabled=true)
		public void TC32_validatingSocailmedialinkshasTVconDisplayed()  {
		testStart("Navigating to  test application and validating whether Socail media links has TV icon Displayed");	
		WebPageLoaded.isDomInteractive();
		footerpage.scrolldownpage();
		Assert.assertTrue(footerpage.SocailmedialinkContains(iconTV));	
  }

	@Test(priority=54,enabled=true)
		public void TC33_validatingurlwhenclickedoniconDownload()  {
		testStart("Navigating to  test application and clicking on icon download");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(iconDownload);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforSocialiconDownload);	
	}
	
	@Test(priority=55,enabled=true)
		public void TC34_validatingurlwhenclickedoniconFacebook()  {
		testStart("Navigating to  test application and clicking on icon facebook");	
		footerpage.scrolldownpage();
		footerpage.isclickedonfooterlink(iconFacebook);
		WebPageLoaded.isDomComplete(80000);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforSocialiconFacebook);	
	}
	
	@Test(priority=56,enabled=true)
		public void TC35_validatingurlwhenclickedoniconTwitter()  {
		testStart("Navigating to  test application and clicking on icon twitter");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(iconTwitter);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforSocialiconTwitter);	
	}
	
	@Test(priority=57,enabled=true)
		public void TC36_validatingurlwhenclickedoniconTV() {
		testStart("Navigating to  test application and clicking on icon TV");	
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();
		footerpage.isclickedonfooterlink(iconTV);
		landingPageURL=footerpage.getlandingurltitle();
		Assert.assertEquals(landingPageURL,expectedUrlforSocialiconTV);	
	}
	
	
	
	@Test(priority=58,enabled=true)
		public void TC37_validatingFootercrumpsdisplayedforotherlanguage() throws InterruptedException {
		testStart("Navigating to test application and verfiying Footer crumps displayed when changed the Language other than English");	
		footerpage.changeLanguagefromSettingsicon();
		footerpage.scrolldownpage();
		WebPageLoaded.isDomInteractive();		
		Assert.assertTrue(footerpage.footerbreadcrumpsDisplayed());
	
		
	}
}
