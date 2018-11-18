package romaniancoder.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Radison", 5000, 3));
        bookings.add(new HotelBooking("Regency", 2500, 4));
        bookings.add(new HotelBooking("Le Meridien", 4500, 1));

        bookingRepository.save(bookings);
    }
}
