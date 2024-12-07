 /*  *****
     *    
     *****
         *
     *****    */
 class patternS{
 public static void main(String args[]){  
        int h=5; 
        for(int i = 0; i < h; i++) {  
            for(int j = 0; j < h; j++) {  
                if((i == 0 || i == h / 2 || i == h - 1)) {  
                    System.out.printf("*");  
                }else if(i < h / 2 && j == 0){  
                    System.out.printf("*");  
                }else if(i > h / 2 && j == h - 1){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        }  
    } 
} 