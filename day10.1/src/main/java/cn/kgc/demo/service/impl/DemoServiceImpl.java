package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.EmpMapper;
import cn.kgc.demo.pojo.Emp;
import cn.kgc.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private EmpMapper empMapper;

    //添加事务注解配置
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public String removeEmp(Integer eid, Emp emp) throws Exception {
        try {
            //删除一个员工
            empMapper.deleteByPrimaryKey(eid);
            //异常
            int i = 1 / 0;
            //新增一个员工
            empMapper.insert(emp);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }

}
