package com.fph.lotteryanalyze.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;

import com.feilu.kotlindemo.base.BaseActivity;
import com.fph.lotteryanalyze.R;
import com.fph.lotteryanalyze.adapter.AnalyzeHistoryAdapter;
import com.fph.lotteryanalyze.bean.FrequencyBean;
import com.fph.lotteryanalyze.db.LotteryDaoUtils;
import com.fph.lotteryanalyze.db.LotteryEntity;
import com.fph.lotteryanalyze.utils.AnalyzeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SsqRedBallAnalyzeActivity extends BaseActivity {

    private AnalyzeHistoryAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_analyze_history;
    }

    @Override
    protected void init() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        mAdapter = new AnalyzeHistoryAdapter("red");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setList(new AnalyzeUtils("red").getSsqBlueAnalyzeData(this));
    }
}
