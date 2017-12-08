package org.slry.webservice;

/**
 * @Author ouyqy
 * 2017/12/8 16:46
 */
public class Main {
    public static void main(String[] args){
        ChooseSLRYService service = new ChooseSLRYService();
        ChooseSLRYDelegate delegate =
                service.getChooseSLRYPort();

        String[] params = new String[]{"浙交安A(17)G00223","浙交安A(17)G00225","浙交安A(17)G00226"
                ,"浙交安A(17)G00227","浙交安A(17)G00228"
                ,"浙交安A(17)G00229","浙交安B(17)G01125","浙交安B(17)G01126","浙交安B(17)G01127",
                "浙交安B(17)G01128","浙交安B(17)G01130","浙交安B(17)G01133","浙交安B(17)G01134",
                "浙交安B(17)G01135","浙交安B(17)G01136","浙交安B(17)G01138","浙交安B(17)G01139"
                ,"浙交安B(17)G01140","浙交安C(17)G01886","浙交安C(17)G01887"
                ,"浙交安C(17)G01889","浙交安C(17)G01892","浙交安C(17)G01893"};

        for(String str : params){
            String str1 = delegate.getSlryXX(str,"slry_qycx");
            System.out.println(str1);
        }
    }
}
