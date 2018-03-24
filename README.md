# patient-tail-cure
基于web的病人跟踪治疗系统,用于记录病人信息




系统功能需求：
1、实现病人信息采集跟踪管理；
2、实现病人病例信息跟踪管理；
3、实现病人治疗状况跟踪管理；
4、实现病人缴费情况跟踪管理；
5、实现病人出院管理。


医生：
1、查看修改个人信息；
2、治疗费用结算统计管理；
3、跟踪病人用药信息；
4、病人电子病例追踪管理；
5、病人资料追踪管理。


病人：
1、查看治疗费用信息；
2、查看诊治方案信息；
3、查看修改用户信息；
4、查看个人电子病例信息；





//查询所有药品列表
localhost:8080/drug/selectdrug

    {
        无
    }
  
//查询病人的病因、治疗方案和主治医生    
localhost:8080/patientinfo/patientanddoctor

{
    无
}

//就诊
localhost:8080/user/addPatient
{
     "number":
    
        "patient":{
        }
    
        "doctor":{
        }
    
        "drug":{
        }
    
        "pathogeny":{
        
        }
        "result":{
        }
}

//病例
localhost:8080/patientinfo/selectallpatient

    {
    
    }
