package MySelf;   /*
                  contains， 用于判断对象
                  ArrayList 中 remove(可以为元素数组中的数字位置例如0,1,2,3   也可以直接是数组英雄元素)
                  set（位置信息，对象）用于替换位置信息上面的对象
                  数组对象.size() 用于获取ArrayList的大小
                  addAll 将一个ArrayList 数组加到另一个  ArrayList中
                  */
import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //有限制长度的英雄对象
       Hero heros[] = new Hero[10];
       heros[1] = new Hero("吕布");
       heros[2] = new Hero(7);
        System.out.println(Arrays.toString(heros));

        //使用ArrayList()方法可以无限增加数组长度
        ArrayList hero1 = new ArrayList();
        hero1.add(new Hero("张飞"));
        hero1.add(new Hero(3));
        System.out.println(hero1.size());
    }
}
