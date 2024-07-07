package com.api.service;

import com.api.model.MovieModel;
import java.util.List;

/**
 *
 * @author Miguel Castro
 */
public interface MovieService {
    
    public List<MovieModel> listAllMovies();
}
