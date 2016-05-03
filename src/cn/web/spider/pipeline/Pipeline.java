package cn.web.spider.pipeline;

import cn.web.spider.ResultItems;
import cn.web.spider.Task;

/**
 * 输出和持久化的接口
 *
 * @author keehang
 * 
 * @see ConsolePipeline
 * @see FilePipeline
 */
public interface Pipeline {

    /**
     * Process extracted results.
     *
     * @param resultItems resultItems
     * @param task task
     */
    public void process(ResultItems resultItems, Task task);
}
