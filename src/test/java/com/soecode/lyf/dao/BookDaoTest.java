package com.soecode.lyf.dao;

import com.google.gson.Gson;
import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testInsertBook() throws Exception {
        long bookId = 1008;
        String bookName = "杨哲的故事";
        int Number = 30;
        int insertBook = bookDao.insertBook(bookId, bookName, Number);
        System.out.printf("插入：" + (insertBook == 1 ? "成功" : "失败"));
    }

    @Test
    public void testQueryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }


    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 4);
        String result = new Gson().toJson(books);
        System.out.printf("返回的Json为： " + result);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }

}
