package dao;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Employee;
public class EmployeeDao extends BaseDao{
		public ArrayList<Employee> select(){
			ArrayList<Employee> list = new ArrayList<Employee>();
			String sql = "select * from t_employees";
			try {
				this.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					Employee em = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
					list.add(em);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				this.closeAll();
			}
			return list;
		}
		
		public ArrayList<Employee> nselect(String name){
			ArrayList<Employee> list = new ArrayList<Employee>();
			String sql = "select * from t_employees where 1=1 ";
			if(name!=""){
				sql+="and ename like '%"+name+"%' ";	
			}
			try {
				this.getCon();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					Employee em = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
					list.add(em);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				this.closeAll();
			}
			return list;
		}
		
		
		public Employee getById(int id){
			Employee em = null;
			String sql = "select * from t_employees where eno=?";
			try {
				this.getCon();
				ps = con.prepareStatement(sql);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				while(rs.next()){
					em = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				this.closeAll();
			}
			return em;
		}
		

		public int add(Employee em){
			String sql = "insert into t_employees values(null,?,?,?,?)";
			return this.execute(sql,em.getEname(),em.getEsex(),em.getEage(),em.getEtel());
		}
		
		
		public int delete(int eno){
			String sql = "delete from t_employees where eno=?";
			return this.execute(sql, eno);
		}
		
		
		public int update(Employee em){
			String sql = "update t_employees set ename=?, esex=?,eage=?, etel=? where eno=?";
			return this.execute(sql,em.getEname(),em.getEsex(),em.getEage(),em.getEtel(),em.getEno());
		}

}
