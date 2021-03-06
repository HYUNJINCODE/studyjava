package schedulerapp;

import java.time.Duration;
import java.util.*;

public class Scheduler {
    public ArrayList<Event> events = new ArrayList<>();
    //private int capacity = 10;
    //public Event[] events = new Event[10];
    //public int n = 0;
    //arraylist쓰면서 다필요없어짐
    private Scanner kb;

    public void processCommand() {
        kb = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
            String command = kb.next();
            if(command.equals("addevent")) {
                String type = kb.next();
                if(type.equalsIgnoreCase("oneday")){
                    handleAddOneDayEvent();
                }else if (type.equalsIgnoreCase("duration")){
                    handleAddDurationEvent();
                }else if (type.equalsIgnoreCase("deadline")){
                    handleAddDeadlinedEvent();
                }
            }
            else if(command.equals("list")) {
                handleList();
            }
            else if(command.equals("show")) {
                handleShow();
            }
            else if(command.equals("sort")) {
//                Arrays.sort(events,0,n);
                Collections.sort(events);
            }
            else if(command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private void handleShow() {
        String dateString = kb.next();
        MyDate theDate = parseDateString(dateString);
        for (int i = 0; i<events.size(); i++) {
            //test if events[i] is relevant to the date,then print it
            if(events.get(i).isRelevant(theDate))
                System.out.println(events.get(i).toString());
        }

    }

    public void handleAddOneDayEvent() {
        System.out.print("  when: ");
        String dateString = kb.next();
        String[] tokens = dateString.split("/");
        System.out.print("  title: ");
        String title = kb.next();
        MyDate date = parseDateString(dateString);
        OneDayEvent ev = new OneDayEvent(title, date);
        addEvent(ev);
    }
    public void handleAddDurationEvent() {

    }
    public void handleAddDeadlinedEvent() {

    }

    private MyDate parseDateString(String dateString) {
        String[] tokens = dateString.split("/");
        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        MyDate d = new MyDate(year, month, day);
        return d;
    }
    private void handleList() {
        for (int i = 0; i <events.size(); i++) {
            System.out.println("   " + events.get(i).toString());
        }
    }

    private void addEvent(OneDayEvent ev) {
//        if(n>=capacity) {
//            reallocate();
//        }
        events.add(ev);
    }

//    private void reallocate() {
//        Event[] tmp = new Event[capacity*2];
//        for(int i=0; i<n; i++) {
//            tmp[i] = events[i];
//        }
//        events = tmp;
//        capacity *=2;
//
//        //버려진 배열은 garbage c나c++에서는 내가처리해야하지만 java에서는 garbage collection (auto)
//    }

    public static void main(String[] args) {
        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
