package primary;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/79:46
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class primary_test {
    public static void main(String[] args) {
        person_information p = new person_information();
        p.setName("小陈");
        p.setSex_age("男","18" );
        p.setCompany_work_time("腾讯", "18年");
        p.show();

        person_information p1 = new person_information();
        p1.setName("陈");
        p1.setSex_age("男1","16" );
        p1.setCompany_work_time("腾讯1", "17年");
        p1.show();

    }
}
