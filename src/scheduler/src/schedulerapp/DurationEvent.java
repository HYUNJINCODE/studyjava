package schedulerapp;

public class DurationEvent extends Event {
    public MyDate begin;
    public MyDate end;

    public DurationEvent( String title, MyDate b, MyDate e) {
        super(title);
        this.title = title;
        begin = b;
        end = e;
    }

    public String toString() {
        return  title + ", " + begin.toString()+ "~" + end.toString();
    }

    public boolean isRelevant(MyDate date) {
        //begin <= date <= end
        return begin.compareTo(date) <=0 && end.compareTo(date) >=0;
    }

    @Override
    public MyDate getRepresentativeDate() {
        return begin;
    }
}
