package schedulerapp;

public abstract class Event {
    String title;

    public Event(String title) {
        this.title = title;
    }

    public abstract boolean isRelevant(MyDate date);

}
