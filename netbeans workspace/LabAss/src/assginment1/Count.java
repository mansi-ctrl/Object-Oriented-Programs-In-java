
/*
Mansi Dobariya
AU1841131
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mansi
 */
public class Count {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                for (int k = 1; k <=4; k++) {
                    if ( k!=j && k!=i && i!=j ) {
                        count++;
                    
                    System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Three-digits numbers are "+count);
    }
}

/*
123
124
132
134
142
143
213
214
231
234
241
243
312
314
321
324
341
342
412
413
421
423
431
432
Three-digits numbers are 24
*/