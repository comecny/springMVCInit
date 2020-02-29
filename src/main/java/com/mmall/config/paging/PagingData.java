package com.mmall.config.paging;

import java.util.List;

public class PagingData<T> {
    private List<T> data;
    private int recordsTotal;

    public PagingData() {
    }

    public PagingData(List<T> data, int recordsTotal) {
        this.data = data;
        this.recordsTotal = recordsTotal;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    @Override
    public String toString() {
        return "PagingData{" +
                "data=" + data +
                ", recordsTotal=" + recordsTotal +
                '}';
    }
}
