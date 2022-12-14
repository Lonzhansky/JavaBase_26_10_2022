package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
////        0001 = 1 - byte &
////        0111 - 7
////        1001 - 9
//
//        int a = 7;
//        int b = 9;
//
//        System.out.println(a & b);
//
//
////        1111 = 15 - byte |
////        0111 - 7
////        1001 - 9
//        System.out.println(a | b);
//
//
////        1110 = 14 - byte ^
////        0111 - 7
////        1001 - 9
//        System.out.println(a ^ b);
//
//
//        // 1001
//        System.out.println(18 << 4);
//


        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }



        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("AFTER");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }



        int[][] array1 = new int[4][3];
        int[][] array2 = new int[3][4];





    }

    static void task2() {

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W    // 00, 02, 04, 06 - 2 4 6 8
//      W B W B W B W B    // 11, 13, 15, 17 - 2 4 5 8
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B


        String[][] chessBoard = new String[8][8];
        int i, j;
        for (i = 0; i < chessBoard.length; i += 1) {
            for (j = 0; j < chessBoard[i].length; j += 1) {
//                if ((i + j) % 2 != 0) {
//                    chessBoard[i][j] = "W";
//                } else {
//                    chessBoard[i][j] = "B";
//                }

                chessBoard[i][j] = (i + j) % 2 != 0 ? "W" : "B";
            }
        }

        for (int k = 0; k < chessBoard.length; k++) {
            for (int l = 0; l < chessBoard[k].length; l++) {
                System.out.print(chessBoard[k][ l] + "\t");
            }
            System.out.println();
        }


    }

    static void task1() {
        // Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//      1 0 0 0 0     0 0
//      0 1 0 0 0     1 1
//      0 0 1 0 0     2 2
//      0 0 0 1 0     3 3
//      0 0 0 0 1     4 4

//      0 0 0 0 1     0 4 = 4
//      0 0 0 1 0     1 3 = 4
//      0 0 1 0 0     2 2 = 4
//      0 1 0 0 0     3 1 = 4
//      1 0 0 0 0     4 0 = 4

        int[][] array = new int[5][5];

        // Перша дiагональ

        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        //version 2
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }


        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // version 2
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
////            if (i + j == array.length - 1) {
////                array[i][j] = 1;
////            }
//
//            array[i][j] = 1;
//        }

        // best version
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void demo1() {

//        int[][] array = new int[5][4];
//
//        System.out.println(array.length);
//
//        int value = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = value++;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(array));
//        System.out.println();
//        System.out.println();
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i][2]);
//        }

//
//
//        System.out.println(Arrays.toString(array[0]));


//        int[][] array2 = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        System.out.println(array2.length);
//        System.out.println(array2[0].length);
//        System.out.println(array2[1].length);
//        System.out.println(array2[2].length);


//        System.out.println(array2[1][2]);


        int[][] array3 = {
                {1},
                {5, 6},
                {5, 6, 78, 234},
                {},
                {5, 6, 3},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println(array3.length);
        System.out.println(array3[0].length);
        System.out.println(array3[1].length);
        System.out.println(array3[2].length);
        System.out.println(array3[3].length);
        System.out.println(array3[4].length);
        System.out.println(array3[5].length);

    }


    static void demo2() {
        //        int[][][] array = new int[3][2][4];
//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };
//
//        System.out.println(array.length); // 3
//        System.out.println(array[0].length); // 2
//        System.out.println(array[1].length); // 2
//        System.out.println(array[2].length); // 2
//        System.out.println(array[0][0].length); //4
//
//
//
//
//        System.out.println(Arrays.deepToString(array));
//
//        System.out.println(array.length);
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//
//        int[][] array2 = array[0];
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//        int[] array3 = array[0][1];
//
//        for (int i = 0; i < array3.length; i++) {
//                System.out.print(array3[i] + "\t");
//        }



//        int[][][][] array = new [1][2][3][4];
        int[][][][] array =
                {
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        },
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        }
                };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println(array[0][0][0][3]);
    }
}
