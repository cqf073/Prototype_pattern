package primary;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/79:42
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class person_information  {
    private String name;
    private String sex;
    private String age;
    private String company;
    private String work_time;
    public  void  setName(String name){
        this.name=name;
    }

    public void setSex_age(String sex,String age){
        this.sex=sex;
        this.age=age;
    }

    public void setCompany_work_time(String company ,String work_time){
        this.company= company;
        this.work_time = work_time;
    }

    public  void  show(){
        System.out.println("以下是我的简历");
        System.out.println(name+sex+age+company+work_time);
    }
}
