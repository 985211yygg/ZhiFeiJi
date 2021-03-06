package com.example.yungui.zhifeiji.homepage;

import com.example.yungui.zhifeiji.BasePresenter;
import com.example.yungui.zhifeiji.BaseView;
import com.example.yungui.zhifeiji.bean.guokr.GuoKrStory;

import java.util.ArrayList;

/**
 * Created by yungui on 2017/2/14.
 */

public interface GuoKrContract {

    //view相关的操作接口
    interface View extends BaseView<Presenter> {
        //显示错误
        void showError();

        //正在加载
        void showLoading();

        //停止加载
        void stopLoading();

        //成功获取数据之后再界面中显示
        void showResult(ArrayList<GuoKrStory.ResultBean> resultBeanArrayList);


    }
    //逻辑相关的操作接口
    interface Presenter extends BasePresenter {
        //请求数据
        void loadPost(int counts);

        //刷新数据
        void refresh();

        //加载更多
        void loadMore(int counts);

        //进入详情
        void readDetail(int id);

        //随便看看
        void lookLook();
    }
}
