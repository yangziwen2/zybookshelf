package net.yangziwen.bookshelf.service.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import net.yangziwen.bookshelf.dao.IBookDao;
import net.yangziwen.bookshelf.service.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookDao bookDao;
	
	@Override
	public Map<String, Object> getBookPaginateResult(int start, int limit, Map<String, Object> param) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("totalCount", 0);
//		result.put("list", Collections.emptyList());
		return bookDao.getBookPaginateResult(start, limit, param);
	}

}
