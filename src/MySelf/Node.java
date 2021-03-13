package MySelf;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void add(Object v){

        if(null == value){
            value = v;
        }else {

            if((int)v - ((int)value) <= 0){
                if(null == leftNode){
                    leftNode = new Node();
                    leftNode.add(v);
                }
            }else {
                if(null == rightNode){
                    rightNode = new Node();
                    rightNode.add(v);
                }
            }
        }

    }
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }
    public static void main(String[] args) {
        int[] random = {1,9,25,36,54,63};
        Node roots = new Node();
        for(int number : random){
            roots.add(number);
        }
        System.out.println(roots.value);
    }

}
