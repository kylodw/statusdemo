package com.example.aidlexample;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by dw322 on 2018/5/20.
 */

public class BookManagerService extends Service {
    private CopyOnWriteArrayList<Book> books=new CopyOnWriteArrayList<>();

    private Binder mBinder=new IBookManager.Stub() {
        @Override
        public List<Book> getBookList() throws RemoteException {
            return books;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            books.add(book);
        }
    };
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        books.add(new Book(1,"JAVA编程思想"));
        books.add(new Book(2,"Android"));
    }
}
