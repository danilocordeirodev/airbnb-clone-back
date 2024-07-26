package br.manedwolf.airbnbclone.listing.repository;

import br.manedwolf.airbnbclone.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
