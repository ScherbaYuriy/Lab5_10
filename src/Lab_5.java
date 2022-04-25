
    public class Lab_5 {

        public static void main(String[] args) {
            int same = 0;
            for (int firstn = 0; firstn <= 2; firstn++) {
                for (int secondn = 0; secondn <= 9; secondn++) {
                    for(int thirdn = 0; thirdn < 6; thirdn++ ){
                        for(int fourthn = 0; fourthn <=9; fourthn++){
                            if(firstn == 2 && secondn <= 3) {
                                continue;
                            }
                            if((firstn == thirdn && secondn == fourthn)||(firstn == fourthn && secondn == thirdn)){
                                same++;
                            }
                        }
                    }
                }
            }System.out.println("Одинакові " +  same);
        }
    }

