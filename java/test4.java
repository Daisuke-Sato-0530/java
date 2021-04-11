public class test4{
  public static void main(String[] args) {

    int a = 3;
    System.out.println("a="+a);
    if (a<3){
      System.out.println("aは3より小さいです");
    }else if(a>3){
      System.out.println("aは3より小さいです");
    }else{
      System.out.println("aは3です");
    }

    int b = 2;
    if (b == 1){
      System.out.println("bは1です");
    }else{
      System.out.println("bは1ではありません");
    }

    int c = (int)(Math.random()*6)+1;
      System.out.println("サイコロの目："+c);
      if(c == 2 || c == 4 || c == 6 ){
        System.out.println("偶数");
      }else{
        System.out.println("奇数");
      }
  }
}