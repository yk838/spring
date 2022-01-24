
import java.util.ArrayList;
import java.util.List;
public class Test  {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        List<String> strList2 = new ArrayList<String>();
        for(int i = 0; i < 10; i ++) {
            strList.add("aaa>>" + i);
            strList2.add("aaa>>" + (10 - i));
        }

        //求出交集
        strList2.retainAll(strList);
        System.out.println("交集大小：" + strList2.size());

        for(int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i));
        }
    }
}