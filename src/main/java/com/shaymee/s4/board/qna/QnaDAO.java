package com.shaymee.s4.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shaymee.s4.board.BoardDAO;
import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.pager.Pager;

@Repository
public class QnaDAO implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shaymee.s4.board.qna.QnaDAO.";
	

	public Long totalCount(Pager pager) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"totalCount", pager);
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}

	@Override
	public QnaDTO getSelect(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getSelect", boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setInsert", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setDelete", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setUpdate", boardDTO);
	}
	
	public int setReplyUpdate(QnaDTO qnaDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setReplyUpdate", qnaDTO);
	}
	
	
	//답글 달기. Notice에는 없고 QNA에만 있는 기능
	public int setReply(QnaDTO qnaDTO) throws Exception { // 얘는 QNA에서만 쓰는거니까 일단 QnaDTO를 매개변수로 선언
		
		return sqlSession.insert(NAMESPACE+"setReply", qnaDTO);
	}

	
}
