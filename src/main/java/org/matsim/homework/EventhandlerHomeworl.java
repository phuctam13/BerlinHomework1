package org.matsim.homework;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;
import org.matsim.core.events.MatsimEventsReader;

import java.io.IOException;


public class EventhandlerHomeworl  {

    public static void main(String[] args) throws IOException {

        //String inputFile = "C:/Users/Thien/Desktop/uni/ss2020/matsim/output-berlin-v5.2-1pct_V4_150it_1_LANE-20200607T200846Z-001/output-berlin-v5.2-1pct_V4_150it_1_LANE/berlin-v5.2-1pct.output_events.xml.gz";
        String inputFile = "C:/Users/Thien/Desktop/uni/ss2020/matsim/berlin scenario/berlin-v5.2-1pct.output_events.xml.gz";

        EventsManager eventsManager = EventsUtils.createEventsManager();

        SimpleEventHandler eventHandler = new SimpleEventHandler();
        eventsManager.addHandler(eventHandler);

        MatsimEventsReader eventsReader = new MatsimEventsReader(eventsManager);
        eventsReader.readFile(inputFile);

        eventHandler.printVehicle();

        eventHandler.writeVehicleID();

    }
}
