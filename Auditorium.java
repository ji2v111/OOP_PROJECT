public class Auditorium {
    int TotalSeats;
    int SeatsOccupied;
    String EventName;
    String EventDate;
    String EventTime;

    Auditorium(int TotalSeats) {
        this.TotalSeats = TotalSeats;
    }

    void BookAuditorium(int SeatsOccupied, String EventName, String EventDate, String EventTime) {
        if (SeatsOccupied > TotalSeats) {
            System.out.println("The Auditorium seats not enough");
        }else{
            this.SeatsOccupied = SeatsOccupied;
            this.EventName = EventName;
            this.EventDate = EventDate;
            this.EventTime = EventTime;

        }


    }
    public void EventDetails() {
        System.out.println("Event Details");
        System.out.println("Name:  " + EventName);
        System.out.println("Date: " + EventDate);
        System.out.println("Time: " + EventTime);
        System.out.println("participants:  " + SeatsOccupied);
    }

    public void DisplaySeats() {
        System.out.println("Seats Status");
        System.out.println("Total Seats : " + TotalSeats);
        System.out.println("Seats Occupied: " + SeatsOccupied);
        System.out.println("Seats Available: " + (TotalSeats - SeatsOccupied));
    }


}
