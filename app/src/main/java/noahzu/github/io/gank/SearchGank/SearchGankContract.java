package noahzu.github.io.gank.SearchGank;

import java.util.List;

import noahzu.github.io.gank.Base.BasePresenter;
import noahzu.github.io.gank.Base.BaseView;
import static noahzu.github.io.gank.Data.entity.SearchGankResult.SearchGank;

/**
 * Created by Administrator on 2016/8/16.
 */
public class SearchGankContract {
    interface View extends BaseView<Presenter>{
        void showGanks(List<SearchGank> ganks);
        void addGanks(List<SearchGank> ganks);
        void showGankDetails(SearchGank gank);
    }

    interface Presenter extends BasePresenter{
        void openGank(SearchGank gank);
        void updateGankList(String keyWord);
    }
}
