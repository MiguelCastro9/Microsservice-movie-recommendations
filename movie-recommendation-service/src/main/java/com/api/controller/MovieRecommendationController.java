package com.api.controller;

import com.api.dto.response.MovieResponseDto;
import com.api.proxy.MovieProxy;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/api/v1")
public class MovieRecommendationController {

    @Autowired
    MovieProxy movieProxy;

    @GetMapping("/recommendations/{gender}")
    /**
     * @CircuitBreaker annotation so that in case of endpoint error it tries
     * again without throwing an exception, by default it tries the call 3 times
     * before throwing the exception, there are several customizations for this
     * type of situation, just check the documentation, this is very good for
     * management many requests in the endpoint.
     */
    @CircuitBreaker(name = "default", fallbackMethod = "messageFallback")
    public List<MovieResponseDto> getMovies(@PathVariable("gender") String gender) {

        List<MovieResponseDto> recommendations = movieProxy.getMovies().stream()
                .filter(movie -> movie.getGender().equalsIgnoreCase(gender))
                .collect(Collectors.toList());
        return recommendations;
    }

    public String messageFallback(Exception ex) {
        return "service currently unavailable!";
    }
}
