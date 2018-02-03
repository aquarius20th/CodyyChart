package com.codyy.chart.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计表数据
 * Created by ldh on 2017/5/2.
 */

public class StatTableModel<R extends AbsStatRow> {
    private String mTitle;
    private int mEms = 3;
    /**
     * 行
     */
    private List<R> mRows;

    /**
     * 滑动列表-列名
     */
    private String[] mColumnTitles;


    public int columnCount() {
        return mColumnTitles == null ? 0 : mColumnTitles.length;
    }

    public String getColumnTitle(int columnIndex) {
        return mColumnTitles[columnIndex];
    }

    public String getRowTitle(int rowIndex) {
        return mRows.get(rowIndex).getRowTitle();
    }

    public String getCellStr(int rowIndex, int columnIndex) {
        return mRows.get(rowIndex).getCellByIndex(columnIndex);
    }

    public int getCellStatus(int rowIndex, int columnIndex) {
        return mRows.get(rowIndex).getCellStatus(columnIndex);
    }

    public int rowCount() {
        return mRows == null ? 0 : mRows.size();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getEms() {
        return mEms;
    }

    public void setEms(int ems) {
        mEms = ems;
    }

    public R getRow(int rowIndex) {
        return mRows.get(rowIndex);
    }

    public List<R> getRows() {
        return mRows;
    }

    public void setRows(List<R> rows) {
        mRows = rows;
    }

    public String[] getColumnTitles() {
        return mColumnTitles;
    }

    public void setColumnTitles(String[] columnTitles) {
        mColumnTitles = columnTitles;
    }

    public static StatTableModel<StatRow> createSample() {
        StatTableModel<StatRow> statTableModel = new StatTableModel<>();
        List<StatRow> statRows = new ArrayList<>();
        statTableModel.setTitle("省份");
        statTableModel.setColumnTitles(new String[]{"应受邀教室", "实受邀教室", "受邀教室占比", "计划课时", "实听课时", "实听课时占比", "平均听课"});
        statRows.add(new StatRow("上海", "785", "547", "68.11%", "4564", "2897", "58.00%", "789"));
        statRows.add(new StatRow("江苏", "785", "42", "68.12%", "4564", "2897", "52.00%", "4"));
        statRows.add(new StatRow("浙江", "785", "547", "68.13%", "4564", "2897", "58.00%", "3"));
        statRows.add(new StatRow("安徽", "725", "547", "68.15%", "4564", "2897", "51.00%", "98"));
        statRows.add(new StatRow("北京", "33", "547", "65.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("天津", "7845", "517", "68.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("广东", "785", "12", "68.11%", "4564", "2897", "3.00%", "34"));
        statRows.add(new StatRow("河北", "334", "654", "32.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("河南", "785", "87", "81.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("山东", "785", "547", "68.98%", "4564", "2897", "45.00%", "45"));
        statRows.add(new StatRow("湖北", "785", "345", "68.11%", "4564", "4343", "58.00%", "45"));
        statRows.add(new StatRow("湖南", "785", "98", "68.11%", "234", "2897", "58.00%", "45"));
        statRows.add(new StatRow("福建", "785", "547", "67.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("广西", "785", "54", "34.44%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("内蒙古", "43", "547", "68.11%", "4564", "2897", "45.00%", "45"));
        statRows.add(new StatRow("黑龙江", "785", "6565", "58.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("上海1", "785", "547", "68.11%", "4564", "2897", "58.00%", "98"));
        statRows.add(new StatRow("上海2", "785", "547", "68.11%", "4564", "2897", "58.00%", "45"));
        statRows.add(new StatRow("上海3", "785", "547", "68.11%", "4564", "2897", "58.00%", "64"));
        statRows.add(new StatRow("上海4", "545", "22", "68.11%", "4564", "2897", "58.00%", "67"));
        statRows.add(new StatRow("上海5", "43", "54", "68.11%", "4564", "2897", "58.00%", "32"));
        statRows.add(new StatRow("上海6", "785", "76", "68.11%", "4564", "2897", "58.00%", "65"));
        statRows.add(new StatRow("合计", "785", "345", "68.11%", "4564", "2897", "58.00%", "98"));
        statTableModel.setRows(statRows);
        return statTableModel;
    }

    public static StatTableModel<StatRow> createCommon() {
        StatTableModel<StatRow> statTableModel = new StatTableModel<>();
        List<StatRow> statRows = new ArrayList<>();
        statTableModel.setTitle("行政区");
        statTableModel.setColumnTitles(new String[]{"课程总数", "常规课程", "在线课程", "在线课程占比"});
        statRows.add(new StatRow("上海", "785", "13", "20", "66.11%"));
        statRows.add(new StatRow("江苏", "785", "42", "564", "68.12%"));
        statRows.add(new StatRow("浙江", "785", "57", "244", "68.13%"));
        statRows.add(new StatRow("安徽", "725", "47", "244", "68.15%"));
        statRows.add(new StatRow("北京", "33", "500", "244", "65.11%"));
        statRows.add(new StatRow("广东", "785", "12", "244", "68.11%"));
        statRows.add(new StatRow("河北", "334", "654", "244", "32.11%"));
        statRows.add(new StatRow("河南", "785", "87", "244", "81.11%"));
        statRows.add(new StatRow("山东", "785", "547", "44", "68.98%"));
        statRows.add(new StatRow("湖北", "785", "345", "244", "68.11%"));
        statRows.add(new StatRow("湖南", "785", "98", "44", "68.11%"));
        statRows.add(new StatRow("福建", "785", "12", "13", "67.11%"));
        statRows.add(new StatRow("广西", "785", "22", "21", "34.44%"));
        statRows.add(new StatRow("内蒙古", "43", "547", "244", "68.11%"));
        statRows.add(new StatRow("黑龙江", "785", "665", "244", "58.11%"));
        statRows.add(new StatRow("上海1", "785", "547", "24", "68.11%"));
        statRows.add(new StatRow("上海2", "785", "547", "244", "68.11%"));
        statRows.add(new StatRow("上海3", "785", "57", "244", "68.11%"));
        statRows.add(new StatRow("上海4", "545", "22", "244", "68.11%"));
        statRows.add(new StatRow("上海5", "43", "54", "24", "68.11%"));
        statRows.add(new StatRow("上海6", "785", "76", "244", "68.11%"));
        statRows.add(new StatRow("合计", "785", "345", "244", "68.11%"));
        statTableModel.setRows(statRows);
        return statTableModel;
    }
}
