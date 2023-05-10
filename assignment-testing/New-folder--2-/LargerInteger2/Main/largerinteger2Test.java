package Main;

import org.junit.jupiter.api.*;



class largerinteger2Test {

   int n1 = 73;
   int n2 = 34;

   @Test
    void testTwoNumberReturnN1(){

        int  value = getBiggest(n1,n2);

        Assertions.assertEquals(value,n1);

    }


    @Test
    void testTwoNumberReturnN2(){


        int  value = getBiggest(n1,n2);

        Assertions.assertEquals(value,n2);




    }
    public static int getBiggest(int n1, int n2){

        int storeValue = 0;

        if(n1 > n2){

            storeValue = n1;

        }

        else if(n1 < n2){

            storeValue = n2;
        }

        return  storeValue;
    }

}