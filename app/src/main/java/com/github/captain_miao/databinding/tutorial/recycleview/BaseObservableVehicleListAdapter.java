package com.github.captain_miao.databinding.tutorial.recycleview;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.captain_miao.databinding.tutorial.BR;
import com.github.captain_miao.databinding.tutorial.R;
import com.github.captain_miao.databinding.tutorial.model.BaseObservableVehicleInfo;
import com.github.captain_miao.recyclerviewutils.BaseWrapperRecyclerAdapter;

import java.util.List;


/**
 * @author YanLu
 * @since 16/4/27
 */
public class BaseObservableVehicleListAdapter extends BaseWrapperRecyclerAdapter<BaseObservableVehicleInfo, RecyclerView.ViewHolder> {

    public BaseObservableVehicleListAdapter() {
    }

    public BaseObservableVehicleListAdapter(List<BaseObservableVehicleInfo> items) {
        addAll(items);
    }

    @Override
    public RecyclerView.ViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.base_observable_recycler_item_view, parent, false);

        return new BaseObservableVehicleListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        final BaseObservableVehicleInfo info = getItem(position);
        ViewDataBinding binding = ((ViewHolder) holder).getBinding();
        binding.setVariable(BR.info, info);
        binding.setVariable(BR.itemClick, itemListener);
        binding.setVariable(BR.selectedClick, selectedListener);
        binding.executePendingBindings();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public ViewDataBinding getBinding() {
            return mBinding;
        }
    }

    OnClickVehicleItem itemListener = new OnClickVehicleItem<BaseObservableVehicleInfo>() {
        @Override
        public void onClick(View v, BaseObservableVehicleInfo data) {
            Toast.makeText(v.getContext(), data.getBrand(), Toast.LENGTH_SHORT).show();
        }
    };

    OnClickVehicleItem selectedListener = new OnClickVehicleItem<BaseObservableVehicleInfo>() {

        @Override
        public void onClick(View v, BaseObservableVehicleInfo data) {
            for(BaseObservableVehicleInfo e : getList()){
                if(e.getIsSelected()) {
                    e.setIsSelected(false);
                    break;
                }
            }
            data.setIsSelected(true);
        }


    };


}
