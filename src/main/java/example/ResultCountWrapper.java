package example;

import java.util.List;


public class ResultCountWrapper<T> {
    private List<T> records;
    private long count;
    private long pageIndex;
    private int pageSize;

    public ResultCountWrapper(List<T> records,long count){
        this.records =records;
        this.count = count;
    }



}
