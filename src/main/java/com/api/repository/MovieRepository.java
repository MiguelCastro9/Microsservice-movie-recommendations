package com.api.repository;

import com.api.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Castro
 */
@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long> {
}
