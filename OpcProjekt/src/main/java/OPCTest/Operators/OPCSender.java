package OPCTest.Operators;

import java.util.Vector;

import OPCTest.Adapter.OPC;
import OPCTest.Config.SendConfig;

public class OPCSender {

	
	private SendConfig opcConfig1;
	private OPC opcAdapter;
	
	public OPCSender(String ServerUrl, Vector<String> dataItemsOne){
		SendConfig tmp = new SendConfig(ServerUrl, dataItemsOne);
		this.opcConfig1 = tmp;
		this.opcAdapter = new OPC(this.opcConfig1);
	}
	
	public void startOPCAdapter(){

		try {
			this.opcAdapter.importData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void stopOPCAdapter(){
		this.opcAdapter.disconnect();
	}
}
