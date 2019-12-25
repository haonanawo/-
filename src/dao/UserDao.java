package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import entity.User;

public class UserDao extends BaseDao{

	public ArrayList<User> select(String username){
		ArrayList<User> ulist = new ArrayList<User>();
		String sql = "select * from t_user where uname='"+username+"'";
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				User us = new User(rs.getString(1),rs.getString(2));
				ulist.add(us);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return ulist;
	}

	
	public int update(User us){
		String sql = "update t_user set upass=? where uname=?";
		return this.execute(sql,us.getUpass(),us.getUname());
	}
}
