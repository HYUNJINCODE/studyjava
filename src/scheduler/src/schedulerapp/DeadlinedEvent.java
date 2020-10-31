package schedulerapp;

public class DeadlinedEvent extends Event {
    public MyDate deadline;

    public DeadlinedEvent(String title, MyDate date) {
        super(title);
        this.title = title;
        this.deadline = date;
    }

    public String toString() {
        return title + ", " + deadline.toString();
    }

    public boolean isRelevant(MyDate date) {
        return deadline.compareTo(date) >=0;
    }

    @Override
    public MyDate getRepresentativeDate() {
        return deadline;
    }
}
