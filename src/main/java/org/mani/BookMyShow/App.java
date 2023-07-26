package org.mani.BookMyShow;

import org.mani.BookMyShow.dto.BookMyShowDto;
import org.mani.BookMyShow.repository.BookMyShowRepository;


/**
 * @author manikanth
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BookMyShowDto dto = new BookMyShowDto();
    	dto.setAlt_key(1);
    	dto.setBudget("5.5Milion");
    	dto.setRating("9.5IMDb");
        BookMyShowRepository bookMyShowRepository=new BookMyShowRepository();
        bookMyShowRepository.updateMovie(dto);
    }
}
