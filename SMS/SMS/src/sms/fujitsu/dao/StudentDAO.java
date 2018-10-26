package sms.fujitsu.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sms.fujitsu.model.Student;

import sms.fujitsu.util.ConnectionUtil;

public class StudentDAO {

	
	public static List<Student> findAll() {
		Connection con = ConnectionUtil.getConnection();
		ArrayList<Student> studentlist = new ArrayList<>();
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement("Select ID,NAME,DEPARTMENT,MARK1,MARK2,MARK3 from Student;");
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudent_id(rs.getInt("ID"));
				student.setStudent_name(rs.getString("NAME"));
				student.setDepartment(rs.getString("DEPARTMENT"));
				student.setMark1(rs.getInt("MARK1"));
				student.setMark2(rs.getInt("MARK2"));
				student.setMark3(rs.getInt("MARK3"));

				studentlist.add(student);
				System.out.println(""+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
			}
		} catch (Exception e) {
			System.out.println("Extraction error findAll");
		}
		return studentlist;
	}

	public static Student findById(Student student) {
		Connection con = ConnectionUtil.getConnection();
		
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement(
					"Select ID,NAME,DEPARTMENT,MARK1,MARK2,MARK3 from Student where ID=?;");
			psmt.setInt(1, student.getStudent_id());
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
			
				student.setStudent_id(rs.getInt("ID"));
				student.setStudent_name(rs.getString("NAME"));
				student.setDepartment(rs.getString("DEPARTMENT"));
				student.setMark1(rs.getInt("MARK1"));
				student.setMark2(rs.getInt("MARK2"));
				student.setMark3(rs.getInt("MARK3"));
			}
		} catch (Exception e) {
			System.out.println("Extraction error findById");
		}
		return student;
	}

	public static void insert(Student student) {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement("INSERT INTO STUDENT() VALUES(?,?,?,?,?,?);");
			psmt.setInt(1, student.getStudent_id());
			psmt.setString(2, student.getStudent_name());
			psmt.setString(3, student.getDepartment());
			psmt.setInt(4, student.getMark1());
			psmt.setInt(5, student.getMark2());
			psmt.setInt(6, student.getMark3());
			int rows = psmt.executeUpdate();
			System.out.println("Rows affected :-" + rows);

		} catch (Exception e) {
			System.out.println("Update error");
		}
	}

	public static void update(Student student) {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement("update student set name = ? where ID=?;");
			psmt.setString(1, student.getStudent_name());
//			psmt.setString(2, student.getDepartment());
//			psmt.setInt(3, student.getMark1());
//			psmt.setInt(4, student.getMark2());
//			psmt.setInt(5, student.getMark3());
			psmt.setInt(2, student.getStudent_id());
			int rows = psmt.executeUpdate();
			System.out.println("Rows affected :-" + rows);

		} catch (Exception e) {
			System.out.println("Update error");
		}
	}

	public static void delete(Student student) {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement("Delete from student where ID = ? ;");
			psmt.setInt(1, student.getStudent_id());
			int rows = psmt.executeUpdate();
			System.out.println("Rows affected :-" + rows);

		} catch (Exception e) {
			System.out.println("Delete error");
		}

	}
	
	public static void ReportGeneration(Student student){
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement psmt;
		try {
			psmt = con.prepareStatement(
					"Select ID,NAME,DEPARTMENT,MARK1,MARK2,MARK3 from Student where ID=? ;");
			psmt.setInt(1, student.getStudent_id());
			
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Student std = new Student();
				std.setStudent_id(rs.getInt("ID"));
				std.setStudent_name(rs.getString("NAME"));
				std.setDepartment(rs.getString("DEPARTMENT"));
				std.setMark1(rs.getInt("MARK1"));
				std.setMark2(rs.getInt("MARK2"));
				std.setMark3(rs.getInt("MARK3"));
				System.out.println("******************Report*******************");
				System.out.println(" Name of the student is              :- "+std.getStudent_name());
				System.out.println(" Department of the student is        :- "+std.getDepartment());
				System.out.println(" Marks of the student in Maths is    :- "+std.getMark1());
				System.out.println(" Marks of the student in Science is  :- "+std.getMark2());
				System.out.println(" Marks of the student in English is  :- "+std.getMark3());
				System.out.println("******************End**********************");
			}
		} catch (Exception e) {
			System.out.println("Extraction error in Report generation");
		}
		
	}
		
		

	}
