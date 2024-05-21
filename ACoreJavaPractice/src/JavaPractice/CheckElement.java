package JavaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] al = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};
        Integer[] a4 = {1, 2, 3};
        Integer[] a5 = {1, 3, 2};

        System.out.println("Arrays having same elements at each position: " + findArraysHavingSameElementsAtEachPosition(al, a2, a3, a4, a5));
        System.out.println("Arrays have the same elements but position of elements are different: " + findArraysHavingSameElementsDifferentPosition(al, a2, a3, a4, a5));
        System.out.println("Arrays have the same unique elements: " + findArraysHavingSameUniqueElements(al, a2, a3, a4, a5));
    }

    public static String findArraysHavingSameElementsAtEachPosition(Integer[]... arrays) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (Arrays.equals(arrays[i], arrays[j])) {
                    if (result.length() > 0) result.append(", ");
                    result.append("a").append(i + 1);
                }
            }
        }
        return result.toString();
    }

    public static String findArraysHavingSameElementsDifferentPosition(Integer[]... arrays) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (hasSameElementsDifferentPosition(arrays[i], arrays[j])) {
                    if (result.length() > 0) result.append(", ");
                    result.append("a").append(i + 1);
                }
            }
        }
        return result.toString();
    }

    public static String findArraysHavingSameUniqueElements(Integer[]... arrays) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (hasSameUniqueElements(arrays[i], arrays[j])) {
                    if (result.length() > 0) result.append(", ");
                    result.append("a").append(i + 1);
                }
            }
        }
        return result.toString();
    }

    public static boolean hasSameElementsDifferentPosition(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) return false;

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        return set1.equals(set2);
    }

    public static boolean hasSameUniqueElements(Integer[] array1, Integer[] array2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        return set1.equals(set2);
    }
}