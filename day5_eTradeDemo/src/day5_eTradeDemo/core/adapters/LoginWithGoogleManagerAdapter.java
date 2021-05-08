package day5_eTradeDemo.core.adapters;

import day5_eTradeDemo.loginWithGoogle.LoginWithGoogleManager;

public class LoginWithGoogleManagerAdapter implements LoginWithGoogleService {

	@Override
	public void logWithGoogle() {
		LoginWithGoogleManager loginWithGoogleManager = new LoginWithGoogleManager();
		loginWithGoogleManager.loginWithGoogle();

	}

}
