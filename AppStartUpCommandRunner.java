package com.capgemini.training.commandrunner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.capgemini.training.customer.entity.Address;
import com.capgemini.training.customer.entity.BackOrder;
import com.capgemini.training.customer.entity.Communication;
import com.capgemini.training.customer.entity.Customer;
import com.capgemini.training.customer.entity.Message;
import com.capgemini.training.customer.entity.News;
import com.capgemini.training.customer.entity.None;
import com.capgemini.training.customer.entity.Permission;
import com.capgemini.training.customer.entity.Success;
import com.capgemini.training.customer.entity.Survey;
import com.capgemini.training.service.AddressService;
import com.capgemini.training.service.BackOrderService;
import com.capgemini.training.service.CommunicationService;
import com.capgemini.training.service.CustomerService;
import com.capgemini.training.service.MessageService;
import com.capgemini.training.service.NewsService;
import com.capgemini.training.service.NoneService;
import com.capgemini.training.service.PermissionService;
import com.capgemini.training.service.SuccessService;
import com.capgemini.training.service.SurveyService;


@Component
public class AppStartUpCommandRunner implements CommandLineRunner {

	@Autowired
	CustomerService customerService;

	@Autowired
	AddressService addressService;

	@Autowired
	CommunicationService communicationService;
	
	@Autowired
	MessageService msgService;
	
	@Autowired
	SuccessService successService;
	
	@Autowired
	SurveyService surveyService;
	
	@Autowired
	PermissionService permissionService;
	
	@Autowired
	NoneService noneService;
	
	@Autowired
	NewsService newsService;
	
	@Autowired
	BackOrderService backOrderService;
	

