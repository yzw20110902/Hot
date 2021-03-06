package com.wkw.hot.ui.item;

import com.wkw.hot.base.ILoadingView;
import com.wkw.hot.base.IPresenter;
import com.wkw.hot.entity.PopularEntity;

import com.wkw.hot.model.PopularModel;
import java.util.List;

/**
 * Created by wukewei on 16/5/30.
 */
public class ItemContract {
    interface View extends ILoadingView {
        void addLoadMoreData(List<PopularModel> data);
        void addRefreshData(List<PopularModel> data);
    }
    interface Presenter extends IPresenter<View> {
        void getListData(String type);
        void getCacheData(String type);
    }
}
