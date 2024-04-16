package com.mars.backend.common;

import java.io.Serializable;

/**
 * 通用删除请求
 *
 * @author mars
 */
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -9154518689723267734L;

    /**
     * 主键 id
     */
    private Long id;
}
