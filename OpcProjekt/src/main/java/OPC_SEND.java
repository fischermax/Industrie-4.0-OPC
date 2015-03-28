import java.util.Vector;

import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.core.Identifiers;

import OPCTest.Adapter.OPC;
import OPCTest.Config.MainConfig;
import OPCTest.Config.SendConfig;


public class OPC_SEND {

	//Demo -> erzeuge Config, �bergebe an Adapter, erstelle DataItems(Types)

	public static void main(String[] args) {
		
		//Erzeuge Config
		Vector<String> dataItemsOne = new Vector<String>();
		dataItemsOne.add("5;Counter1");
		dataItemsOne.add("5;Expression1");
		
		SendConfig opcConfig1 = new SendConfig("opc.tcp://localhost:53530/OPCUA/SimulationServer", dataItemsOne);
		
		//�bergebe Config an Adapter
		OPC opcAdapter1 = new OPC(opcConfig1);
		try {
			opcAdapter1.importData();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
