package schedulerapp;

public class OneDayEvent extends Event {
    public MyDate date;

    public OneDayEvent(String title, MyDate date) {
        super(title);
        this.title = title;
        this.date = date;
    }

    public String toString() {
        return title + ", " + date.toString();
    }

    public boolean isRelevant(MyDate date) {
        if(this.date.compareTo(date) == 0)
            return true;
        return false;
    }
}
