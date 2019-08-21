package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.biz.MVCBoardBiz;
import com.mvc.biz.MVCBoardBizImpl;
import com.mvc.dto.MVCBoardDto;

@WebServlet(urlPatterns = {"/selectall", "/selectone", "/insertform", "/insert",
							"/updateform", "/update", "/delete"})
public class MVCBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MVCBoardBiz biz;
       
    public MVCBoardServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			getRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		biz = new MVCBoardBizImpl();
		String command = request.getRequestURI();
		System.out.println("[" + command + "]");
		if(command.endsWith("/selectall")) {
			doSelectAll(request, response);
		} else if(command.endsWith("/selectone")) {
			doSelOne(request, response);
		} else if(command.endsWith("/insertform")) {
			response.sendRedirect("insertform.jsp");
		} else if(command.endsWith("/insert")) {
			doInsert(request, response);
		} else if(command.endsWith("/updateform")) {
			doUpdateForm(request, response);
		} else if(command.endsWith("/update")) {
			doUpdate(request, response);
		} else if(command.endsWith("delete")) {
			doRemove(request, response);
		}
	}

	// 업데이트 폼
	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		MVCBoardDto dto = biz.selectone(seq);
		request.setAttribute("dto", dto);
		dispatch(request, response, "updateform.jsp");
	}

	// 글 삭제
	private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		int res = biz.delete(seq);
		if(res > 0) {
			out.print("<script> alert('글이 삭제되었습니다!'); location.href='selectall'; </script>");
		} else {
			out.print("<script> alert('글삭제 에러'); location.href='selectall'; </script>");
		}
	}

	// 업데이트 수행
	private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		MVCBoardDto dto = new MVCBoardDto();
		dto.setSeq(seq);
		dto.setTitle(title);
		dto.setContent(content);
		
		int res = biz.update(dto);
		if(res > 0) {
			out.print("<script> alert('글이 수정되었습니다!'); location.href='selectone?seq=" + seq + "'; </script>");
		} else {
			out.print("<script> alert('글수정 에러'); location.href='selectone?seq=" + seq + "'; </script>");
		}
	}

	// 글 쓰기
	private void doInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		MVCBoardDto dto = new MVCBoardDto();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setContent(content);
		int res = biz.insert(dto);
		if(res > 0) {
			out.print("<script> alert('글이 추가되었습니다!'); location.href='selectall'; </script>");
		} else {
			out.print("<script> alert('글작성 에러'); location.href='selectall'; </script>");
		}
	}

	// 글 하나 선택
	private void doSelOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int seq = Integer.parseInt(request.getParameter("seq"));
		MVCBoardDto dto = biz.selectone(seq);
		request.setAttribute("dto", dto);
		dispatch(request, response, "selectone.jsp");
	}

	// 글 목록 조회
	private void doSelectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MVCBoardDto> list = biz.selectList();
		request.setAttribute("list", list);
		dispatch(request, response, "boardlist.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void dispatch(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher(url);
		dispatch.forward(request, response);
	}

}
