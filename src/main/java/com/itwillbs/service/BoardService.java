package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.domain.Criteria;

public interface BoardService {
	//글쓰기
	public void regist(BoardVO vo) throws Exception;
	
	//글 전체 목록
	public List<BoardVO> listAll() throws Exception;
	
	//글번호에 해당하는 게시글 상세 보기
	//public BoardVO readContent(int bno) throws Exception;
	public BoardVO readContent(Integer bno) throws Exception;
	
	//글 수정
	public void modify(BoardVO vo) throws Exception;
	
	//글 삭제
	public void remove(Integer bno) throws Exception;
	
	//페이징처리한 글목록
	public List<BoardVO> listCri(Criteria cri) throws Exception;
	
	//DB 테이블에 있는 모든 글 개수 계산 후 리턴
	public int pageCount() throws Exception;
	
}
