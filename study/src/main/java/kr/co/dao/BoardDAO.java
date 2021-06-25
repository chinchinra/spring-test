package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;
import kr.co.vo.SearchCriteria;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;

	// list 조회
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	
	public int ListCount(SearchCriteria scri) throws Exception;

	// 게시물 조회
	public BoardVO read(int bno) throws Exception;

	// 게시물 수정
	public void update(BoardVO boardVO) throws Exception;

	// 게시물 삭제
	public void delete(int bno) throws Exception;
	

	// 댓글 삭제
	public void replyDelete(int bno) throws Exception;
	
}
