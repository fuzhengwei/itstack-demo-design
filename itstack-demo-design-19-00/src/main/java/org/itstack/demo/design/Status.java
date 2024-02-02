package org.itstack.demo.design;

public enum Status {

    /** 1创建编辑 */
    Editing,

    /** 2待审核 */
    Check,

    /** 3审核通过(任务扫描成活动中) */
    Pass,

    /** 4审核拒绝(可以撤审到编辑状态) */
    Refuse,

    /** 5活动中 */
    Doing,

    /** 6活动关闭 */
    Close,

    /** 7活动开启(任务扫描成活动中) */
    Open,

}
