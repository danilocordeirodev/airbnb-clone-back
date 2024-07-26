package br.manedwolf.airbnbclone.listing.repository;

import br.manedwolf.airbnbclone.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
