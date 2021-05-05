package adapters;

import java.rmi.RemoteException;

import abstracts.PlayerCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {

//		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
//		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanlityId()),
//				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(player.getNatioanaltiyId()), player.getFirstName(),
					player.getLastName(), player.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

}
