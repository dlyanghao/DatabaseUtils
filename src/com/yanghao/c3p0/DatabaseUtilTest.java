package com.yanghao.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;


public class DatabaseUtilTest {

	@Test
	public void test() throws SQLException {
		
		Connection connection = DatabaseUtil.getConnection();
		DatabaseUtil.closeSourceConnection(connection, null, null);
	}

}
