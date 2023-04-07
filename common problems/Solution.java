package sample;

import java.util.Arrays;

public class Solution {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int total, int[] menu) {
        int[] sortedMenu = menu.clone();
        Arrays.sort(sortedMenu);

        // menu  - 1 4 5 3 2
        // total - 4
        for(int i = 0; i < menu.length; i++){
            int complement = total - sortedMenu[i];

            //returns the index of the searched element.
            int position = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);
            if(position >= 0 && position < sortedMenu.length && sortedMenu[position] == complement){
                int[] indices = getIndices(menu, sortedMenu[i], complement);
                return indices;
            }
        }
        return null;
    }

    static int[] getIndices(int[] menu, int value1, int value2){
        int index1 = indexOf(menu, value1, -1);
        int index2 = indexOf(menu, value2, index1);
        int[] indices = {Math.min(index1, index2), Math.max(index1, index2)};
        return indices;
    }

    static int indexOf(int[] menu, int value1, int value2){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == value1 && i != value2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    	int[] menu = {1, 4, 5, 3, 2};
    	int[] result = icecreamParlor(4, menu);
    	for(int i : result) {
    		System.out.println(i);
    	}
    	
    }
}

