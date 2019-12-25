package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Employee;
import entity.User;

public class BaseDao {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/employees?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true";
	private String name="root";
	private String pwd="12345678900q";
	
	public Connection con = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	public void getCon(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeAll(){
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int execute(String sql, Object ... param){
		int result = 0;
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				ps.setObject(i + 1, param[i]);
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return result;
	}

	
	public int check(String username,String password){
		int result=0;
		String sql="select * from t_user where uname='"+username+"' and upass='"+password+"' ";
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
			result=1;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return result;
	}
	
	

}

