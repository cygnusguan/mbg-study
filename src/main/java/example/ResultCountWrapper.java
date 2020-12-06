package example;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.util.Buildable;

import java.util.List;
import java.util.function.BiFunction;


public class ResultCountWrapper<T> {
    private List<T> records;
    private long count;
    private long pageIndex;
    private int pageSize;

    public ResultCountWrapper(List<T> records,long count){
        this.records =records;
        this.count = count;
    }


    public static interface SelectDSLCompleterExt
            extends BiFunction<QueryExpressionDSL<SelectModel>, RowBounds, Buildable<SelectModel>> {

    }
}
