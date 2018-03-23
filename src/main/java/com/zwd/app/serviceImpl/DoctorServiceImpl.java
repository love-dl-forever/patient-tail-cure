package com.zwd.app.serviceImpl;

import com.zwd.app.domain.Doctor;
import com.zwd.app.domain.DoctorExample;
import com.zwd.app.mapper.DoctorMapper;
import com.zwd.app.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public void insertSeletive(Doctor doctor) {
        doctorMapper.insertSelective(doctor);
    }

    @Override
    public Doctor selectByPhoneAndPassword(Doctor doctor) {
        DoctorExample doctorExample = new DoctorExample();
        doctorExample.createCriteria().andPhoneEqualTo(doctor.getPhone()).andPasswordEqualTo(doctor.getPassword());
        List<Doctor> list = doctorMapper.selectByExample(doctorExample);
        if (list.isEmpty()) {
            return null;
        }else
        {
            return list.get(0);
        }
    }
}