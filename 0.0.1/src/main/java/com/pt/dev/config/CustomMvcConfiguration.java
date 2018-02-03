package com.pt.dev.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.MediaType;

import com.pt.dev.domain.Movie;

public class CustomMvcConfiguration extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
      config.exposeIdsFor(Movie.class);
      config.setDefaultMediaType(MediaType.APPLICATION_JSON);
      config.useHalAsDefaultJsonMediaType(false);
    }
}
