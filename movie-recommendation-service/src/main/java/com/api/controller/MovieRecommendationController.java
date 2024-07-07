package com.api.controller;

import com.api.dto.response.MovieResponseDto;
import com.api.proxy.MovieProxy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/recommendations")
    public List<MovieResponseDto> getMovies() {

        List<MovieResponseDto> recommendations = movieProxy.getMovies();
        return recommendations;
    }
}
