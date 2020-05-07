package senior;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/710:33
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 * 深度复制
 **/
public class middle_test {
    public static void main(String[] args) {
        person_information a = new person_information("小陈");

        a.setSex_age("男","18" );
        a.setCompany_work_time("腾讯", "18年");

        person_information b =a.clone();
        b.setSex_age("女", "10");

        person_information c=b.clone();
        c.setSex_age("man", "25");

         a.show();
         b.show();
         c.show();
    }
}
