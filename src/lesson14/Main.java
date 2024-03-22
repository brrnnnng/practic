package lesson14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);

        ArrayList<Integer> nums = new ArrayList<>(nums1);
        nums.addAll(nums2);

        System.out.println("Объединение двух коллекций с дубликатами: " + nums);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        ArrayList<Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);

        System.out.println("Пересечение двух коллекций с дубликатами: " + list);


        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);

        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.add(2);
        nums4.add(3);
        nums4.add(4);

        Set<Integer> combinedSet = new HashSet<>();
        combinedSet.addAll(nums3);
        combinedSet.addAll(nums4);

        ArrayList<Integer> nums5 = new ArrayList<>(combinedSet);

        System.out.println("Объединение двух коллекций без дубликатов: " + nums5);


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(2);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(2);
        list4.add(1);

        ArrayList<Integer> list5 = new ArrayList<>(list3);
        list5.retainAll(list4);

        System.out.println("Пересечение двух коллекций без дубликатов: " + list5);


        ArrayList<Integer> nums6 = new ArrayList<>();
        nums6.add(1);
        nums6.add(2);
        nums6.add(3);

        ArrayList<Integer> nums7 = new ArrayList<>();
        nums7.add(2);
        nums7.add(3);
        nums7.add(4);

        ArrayList<Integer> nums8 = new ArrayList<>(nums6);
        nums8.removeAll(nums7);

        System.out.println("Разность двух коллекций: " + nums8);
    }

}
