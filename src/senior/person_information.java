package senior;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/79:42
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class person_information implements  Cloneable {
    private String name;
    private String sex;
    private String age;
    private String company;
    private String work_time;

    public person_information(String name) {
        this.name = name;
    }

    public void setSex_age(String sex, String age){
        this.sex=sex;
        this.age=age;
    }

    public void setCompany_work_time(String company ,String work_time){
        this.company= company;
        this.work_time = work_time;
    }

    public  void  show(){
        System.out.println("以下是我的简历");
        System.out.println(name+"\t"+sex+"\t"+age+"\t"+company+"\t"+work_time);
    }
    @Override
    public  person_information clone(){
        try {
            return (person_information)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
