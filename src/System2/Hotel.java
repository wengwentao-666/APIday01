package System2;

public class Hotel {

    Room[][] Room1 = new Room[5][8];
    public Hotel(){
        for(int i = 0; i < Room1.length; i++){
             for(int j = 0; j < Room1[i].length; j++){
                 int number = (i + 1) * 1000 + j + 1;
                 Room1[i][j] = new Room(number,null);
             }
        }
    }

    public void Show(){                             // 展示房间每个房间的情况
      for(int i = 0; i < Room1.length; i++){
          System.out.println();
          for(int j = 0; j < Room1[i].length; j++){
              System.out.print(Room1[i][j].number + " " + Room1[i][j].persons.name + "   ");
          }
      }
    }

    public void In(int number,String name){      // 输入房间号和入住人的信息
        int a = number / 1000 - 1;
        int b = number % 1000 - 1;
        Room1[a][b].number = number;
        Room1[a][b].persons.name = name;
    }

    public void Out(int number){                 // 删除退房人的名字并欢迎下次再来
        int a = number / 1000 - 1;
        int b = number % 1000 - 1;
        System.out.println("退房成功，欢迎" + Room1[a][b].persons.name + " 再来！" );
        Room1[a][b].persons.name = null;
    }

}
