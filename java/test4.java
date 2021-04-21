public class test4{
  public static void main(String[] args) {



    int s = 0;
    for(int i=1; i<20000; i++){
    if(i%3 == 0 || String.valueOf(i).indexOf("3") != -1 ){
    System.out.println(i);
    s = s+i;
    System.out.println(s);
    }
    }

  }
}
