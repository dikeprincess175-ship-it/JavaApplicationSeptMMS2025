
package chapter8;

public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        this.date = new Date(month, day, year);
        this.time = new Time2(hour, minute, second);
    }

    public DateAndTime() {
        this(1, 1, 2026, 0, 0, 0);
    }

    // Tick method: increments 1 second and advances date if midnight is passed
    public void tick() {
        int previousHour = time.getHour();
        time.tick();
        
        // If hours wrapped from 23 to 0, advance the day
        if (previousHour == 23 && time.getHour() == 0) {
            date.nextDay();
        }
    }

    // Increment minute by 1
    public void incrementMinute() {
        for (int i = 0; i < 60; i++) {
            tick();
        }
    }

    public void incrementHour() {
        for (int i = 0; i < 3600; i++) {
            tick();
        }
    }

    public String toUniversalString() {
        return String.format("%s %s", date.toString(), time.toUniversalString());
    }

    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}