	@Override
	public void run(String... args) throws Exception {
	
		List<None> noneList=new ArrayList<>();

		None none1=new None();
		none1.setCommunicationChannel("EMAIL");
		none1.setPermissionCaptureMethod("ARV-WS");
		none1.setSourceSystem("ARV-WS");
		none1.setPermissionDate("2018-10-10 22:46:59");
		none1.setCreationDate("2018-10-10 22:46:59");
		none1.setPermissionStaus("1");
		
		None none2=new None();
		none2.setCommunicationChannel("SMS");
		none2.setPermissionCaptureMethod("ARV-WS");
		none2.setSourceSystem("ARV-WS");
		none2.setPermissionDate("2018-10-10 22:46:59");
		none2.setCreationDate("2018-10-10 22:46:59");
		none2.setPermissionStaus("1");
		
		noneList.add(none1);
		noneList.add(none2);
		
		noneService.save(none1);
		noneService.save(none2);
		
		List<Survey> surveyList=new ArrayList<>();
		
		Survey survey1=new Survey();
		survey1.setCommunicationChannel("EMAIL");
		survey1.setPermissionCaptureMethod("ARV-WS");
		survey1.setSourceSystem("ARV-WS");
		survey1.setPermissionDate("2018-10-10 22:46:59");
		survey1.setCreationDate("2018-10-10 22:46:59");
		survey1.setPermissionStaus("1");
		
		Survey survey2=new Survey();
		survey2.setCommunicationChannel("SMS");
		survey2.setPermissionCaptureMethod("ARV-WS");
		survey2.setSourceSystem("ARV-WS");
		survey2.setPermissionDate("2018-10-10 22:46:59");
		survey2.setCreationDate("2018-10-10 22:46:59");
		survey2.setPermissionStaus("1");
		
		Survey survey3=new Survey();
		survey3.setCommunicationChannel("MAIL");
		survey3.setPermissionCaptureMethod("ARV-WS");
		survey3.setSourceSystem("ARV-WS");
		survey3.setPermissionDate("2018-10-10 22:46:59");
		survey3.setCreationDate("2018-10-10 22:46:59");
		survey3.setPermissionStaus("1");
		
		surveyList.add(survey1);
		surveyList.add(survey2);
		surveyList.add(survey3);
		
		surveyService.save(survey1);
		surveyService.save(survey2);
		surveyService.save(survey3);
		
		List<BackOrder> backOrderList=new ArrayList<>();
		
		BackOrder backOrder1=new BackOrder();
		backOrder1.setCommunicationChannel("EMAIL");
		backOrder1.setPermissionCaptureMethod("ARV-WS");
		backOrder1.setSourceSystem("ARV-WS");
		backOrder1.setPermissionDate("2018-10-10 22:46:59");
		backOrder1.setCreationDate("2018-10-10 22:46:59");
		backOrder1.setPermissionStaus("1");
		
		BackOrder backOrder2=new BackOrder();
		backOrder2.setCommunicationChannel("SMS");
		backOrder2.setPermissionCaptureMethod("ARV-WS");
		backOrder2.setSourceSystem("ARV-WS");
		backOrder2.setPermissionDate("2018-10-10 22:46:59");
		backOrder2.setCreationDate("2018-10-10 22:46:59");
		backOrder2.setPermissionStaus("1");
		
		BackOrder backOrder3=new BackOrder();
		backOrder3.setCommunicationChannel("MAIL");
		backOrder3.setPermissionCaptureMethod("ARV-WS");
		backOrder3.setSourceSystem("ARV-WS");
		backOrder3.setPermissionDate("2018-10-10 22:46:59");
		backOrder3.setCreationDate("2018-10-10 22:46:59");
		backOrder3.setPermissionStaus("1");
		
		backOrderList.add(backOrder1);
		backOrderList.add(backOrder2);
		backOrderList.add(backOrder3);
		
		backOrderService.save(backOrder1);
		backOrderService.save(backOrder2);
		backOrderService.save(backOrder3);
		
		ArrayList<News> newsList=new ArrayList<>();
		
		News news1=new News();
		news1.setCommunicationChannel("EMAIL");
		news1.setPermissionCaptureMethod("ARV-WS");
		news1.setSourceSystem("ARV-WS");
		news1.setPermissionDate("2018-10-10 22:46:59");
		news1.setCreationDate("2018-10-10 22:46:59");
		news1.setPermissionStaus("1");
		
		News news2=new News();
		news2.setCommunicationChannel("SMS");
		news2.setPermissionCaptureMethod("ARV-WS");
		news2.setSourceSystem("ARV-WS");
		news2.setPermissionDate("2018-10-10 22:46:59");
		news2.setCreationDate("2018-10-10 22:46:59");
		news2.setPermissionStaus("1");
		
		News news3=new News();
		news3.setCommunicationChannel("MAIL");
		news3.setPermissionCaptureMethod("ARV-WS");
		news3.setSourceSystem("ARV-WS");
		news3.setPermissionDate("2018-10-10 22:46:59");
		news3.setCreationDate("2018-10-10 22:46:59");
		news3.setPermissionStaus("1");
		
	
		
		newsService.save(news1);
		newsService.save(news2);
		newsService.save(news3);
		newsList.add(news1);
		newsList.add(news2);
		newsList.add(news3);
		
		Permission permission=new Permission();
		permission.setBackorder(backOrderList);
		permission.setNews(newsList);
		permission.setNone(noneList);
		permission.setSurvey(surveyList);
		
		permissionService.save(permission);

		
		Communication communicationChannel=new Communication();
		
		communicationChannel.setPermission(permission);
		communicationChannel.setEmail("vkorneichik1234@lyonscg.com");
		communicationChannel.setCustomerId("1");
		
		communicationService.save(communicationChannel);

		Success success = new Success();
		success.setCode("2009");
		success.setMessage("Address ID 3 found");
		successService.save(success);
		Message msg = new Message();
		msg.setError("error");
		msg.setSuccess(success);
		msgService.save(msg);
		Address a1 = new Address();
		a1.setCity("Sussex");
		a1.setCountryId("DE");
		a1.setEntityId("3");
		a1.setStreet("N75W23133 N Ridgeview Cir");
		a1.setFirstname("John");
		a1.setIsDefaultBilling("1");
		a1.setIsDefaultShipping("1");
		a1.setLastname("Doe");
		a1.setMessages(msg);
		a1.setMissingVerification("missing");
		a1.setPostcode("53089");
		a1.setPrefix("Herr");
		a1.setTelephone("1512345678");
		
		Success success1 = new Success();
		success1.setCode("2009");
		success1.setMessage("Address ID 3 found");
		successService.save(success);
		Message msg1 = new Message();
		msg1.setError("error");
		msg1.setSuccess(success);
		msgService.save(msg);
		Address a11 = new Address();
		a11.setCity("Sussex");
		a11.setCountryId("DE");
		a11.setEntityId("3");
		a11.setStreet("N75W23133 N Ridgeview Cir");
		a11.setFirstname("John");
		a11.setIsDefaultBilling("1");
		a11.setIsDefaultShipping("1");
		a11.setLastname("doe");
		a11.setMessages(msg);
		a11.setMissingVerification("missing");
		a11.setPostcode("53089");
		a11.setPrefix("Herr");
		a11.setTelephone("1512345678");
		addressService.save(a1);
		addressService.save(a11);

		
		Customer c1 = new Customer();
		List<Address> list=new ArrayList<>();
		list.add(a1);
		c1.setAddress(a1);
		c1.setCommunication(communicationChannel);
		c1.setCountryCode("DE");
		c1.setCreatedAt("2018-09-26T15:39:48+01:00");
		c1.setCreatedFrom("German Vie");
		c1.setCustomerlandline("");
		c1.setCustomermobile("1512345678");
		c1.setDataPrivacy("1");
		c1.setDob("");
		c1.setEmail("john@gmail.com");
		c1.setEntityId("3");
		c1.setExemptedFromPayingCopayment("");
		c1.setFirstname("John");
		c1.setFiscalCode("");
		c1.setGhost_account_id("");
		c1.setGroupId("1");
		c1.setIsEmailVerified("true");
		//c1.setId(1L);
		c1.setInsuranceNumber("Y979287991");
		c1.setInvitedCustomerStatus("0");
		c1.setInvitedCustomerStatusDate("2018-09-26 16:39:48");
		c1.setIsActive("1");
		c1.setIsOffLine("0");
		c1.setIsSubscribedForVatReduction("");
		c1.setLanguageCode("de");
		c1.setLastname("Doe");
		c1.setMeasurement("99");
		c1.setMessage(msg);
		c1.setPayerInstitution("payer");
		c1.setPrefix("Herr");
		c1.setPrepaymentChoice("2");
		c1.setPrivacyConsent("0");
		c1.setPrivacySurvey("0");
		c1.setPayerInstitution("421");
		c1.setSamplingProgramCode("");
		c1.setSignatureCaptured("0");
		c1.setTermsAndConditionAgreed("1");
		c1.setUpdatedAt("2018-10-10 20:51:23");
		c1.setUpdatedSource("ARV-WS");
		c1.setUnder18("");
		c1.setVatReductionEndDate("");
		c1.setVatReductionStartDate("");
		customerService.save(c1);
		

		Customer c2 = new Customer();
		List<Address> list11=new ArrayList<>();
		list11.add(a11);
		c2.setAddress(a11);
		c2.setCommunication(communicationChannel);
		c2.setCountryCode("DE");
		c2.setCreatedAt("2018-09-26T15:39:48+01:00");
		c2.setCreatedFrom("German Vie");
		c2.setCustomerlandline("");
		c2.setCustomermobile("1512345678");
		c2.setDataPrivacy("1");
		c2.setDob("");
		c2.setEmail("john@gmail.com");
		c2.setEntityId("3");
		c2.setExemptedFromPayingCopayment("");
		c2.setFirstname("John");
		c2.setFiscalCode("");
		c2.setGhost_account_id("");
		c2.setGroupId("1");
		c2.setIsEmailVerified("true");
		//c1.setId(1L);
		c2.setInsuranceNumber("Y979287991");
		c2.setInvitedCustomerStatus("0");
		c2.setInvitedCustomerStatusDate("2018-09-26 16:39:48");
		c2.setIsActive("1");
		c2.setIsOffLine("0");
		c2.setIsSubscribedForVatReduction("");
		c2.setLanguageCode("de");
		c2.setLastname("Doe");
		c2.setMeasurement("99");
		c2.setMessage(msg);
		c2.setPayerInstitution("payer");
		c2.setPrefix("Herr");
		c2.setPrepaymentChoice("2");
		c2.setPrivacyConsent("0");
		c2.setPrivacySurvey("0");
		c2.setPayerInstitution("421");
		c2.setSamplingProgramCode("");
		c2.setSignatureCaptured("0");
		c2.setTermsAndConditionAgreed("1");
		c2.setUpdatedAt("2018-10-10 20:51:23");
		c2.setUpdatedSource("ARV-WS");
		c2.setUnder18("");
		c2.setVatReductionEndDate("");
		c2.setVatReductionStartDate("");
		customerService.save(c1);
		customerService.save(c2);
	}

}
