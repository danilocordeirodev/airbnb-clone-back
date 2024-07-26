package br.manedwolf.airbnbclone.booking.repository;

import br.manedwolf.airbnbclone.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
