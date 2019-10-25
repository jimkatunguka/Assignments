import java.util.logging.Level;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoClass {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//gets rid of log files.
		java.util.logging.Logger mongoLogger = 
		java.util.logging.Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			
			DB db = mongoClient.getDB("ginger");
			DBCollection coll = db.getCollection("users");
			DBCursor cursor = coll.find();
			
				int count = 0;
				while(cursor.hasNext()) {
					int i = 1;
					System.out.println(cursor.next());
					i++;
					count++;
				}
				System.out.println(count); // number of documents in the collection
				System.out.println("Connection succesful");
			
			
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("wapi");
		}

	}

}
