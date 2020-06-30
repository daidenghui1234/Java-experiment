package 一;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Created : 代登辉
 * @Date : 2020/6/28 16:57
 * @Description : 身份证信息提取
 * 题目要求：
 *      设计一个java 应用程序，其功能为：输入两个身份证字符串，判断两个身份证是否相同，确定身份证所属省份和性别；提取身份证出生日期，输出两个身份证相关信息。
 */
public class IdCard {
    private String ID_Card;
    /** 省、直辖市代码表 */
    public String cityCode[][] = {{"广东","44"}, {"山东","37"}, {"江苏","32"}, {"河南","41"}, {"河北","13"},
            {"浙江","33"}, {"陕西","61"}, {"湖南","43"}, {"福建","35"}, {"云南","53"},
            {"四川","51"}, {"广西","45"}, {"安徽","34"}, {"海南","46"}, {"江西","36"},
            {"湖北","42"}, {"山西","14"}, {"辽宁","21"}, {"黑龙江","23"}, {"内蒙古","15"},
            {"贵州","52"}, {"甘肃","62"}, {"青海","63"}, {"新疆","65"}, {"西藏","54"},
            {"吉林","22"}, {"宁夏","64"}, {"北京","11"}, {"天津","12"}, {"重庆","50"}, {"上海","31"}
    };

    /**
     *  返回生日
     * @return
     */
    public String getBirthday(){
        String birthday=null;
        if(ID_Card == null) {
            return null;
        }
        birthday = ID_Card.substring(6,10)+"年" +ID_Card.substring(10,12)+"月"
                + ID_Card.substring(12,14) + "日";
        //System.out.println(birthday);
        return birthday;
    }

    /**
     *  返回所在城市
     * @return
     */
    public String getCity(){
        if(ID_Card == null) {
            return null;
        }
        String city = null;
        for (int i = 0; i < cityCode.length-1; i++) {
            if(ID_Card.startsWith(cityCode[i][1])){
                city = cityCode[i][0];
            }
        }

        return city;
    }

    /**
     * 返回性别
     * @return
     */
    public String getGender() {
        if(ID_Card == null) {
            return null;
        }
        String gender = "男";
        int g = Integer.parseInt(ID_Card.substring(16,17));
        if(g%2 == 0) gender = "女";
        return gender;
    }

    public IdCard(String ID_Card) {
        if(ID_Card.length()==18){
            this.ID_Card = ID_Card;
        }
    }

    public IdCard() {
    }

    public String getID_Card() {
        return ID_Card;
    }

    public void setID_Card(String ID_Card) {
        if(ID_Card.length()==18){
            this.ID_Card = ID_Card;
        }
    }

    @Override
    public String toString() {
        return "IdCard{" +
                 ID_Card +
                '}';
    }

    @Override  // 重写equals方法，比较两个Id是否相等
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCard that = (IdCard) o;
        return Objects.equals(ID_Card, that.ID_Card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_Card);
    }

//    public static void main(String[] args) {
//        IdCard id1 = new IdCard("610122199906013712");
//        String a = id1.getCity();
//        String gender= id1.getGender();
//        id1.getBirthday();
//        System.out.println(gender);
//    }

}
