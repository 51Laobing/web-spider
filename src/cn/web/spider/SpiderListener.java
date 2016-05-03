package cn.web.spider;

/**
 * 监听页面抓取
 *
 * @author keehang
 */
public interface SpiderListener {

    public void onSuccess(Request request);

    public void onError(Request request);
}
