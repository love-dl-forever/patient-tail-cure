package com.zwd.app.service;

import com.zwd.app.domain.Doctor; /**
 * @author zwd
 * @date 2018/3/22 17:03
 * @Email lovejavazwd@gmail.com
 */
public interface DoctorService {
    void insertSeletive(Doctor doctor);

    Doctor selectByPhoneAndPassword(Doctor doctor);
}