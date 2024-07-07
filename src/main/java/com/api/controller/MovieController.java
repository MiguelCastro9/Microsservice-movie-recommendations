package com.api.controller;

import com.api.dto.response.MovieResponseDto;
import com.api.service.MovieService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("api/v1/")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<MovieResponseDto>> findAllMovies() {
        return new ResponseEntity<List<MovieResponseDto>>(
                movieService.findAllMovies().stream().map(movie
                        -> MovieResponseDto.convertEntityForMovieResponseDto(movie))
                        .collect(Collectors.toList()), HttpStatus.OK);
    }
}
