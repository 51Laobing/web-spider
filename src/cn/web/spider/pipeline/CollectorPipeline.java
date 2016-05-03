package cn.web.spider.pipeline;

import java.util.List;

/**
 * Pipeline that can collect and store results. <br>
 * Used for {@link cn.web.spider.Spider#getAll(java.util.Collection)}
 *
 * @authorkeehang
 * @since 0.4.0
 */
public interface CollectorPipeline<T> extends Pipeline {

    /**
     * Get all results collected.
     *
     * @return collected results
     */
    public List<T> getCollected();
}
