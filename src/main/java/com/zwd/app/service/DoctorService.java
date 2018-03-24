package com.zwd.app.service;

import com.zwd.app.domain.Doctor;

import com.zwd.app.entity.DoctorInfo;


import java.util.List;

/**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
public interface DoctorService {
    Doctor insertSeletive(Doctor doctor);

    Doctor selectByPhoneAndPassword(Doctor doctor);


    List<Doctor> queryAllBoneNomalDoctor(Doctor doctor);

    List<DoctorInfo> selectResult();

}
