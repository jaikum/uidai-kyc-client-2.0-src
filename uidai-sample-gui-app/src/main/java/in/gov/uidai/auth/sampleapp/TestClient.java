package in.gov.uidai.auth.sampleapp;

import java.net.URI;
import in.gov.uidai.auth.aua.helper.AuthRequestCreator;
import in.gov.uidai.auth.aua.helper.DigitalSigner;
import in.gov.uidai.auth.aua.httpclient.AuthClient;
import in.gov.uidai.auth.aua.httpclient.KYCClient;
import in.gov.uidai.auth.device.helper.AuthAUADataCreator;
import in.gov.uidai.auth.device.helper.Encrypter;
import in.gov.uidai.auth.device.helper.PidCreator;
import in.gov.uidai.auth.device.model.AuthDataFromDeviceToAUA;
import in.gov.uidai.auth.device.model.AuthResponseDetails;
import in.gov.uidai.auth.device.model.DeviceCollectedAuthData;
import in.gov.uidai.authentication.common.types._1.LocationType;
import in.gov.uidai.authentication.common.types._1.Meta;
import in.gov.uidai.authentication.uid_auth_request._1.Auth;
import in.gov.uidai.authentication.uid_auth_request._1.DataType;
import in.gov.uidai.authentication.uid_auth_request._1.Uses;
import in.gov.uidai.authentication.uid_auth_request._1.UsesFlag;
import in.gov.uidai.authentication.uid_auth_request_data._1.Gender;
import in.gov.uidai.authentication.uid_auth_request_data._1.MatchingStrategy;
import in.gov.uidai.authentication.uid_auth_response._1.AuthRes;
import in.gov.uidai.kyc.client.DataDecryptor;

public class TestClient {

	public static void main(String[] args) throws Exception {



		DeviceCollectedAuthData request = new DeviceCollectedAuthData();
		
		request.setNameMatchValue(100);

		//request.setFullAddress("12 Maulana Azad Mar,New Delhi,110002");
        request.setLocalFullAddress("");
        request.setFullAddress("");
		
		request.setUid("999999990019");
		request.setName("Shivshankar Choudhury");
		request.setGender(Gender.M.toString());
		request.setDob("1968-05-13");
		
		request.setStreet("12 Maulana Azad Marg");
		request.setState("New Delhi");
		request.setPinCode("110002");
		request.setAddressMatchStrategy(MatchingStrategy.E);
		
		
		
//		request.setUid("999999990042");
//		request.setName("Fatima Bedi");
//		request.setGender(Gender.F.toString());
		//request.setDob("1943-07-30");
//		building=IPP, IAP
//		landmark=Opp RSEB Window
//		street=5A Madhuban
//		locality=Veera Desai Road
//		vtc=Udaipur
//		district=Udaipur
//		state=Rajasthan
//		pincode=313001
		
		
		//request.setStreet("12 Maulana Azad Marg");
		//request.setState("New Delhi");
		//request.setPinCode("110002");
		
		//request.setAddressMatchStrategy(MatchingStrategy.P);
		
		//request.setLocalFullAddress("");
		
		Meta m = new Meta();
		m.setFdc("NC");
		m.setIdc("NA");
		m.setPip("127.0.0.1");
		m.setLot(LocationType.valueOf("P"));
		m.setLov("560103");
		m.setUdc("UKC:SampleClient");
		
		request.setDeviceMetaData(m);
		
		AuthDataFromDeviceToAUA auaData = null;
		
		AuthAUADataCreator auaDataCreator = new AuthAUADataCreator(new Encrypter(
				"./uidai_auth_stage.cer"),false);
		
		auaData = auaDataCreator.prepareAUAData(request.getUid(),
				"public",
				request.getDeviceMetaData(),
				(Object) PidCreator.createXmlPid(request), DataType.X);
		
		
		Uses usesElement = new Uses();
		usesElement.setPi(UsesFlag.valueOf("N"));
		usesElement.setPa(UsesFlag.valueOf("N"));
		usesElement.setPin(UsesFlag.valueOf("N"));
		usesElement.setOtp(UsesFlag.valueOf("N"));
		usesElement.setBio(UsesFlag.valueOf("N"));
		usesElement.setPfa(UsesFlag.valueOf("Y"));
		usesElement.setBt("");
		
		
		Auth auth = AuthRequestCreator.createAuthRequest(
				"public",
				"public",
				"MEaMX8fkRa6PqsqK6wGMrEXcXFl_oXHA-YuknI2uf0gKgZ80HaZgG3A", usesElement, null,
				auaData, request.getDeviceMetaData());
		
		DigitalSigner ds = new DigitalSigner("./Staging_Signature_PrivateKey.p12","public".toCharArray(),"public");
		DataDecryptor dd = new DataDecryptor("./Staging_Signature_PrivateKey.p12","public".toCharArray(),"./uidai_auth_stage.cer");
		
		KYCClient kycClient = new KYCClient( new URI("http://developer.uidai.gov.in/kyc/1.0"));
		
		kycClient.setDigitalSignator(ds);
		kycClient.setDataDecryptor(dd);
		kycClient.setVer("2.0");
		kycClient.setPfr("Y");
		kycClient.setAsaLicenseKey("MG41KIrkk5moCkcO8w-2fc01-P7I5S-6X2-X7luVcDgZyOa2LXs3ELI");
		kycClient.setMecLr(false,false);				
		kycClient.setDe(true);
//		String kycResponseXML = kycClient.kycTrans(auth,
//					"public",
//					true,
//					"MOVKOaZbZY1nao532lBQDd6q7Kci6wd_DGwRNMuDCIOS3sAo96OuYtI", usesElement,
//					"");
//		
//		System.err.print(kycResponseXML);
			
		AuthClient authClient = new AuthClient( new URI("http://auth.uidai.gov.in/1.6"));
		authClient.setAsaLicenseKey("MG41KIrkk5moCkcO8w-2fc01-P7I5S-6X2-X7luVcDgZyOa2LXs3ELI");
		authClient.setDigitalSignator(ds);
		
		AuthResponseDetails authRes = authClient.authenticate(auth);
		
		System.err.println("CODE --- " + authRes.getAuthRes().getCode());
		System.err.println("ERR --- " + authRes.getAuthRes().getErr());


	}

}
