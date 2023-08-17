package legit.movie_ticket_booking_system;

import java.util.Objects;

public record BookingDetails(UserAccount user, String selectedDay, String selectedHour, String selectedMovie,
                             String selectedSeat, String selectedYear, String selectedMonth, int moviePrice) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BookingDetails) obj;
        return Objects.equals(this.user, that.user) &&
                Objects.equals(this.selectedDay, that.selectedDay) &&
                Objects.equals(this.selectedHour, that.selectedHour) &&
                Objects.equals(this.selectedMovie, that.selectedMovie) &&
                Objects.equals(this.selectedSeat, that.selectedSeat) &&
                Objects.equals(this.selectedYear, that.selectedYear) &&
                Objects.equals(this.selectedMonth, that.selectedMonth) &&
                this.moviePrice == that.moviePrice;
    }

    @Override
    public String toString() {
        return "BookingDetails[" +
                "user=" + user + ", " +
                "selectedDay=" + selectedDay + ", " +
                "selectedHour=" + selectedHour + ", " +
                "selectedMovie=" + selectedMovie + ", " +
                "selectedSeat=" + selectedSeat + ", " +
                "selectedYear=" + selectedYear + ", " +
                "selectedMonth=" + selectedMonth + ", " +
                "moviePrice=" + moviePrice + ']';
    }


}
