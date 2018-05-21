// IBookManager.aidl
package com.example.aidlexample;

// Declare any non-default types here with import statements
 import com.example.aidlexample.Book;

interface IBookManager {
    List<Book> getBookList();
    //in 输入型参数
    //out 输出型参数
    //inout  输入输出型参数
    void addBook(in Book book);
}
