package cels.view;

import cels.entity.Vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by donald.tang on 2019/5/30.
 */
public class PageBean {

    //一页多少条
    private int pageSize;

    //总条数
    private int total;

    //总页数
    private int pages;

    private int first = 1;
    private int last;

    private int next;
    private int previous;
    private int current;

    private List<Vocabulary> datas;

    public PageBean(int size, Set<Vocabulary> datas) {
        this.pageSize = size;
        this.datas = new ArrayList<>();

        this.datas.addAll(datas);

        this.total = datas.size();
        this.pages = this.total % this.pageSize == 0?this.total / this.pageSize:this.total / this.pageSize + 1;
        this.first = 1;
        this.last = this.pages;
    }

    public List<Vocabulary> getShowData(int page) {
        int startPos = (page - 1) * this.pageSize;
        int endPos = page == this.last?this.total:startPos + this.pageSize;
        List<Vocabulary> showData = new ArrayList<>(this.datas);
        return showData.subList(startPos, endPos);
    }

    public int getSize() {
        return pageSize;
    }

    public void setSize(int size) {
        this.pageSize = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public List<Vocabulary> getDatas() {
        return datas;
    }

    public void setDatas(List<Vocabulary> datas) {
        this.datas = datas;
    }

}
