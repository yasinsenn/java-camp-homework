package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

//		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
//		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanlityId()),
//				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanlityId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

}
