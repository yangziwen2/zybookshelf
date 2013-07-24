package net.yangziwen.bookshelf.service;

import java.util.Map;

public interface IBookService {

	Map<String, Object> getBookPaginateResult(int start, int limit, Map<String, Object> param);

}
