/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
 package 課題;

public class Main{
    public static void main(String[] args){
         /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int date[] = {3, 1, 2, 7, 5};
    
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
      
        for(int i = 0; i < date.length; i++){
            System.out.print(date[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < date.length; i++) {
            for (int j = date.length-1; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(date[i] > date[j]){
                  int box = date[j];
                  date[j] = date[i];
                  date[i] = box;
                }
            }
        } 

        for(int i = 0; i < date.length; i++){
            System.out.print(date[i] + " ");
        }
    }
}


