package com.example.aidlexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kylodw on 2018/5/20.
 */

public class Book implements Parcelable {
    private String bookName;
    private int bookId;

    public Book(int bookId,String bookName) {
        this.bookName = bookName;
        this.bookId = bookId;
    }
    protected Book(Parcel in) {
        bookName = in.readString();
        bookId = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        //从序列化后的对象中创建原始对象
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }
        //创建指定长度的原始对象数组
        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bookName);
        dest.writeInt(bookId);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
