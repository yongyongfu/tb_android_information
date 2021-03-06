package com.tokenbank.tokeninformation.net.manager;

import com.tokenbank.tokeninformation.model.Article;
import com.tokenbank.tokeninformation.net.HttpResult;
import com.tokenbank.tokeninformation.net.UrlConfig;
import com.tokenbank.tokeninformation.util.upgrade.common.UpgradeInfo;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Author: Clement
 * Create: 2018/5/20
 * Desc:
 */

public interface HttpService {

    @GET(UrlConfig.GET_ARTICLE_LIST) Observable<HttpResult<List<Article>>> getArticles(
        @Query("lang") String lang);

    @GET(UrlConfig.CHECK_UPGRADE) Observable<HttpResult<UpgradeInfo>> checkUpgrade(
        @QueryMap Map<String, String> options);
}
