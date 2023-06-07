package com.satpat.movies;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() { // returns a List of all movies
        return movieRepository.findAll(); // findAll() is a part of MongoRepository class, which is extended to MovieRepository
    }
}
