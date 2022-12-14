package com.alkemy.disney.service;

import com.alkemy.disney.dto.MovieBasicDTO;
import com.alkemy.disney.dto.MovieDTO;

import java.util.List;

public interface MovieService {

   List<MovieBasicDTO> getByFilters( String title,Long genderId,String creationDate);

   MovieDTO save(MovieDTO movieDTO);



    MovieDTO getDetailsById(Long id);


   void delete(Long id);


   MovieDTO update(Long id, MovieDTO movieDTO);

   MovieDTO addPersonage(Long movieId,Long personageId);
   MovieDTO removePersonage(Long movieId,Long personageId);
}
