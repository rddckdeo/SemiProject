package kr.co.project.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.project.board.dto.BoardDTO;

public class BoardDAO {

	private PreparedStatement pstmt;

	// 문의사항 작성
	public int boardEnroll(Connection con, String title, String content, int memberNo) {
		String query = "INSERT INTO BOARD" + " VALUES(board_seq.nextval," // BOARD_NO
				+ " ?," // M_NO
				+ " ?," // BOARD_TITLE
				+ " ?," // BOARD_CONTENT
				+ " SYSDATE," // BOARD_ON_DATE
				+ " NULL," // BOARD_IN_DATE
				+ " NULL," // BOARD_DELETE
				+ " 0," // BOARD_VIEWS
				+ " NULL," // BOARD_PHOTO
				+ " NULL," // BOARD_ROUTE
				+ " 'N')"; // BOARD_ANSWER

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, memberNo);
			pstmt.setString(2, title);
			pstmt.setString(3, content);

			int result = pstmt.executeUpdate();

			pstmt.close();
			con.close();

			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	// 공지사항 작성
	public int noticeEnroll(Connection con, String title, String content, int memberNo) {
		String query = "INSERT INTO NOTICE" + " VALUES(notice_seq.nextval," // BOARD_N_NO
				+ " ?," // M_NO
				+ " ?," // BOARD_N_TITLE
				+ " ?," // BOARD_N_CONTENT
				+ " SYSDATE," // BOARD_N_ON_DATE
				+ " NULL," // BOARD_N_IN_DATE
				+ " NULL," // BOARD_N_DELETE
				+ " 0," // BOARD_N_VIEWS
				+ " NULL," // BOARD_N_PHOTO
				+ " NULL)"; // BOARD_N_ROUTE

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, memberNo);
			pstmt.setString(2, title);
			pstmt.setString(3, content);

			int result = pstmt.executeUpdate();

			pstmt.close();
			con.close();

			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	// boardList 가져오기
	public ArrayList<BoardDTO> boardList(Connection con) {
		ArrayList<BoardDTO> list = new ArrayList<>();

		String query = "SELECT BOARD_NO," 
				+ "			BOARD_TITLE," 
				+ "			BOARD_ON_DATE,"
				+ "			BOARD_ANSWER" 
				+ "			FROM BOARD ORDER BY BOARD_ON_DATE DESC";

		try {
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int boardNo = rs.getInt("Board_NO");
				String title = rs.getString("BOARD_TITLE");
				String onDate = rs.getString("BOARD_ON_DATE");
				String answer = rs.getString("BOARD_ANSWER");

				BoardDTO board = new BoardDTO();

				board.setBoardNo(boardNo);
				board.setTitle(title);
				board.setOnDate(onDate);
				board.setAnswer(answer);

				list.add(board);

			}
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// notice List up
	public ArrayList<BoardDTO> noticeList(Connection con) {
		ArrayList<BoardDTO> list = new ArrayList<>();

		String query = "SELECT BOARD_N_NO," 
				+ "			BOARD_N_TITLE," 
				+ "			BOARD_N_ON_DATE"
				+ "			FROM NOTICE ORDER BY BOARD_N_ON_DATE DESC";

		try {
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int noticeNo = rs.getInt("BOARD_N_NO");
				String title = rs.getString("BOARD_N_TITLE");
				String onDate = rs.getString("BOARD_N_ON_DATE");

				BoardDTO board = new BoardDTO();
				board.setNoticeNo(noticeNo);
				board.setTitle(title);
				board.setOnDate(onDate);

				list.add(board);
			}

			pstmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	// 조회수 증가
	public int boardView(Connection con, int boardNo) {
		String query = "UPDATE BOARD"
				+ "		SET BOARD_VIEWS = VOARD_VIEWS+1"
				+ "		WHERE BOARD_NO = ?";
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

}
