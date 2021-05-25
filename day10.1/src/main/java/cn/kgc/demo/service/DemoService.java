package cn.kgc.demo.service;

import cn.kgc.demo.pojo.Emp;

public interface DemoService {

    //测试 - 删除并且新增一个员工 - 事务操作
    public String removeEmp(Integer eid, Emp emp) throws Exception;

}
