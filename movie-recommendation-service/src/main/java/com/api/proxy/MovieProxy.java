package com.api.proxy;

import com.api.dto.response.MovieResponseDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Miguel Castro
 */
@FeignClient(name = "movie-data-service", url = "http://localhost:8080")
public interface MovieProxy {
    
    @GetMapping("/api/v1/movies")
    public List<MovieResponseDto> getMovies();
}
