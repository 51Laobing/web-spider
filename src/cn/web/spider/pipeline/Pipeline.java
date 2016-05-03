package cn.web.spider.pipeline;

import cn.web.spider.ResultItems;
import cn.web.spider.Task;

/**
 * Pipeline is the persistent and offline process part of crawler.<br>
 * The interface Pipeline can be implemented to customize ways of persistent.
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
