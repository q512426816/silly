/*
 *  Copyright  iqiny.com
 *
 *  https://gitee.com/iqiny/silly
 *
 *  project name：silly-core 1.0.6-RELEASE
 *  project description：top silly project pom.xml file
 */
package com.iqiny.silly.core.config.property;

import com.iqiny.silly.core.base.core.SillyNode;
import com.iqiny.silly.core.base.core.SillyVariable;

import java.util.List;

/**
 * 傻瓜变量数据保存处置类
 */
public interface SillyVariableSaveHandle {

    /**
     * 保存处置类的名称 （全局唯一）
     * @return
     */
    String name();

    /**
     * 处置执行具体内容
     * @param category 当前业务分类
     * @param node 当前节点对象
     * @param variables 当前保存数据集合
     * @return 是否保存
     */
    boolean handle(String category, SillyNode node, SillyVariable variables);

}
