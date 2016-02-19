package main.java.com.mamallan.gwtapp.client;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloWorldGWT implements EntryPoint {

	public void onModuleLoad() {
		HelloServiceAsync rpcService = GWT.create(HelloService.class);
	    HandlerManager eventBus = new HandlerManager(null);
	    AppController appViewer = new AppController(rpcService, eventBus);
	    appViewer.go(RootPanel.get("bodyContainer"));
	    System.out.println("PASSWORD is:"+ md5("koala"));
	}
	
	
	
	public static String md5(String plaintext){

		String hashtext = null;
		
		try {
			
			MessageDigest m = MessageDigest.getInstance("MD5");
			
			m.reset();
			m.update(plaintext.getBytes("UTF-8"));

			byte[] digest = m.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			
			hashtext = bigInt.toString(16);
			// Now we need to zero pad it if you actually want the full 32 chars.
			while(hashtext.length() < 32 ){
				hashtext = "0"+hashtext;
			}
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return hashtext;

	}

}
