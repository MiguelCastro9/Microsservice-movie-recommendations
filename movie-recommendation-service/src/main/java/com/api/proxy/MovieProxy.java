package com.api.proxy;

import com.api.dto.response.MovieResponseDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Miguel Castro
 */
/**
 * using the eureka server, basically each instance that goes up automatically 
 * registers with the 'naming server', so the book-service needs to communicate 
 * with the exchange-service, and what it does is to ask the 'naming server' 
 * which addresses the exchange-service is available and it returns this information 
 * and it can balance the load between each of them, eureka knows where to make 
 * the request and how to balance the load.
 */
@FeignClient(name = "movie-data-service")
public interface MovieProxy {
    
    @GetMapping("/api/v1/movies")
    public List<MovieResponseDto> getMovies();
}
