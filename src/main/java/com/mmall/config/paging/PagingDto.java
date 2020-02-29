package com.mmall.config.paging;


public abstract class PagingDto {
   
    private int page;
   
    private int length;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "PagingDto{" +
                "page=" + page +
                ", length=" + length +
                '}';
    }
}
