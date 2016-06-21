package com.github.captain_miao.databinding.tutorial.recycleview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.github.captain_miao.databinding.tutorial.R;
import com.github.captain_miao.databinding.tutorial.base.BaseActivity;
import com.github.captain_miao.databinding.tutorial.helper.MockRandomData;
import com.github.captain_miao.databinding.tutorial.model.VehicleInfo;
import com.github.captain_miao.recyclerviewutils.WrapperRecyclerView;
import com.github.captain_miao.recyclerviewutils.listener.RefreshRecyclerViewListener;

public class RecycleViewActivity extends BaseActivity implements RefreshRecyclerViewListener, RvPresenter {
    private static final String TAG = "RecycleViewActivity";

    private WrapperRecyclerView mRefreshRecyclerView;
    @Override
    public void init(Bundle savedInstanceState) {
        setContentView(R.layout.activity_recycle_view);
        mRefreshRecyclerView = (WrapperRecyclerView) findViewById(R.id.refresh_recycler_view);

        mRefreshRecyclerView.setAdapter(new VehicleListAdapter(MockRandomData.getVehicleInfos(), this));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRefreshRecyclerView.setLayoutManager(linearLayoutManager);
        mRefreshRecyclerView.setRecyclerViewListener(this);
        mRefreshRecyclerView.disableLoadMore();
        mRefreshRecyclerView.setPadding(0, 0, 0, 20);
    }


    @Override
    public void onRefresh() {
        mRefreshRecyclerView.getRecyclerView().getAdapter().notifyDataSetChanged();
        mRefreshRecyclerView.refreshComplete();
    }

    @Override
    public void onLoadMore(int pagination, int pageSize) {

    }

    @Override
    public void onItemClick(VehicleInfo info) {
        Toast.makeText(this, info.brand, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSelectedClick(VehicleInfo info) {
        for(VehicleInfo e : ((VehicleListAdapter)mRefreshRecyclerView.getRecyclerView().getAdapter()).getList()){
            if(e.isSelected.get()) {
                e.isSelected.set(false);
                break;
            }
        }
        info.isSelected.set(true);
    }
}