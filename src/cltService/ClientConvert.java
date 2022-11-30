package cltService;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import FxtopAPI.CurrencyDescription;
import FxtopAPI.FxtopServicesLocator;

public class ClientConvert {

	public static void main(String[] args) {
		
		try {
			CurrencyDescription service = new FxtopServicesLocator()
					.getFxtopServicesPort()
					.descCurrency("FR", "MAR");
			System.out.println("Pays: "+service.getCountryDescription());
			System.out.println("Description: "+service.getCurrencyLabel());
			System.out.println("ISOCode: "+service.getIsocode());
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
