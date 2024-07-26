package br.manedwolf.airbnbclone.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"br.manedwolf.airbnbclone.user.repository",
        "br.manedwolf.airbnbclone.listing.repository", "br.manedwolf.airbnbclone.booking.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
