package com.exam.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.pojo.CompletionDO;
import com.exam.pojo.Page;
import com.exam.utils.Result;

/**
 * <p>
 * 填空题表 服务类
 * </p>
 *
 * @author 杨德石
 * @since 2019-03-28
 */
public interface CompletionService extends IService<CompletionDO> {

    /**
     * 分页查询
     * @param page
     * @return
     */
    Page<CompletionDO> getByPage(Page<CompletionDO> page);

    /**
     * 添加或修改填空题
     * @param completion
     * @return
     */
    Result saveOrUpdateCompletion(CompletionDO completion);
}
