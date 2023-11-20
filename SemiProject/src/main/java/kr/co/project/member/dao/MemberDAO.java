package kr.co.project.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.project.member.dto.MemberDTO;

public class MemberDAO {
	private PreparedStatement pstmt;
	
	// 로그인
	public MemberDTO memberSignin(Connection con, String id, String pwd) {
		// 1. 쿼리 작성
		String query = "SELECT m_no,"
				+ "			   m_id, "
				+ "			   m_pwd,"
				+ "			   m_name,"
				+ "			   m_phone,"
				+ "			   m_email,"
				+ "			   m_addr,"
				+ "			   m_birth,"
				+ "			   m_in_date,"
				+ "			   m_delete_date,"
				+ "			   m_mlg "
				+ "		FROM member "
				+ "		WHERE m_id = ? "
				+ "		AND m_pwd = ?";
		
		// 2. 쿼리 실행할 준비
		try {
			pstmt = con.prepareStatement(query);
			// 3. 물음표있으면 채우고
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			// 4. 쿼리실행
			ResultSet rs = pstmt.executeQuery();
			
			MemberDTO member = new MemberDTO();
			
			while(rs.next()) {
				String resultId = rs.getString("M_ID");
				System.out.println("DAO : "+ resultId);
				String resultPwd = rs.getString("M_PWD");
				int resultNo = rs.getInt("M_NO");
				String resultName = rs.getString("M_NAME");
				String resultPhone = rs.getString("M_PHONE");
				String resultEmail = rs.getString("M_EMAIL");
				String resultAddr = rs.getString("M_ADDR");
				String resultBirth = rs.getString("M_BIRTH");
				String resultInDate = rs.getString("M_IN_DATE");
				String resultDeleteDate = rs.getString("M_DELETE_DATE");
				int resultMlg = rs.getInt("M_MLG");
						
				member.setId(resultId);
				member.setPwd(resultPwd);
				member.setNo(resultNo);
				member.setName(resultName);
				member.setPhone(resultPhone);
				member.setEmail(resultEmail);
				member.setAddr(resultAddr);
				member.setBirth(resultBirth);
				member.setInDate(resultInDate);
				member.setDeleteDate(resultDeleteDate);
				member.setMlg(resultMlg);
				
			}
			
			return member;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
		return null;
	}

	public int memberUpdate(Connection con, MemberDTO member, String beforeEmail) {
		// 1. 쿼리 작성
		String query = "UPDATE member"
				+ "		SET m_phone = ?,"
				+ "		    m_email = ?,"
				+ "			m_addr = ?,"
				+ "			m_birth = ?"
				+ "		WHERE m_email = ?";
		
		
		// 2. 쿼리 실행할 준비
		try {
			pstmt = con.prepareStatement(query);
			// 3. 물음표있으면 채우고
			pstmt.setString(1, member.getPhone());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getAddr());
			pstmt.setString(4, member.getBirth());
			pstmt.setString(5, beforeEmail);
			
			// 4. 쿼리 실행
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return 0;
	}

}
