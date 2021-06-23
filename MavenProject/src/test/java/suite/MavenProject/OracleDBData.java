package suite.MavenProject;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.testng.annotations.Test;

import base.Log;
import database.OracleQueries;

public class OracleDBData {
	public OracleQueries oracle=null;
	
	@Test
	public void TC_Oracle() throws Exception{
		try{
			oracle=new OracleQueries();
			ResultSet rs=oracle.dbLookupValues();
			ArrayList<String> dbValues=new ArrayList<>();
			while(rs.next()){
				dbValues.add(rs.getString("LOOKUP_DISPLAY_NAME"));
			}
			System.out.println("DB Values: "+dbValues);
			Log.info("DB Values: "+dbValues);
		}catch(Exception e){
			throw e;
		}
	}

}
