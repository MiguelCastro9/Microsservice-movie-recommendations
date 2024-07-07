package com.api.service.impl;

import com.api.model.MovieModel;
import com.api.repository.MovieRepository;
import com.api.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class MovieServiceImpl implements MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieModel> findAllMovies() {
        return movieRepository.findAll();
    }
}
