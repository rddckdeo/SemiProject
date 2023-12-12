package kr.co.project.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.project.board.dto.BoardDTO;
import kr.co.project.board.page.BoardPageInfo;
import kr.co.project.notice.dto.NoticeDTO;

public class NoticeDAO {

	private PreparedStatement pstmt;

	// 공지사항 작성
	public int noticeEnroll(Connection con,String title,String content, int memberNo,String fileName,String uploadDirectory) {
	    String query = "INSERT INTO NOTICE" +
	            " VALUES(notice_seq.nextval," +
	            " ?," + // M_NO
	            " ?," + 
	            " ?," + 
	            " SYSDATE," + 
	            " NULL," + // 
	            " NULL," + 
	            " 0," + // BOARD_VIEWS
	            " ?," + // BOARD_PHOTO
	            " ?)"; // BOARD_ROUTE
	    
		try {
	        pstmt = con.prepareStatement(query);

	        pstmt.setInt(1, memberNo);
	        pstmt.setString(2, title);
	        pstmt.setString(3, content);
	        pstmt.setString(4, fileName);
	        pstmt.setString(5, uploadDirectory);

	        int result = pstmt.executeUpdate();

	        pstmt.close();
	        con.close();

	        return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	// notice List up
	public ArrayList<NoticeDTO> noticeList(Connection con, BoardPageInfo pi) {
		ArrayList<NoticeDTO> list = new ArrayList<>();

		String query = "SELECT N.BOARD_N_NO, "
		        + "N.BOARD_N_TITLE, "
		        + "N.BOARD_N_ON_DATE, "
		        + "N.BOARD_N_VIEWS, "
		        + "M.M_NAME "
		        + "FROM NOTICE N "
		        + "INNER JOIN MEMBER M ON N.M_NO = M.M_NO "
		        + "WHERE N.BOARD_N_DELETE IS NULL "
		        + "ORDER BY N.BOARD_N_ON_DATE DESC "
		        + "OFFSET ? ROWS FETCH FIRST ? ROWS ONLY";

		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, pi.getOffset());
			pstmt.setInt(2, pi.getBoardLimit()); // 5
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int boardNo = rs.getInt("Board_N_NO");
				String title = rs.getString("BOARD_N_TITLE");
				String onDate = rs.getString("BOARD_N_ON_DATE");
				int views = rs.getInt("BOARD_N_VIEWS");
				String name = rs.getString("M_NAME");

				NoticeDTO notice= new NoticeDTO();

				notice.setBoardNo(boardNo);
				notice.setTitle(title);
				notice.setOnDate(onDate);
				notice.setViews(views);
				notice.setName(name);

				list.add(notice);
			}

			pstmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	//공지사항 전체 게시글
	public int noticeListCount(Connection con) {
		String query = "SELECT count(*) AS cnt"
				+ "		FROM NOTICE"
				+ "		WHERE BOARD_N_DELETE IS NULL";
		
		try {
			pstmt = con.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int result = rs.getInt("CNT");
				return result;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	// 조회수 증가
	public int noticeView(Connection con, int boardNo) {
		String query = "UPDATE NOTICE"
				+ "		SET BOARD_N_VIEWS = BOARD_N_VIEWS+1"
				+ "		WHERE BOARD_N_NO = ?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,boardNo);
			int result = pstmt.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	// 공지사항 상세 보기
	public void noticeSelect(Connection con, NoticeDTO notice) {
		String query = "SELECT N.BOARD_N_NO, "
		        + "N.BOARD_N_TITLE, "
		        + "N.BOARD_N_CONTENT, "
		        + "N.BOARD_N_IN_DATE, "
		        + "N.BOARD_N_VIEWS, "
		        + "N.BOARD_N_PHOTO,"
		        + "N.BOARD_N_ROUTE,"
		        + "M.M_NO, "
		        + "M.M_NAME, "
		        + "C.COMMENT_NO, "
		        + "C.COMMENT_CONTENT, "
		        + "C.COMMENT_ON_DATE, "
		        + "C.COMMENT_IN_DATE, "
		        + "C.COMMENT_WRITER "
		        + "FROM NOTICE N "
		        + "INNER JOIN MEMBER M ON N.M_NO = M.M_NO "
		        + "LEFT JOIN NOTICE_COMMENT C ON N.BOARD_N_NO = C.BOARD_N_NO AND C.COMMENT_DELETE IS NULL "
		        + "WHERE N.BOARD_N_NO = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, notice.getBoardNo());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int boardNo = rs.getInt("BOARD_N_NO");
				String title = rs.getString("BOARD_N_TITLE");
				String content = rs.getString("BOARD_N_CONTENT");
				String inDate = rs.getString("BOARD_N_IN_DATE");
				int views = rs.getInt("BOARD_N_VIEWS");
				String photo = rs.getString("BOARD_N_PHOTO");
				String route = rs.getString("BOARD_N_ROUTE");
				String name = rs.getString("M_NAME");
				int m_No = rs.getInt("M_NO");
				int commentNo = rs.getInt("COMMENT_NO");
				String commentContent = rs.getString("COMMENT_CONTENT");
				String commentOnDate = rs.getString("COMMENT_ON_DATE");
				String commentInDate = rs.getString("COMMENT_IN_DATE");
				String commentWriter = rs.getString("COMMENT_WRITER");
				
				notice.setBoardNo(boardNo);
				notice.setTitle(title);
				notice.setContent(content);
				notice.setInDate(inDate);
				notice.setViews(views);
				notice.setPhoto(photo);
				notice.setRoute(route);
				notice.setName(name);
				notice.setM_No(m_No);
				notice.setCommentNo(commentNo);
				notice.setCommentContent(commentContent);
				notice.setCommentOnDate(commentOnDate);
				notice.setCommentInDate(commentInDate);
				notice.setCommentWriter(commentWriter);
				
			}
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}