package cn.web.spider;

/**
 * Interface for identifying different tasks.<br>
 *
 * @author keehang
 * 
 * @see cn.web.spider.scheduler.Scheduler
 * @see cn.web.spider.pipeline.Pipeline
 */
public interface Task {

    /**
     * unique id for a task.
     *
     * @return uuid
     */
    public String getUUID();

    /**
     * site of a task
     *
     * @return site
     */
    public Site getSite();

}
