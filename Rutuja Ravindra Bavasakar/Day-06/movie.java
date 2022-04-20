
package begin6;

public class movie implements Comparable<movie> 
{
  private double rating;
  private String name;
  private int year;
  
  public movie(double rating, String name, int year)
  {
	  this.rating = rating;
	  this.name = name;
	  this.year = year;
  }
public double getRating() 
 {
	return rating;
}

public String getName() 
{
	return name;
	
}

public int getYear() 
{
	return year;
}
public int compareTo(movie m) 
{
	
	return this.year-m.year;
}

}