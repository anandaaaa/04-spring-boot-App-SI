package in.anand.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class userDao {
	
	public userDao() {
		System.out.println("user dao constructor");
	}
	
	public void userSaved()
	{
		System.out.println("user saved");
	}

}
