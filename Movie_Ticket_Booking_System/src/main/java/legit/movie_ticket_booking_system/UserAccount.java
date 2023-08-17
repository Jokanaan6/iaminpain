package legit.movie_ticket_booking_system;

import java.util.Objects;

public record UserAccount(String username, String password) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UserAccount) obj;
        return Objects.equals(this.username, that.username) &&
                Objects.equals(this.password, that.password);
    }

    @Override
    public String toString() {
        return "UserAccount[" +
                "username=" + username + ", " +
                "password=" + password + ']';
    }

}

