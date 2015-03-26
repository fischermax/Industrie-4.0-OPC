package OPCTest.Reporting;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;


public class OPCListener implements UpdateListener {

	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		EventBean event = newEvents[0];
		System.out.println("avg=" + event.get("type.getValue()"));
		
	}
	
}
