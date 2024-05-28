public class Patterns{
    public static void main(String[] args) {
        nineteenth(4);
    }

    private static void first(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();     
        }
    }

    private static void second(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();     
        }
    }

    private static void third(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();     
        }
    }

    private static void fourth(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();     
        }
    }

    private static void fifth(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
    }

    private static void sixth(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();     
        }
    }

    private static void seventh(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void eighth(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void ninth(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    private static void tenth(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println();     
        }
    }

    private static void eleventh(int n){
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                flag = true;
                for (int j = 1; j <= i; j++) {
                    if(flag){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                    flag = !flag;
                }
            }
            if(i%2!=0){
                flag = false;
                for (int j = 1; j <= i; j++) {
                    if(flag){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                    flag = !flag;
                }
            }
            System.out.println();
        }
    }


    // private static void twelth(int n){
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();     
    //     }
    //     for (int i = n; i > 0; i--) {
    //         for (int j = 1; j <= (2*i-1); j++) {
    //             System.out.print(" ");
    //         } 
    //         System.out.println();
    //     }
    // }

    private static void thirteen(int n){
        int counter =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
    }

    private static void fourteeth(int n){
        int counter = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)counter++ + " ");
            }
            counter = 65;
            System.out.println();
        }
    }

    private static void fifteenth(int n){
        int counter = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)counter + " ");
            }
            counter++;
            System.out.println();
        }
    }

    private static void sixteenth(int n){
        int counter = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print((char)counter++ + " ");
            }
            counter=65;
            System.out.println();
        }
    }

    private static void seventeenth(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            char cha = 'A';
            int breakpoint = (2*i-1)/2;
            for (int j = 1; j <= (2*i-1); j++) {
               if(j<=breakpoint){
                System.out.print(cha++);
               }else{
                System.out.print(cha--);
               }
            } 
            cha = 'A';
            System.out.println();
        }
    }

    private static void eighteenth(int n){
        int cha = 65+n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)cha--);
            }
            cha = 65+n-1;
            System.out.println();     
        }
    }

    private static void nineteenth(int n){
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n-i; j++) {
                System.out.print("*");
           }
           for (int j = 0; j < i*2; j++) {
            System.out.print(" ");
           }
           for (int j1 = 0; j1 < n-i; j1++) {
                System.out.print("*");
           } 
           System.out.println();
        }
        int ins = n+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                 System.out.print("*");
            }
            for (int j = 0; j < ins; j++) {
             System.out.print(" ");
            }
            for (int j1 = 0; j1 < i; j1++) {
                 System.out.print("*");
            }
            ins -= 2; 
            System.out.println();
         }
    }
}