package jres.hundsun.server;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;

@CloudApplication
public class ClientApp {

	public static void main(String[] args) {
		CloudBootstrap.run(ClientApp.class , args);
		
	}
	
}
