package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr계정의 Job 테이블 제어하는 DAO 클래스
@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate mytemplate;
	
	//job 테이블의 레코드 개수 return
	public int count() {
		return mytemplate.queryForObject("select count(*) from jobs", Integer.class);
	}
}
