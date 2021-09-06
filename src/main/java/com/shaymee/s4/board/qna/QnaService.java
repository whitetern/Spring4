package com.shaymee.s4.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.BoardService;

@Service
public class QnaService implements BoardService {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Override
	public List<BoardDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getList();
	}

	@Override
	public QnaDTO getSelect(BoardDTO boardDTO) throws Exception {
		return qnaDAO.getSelect(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setInsert(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setUpdate(boardDTO);
	}
	
	//답글 달기. Notice에는 없고 QNA에만 있는 기능
	public int setReply(QnaDTO qnaDTO) throws Exception { // 얘는 QNA에서만 쓰는거니까 일단 QnaDTO를 매개변수로 선언
		
		return 0;
	}

}
