package in.ineuron.pptAssignment04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisjointArrays {
	public static int[][] findDisjointArrays(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int num : nums1) {
			if (!set2.contains(num)) {
				list1.add(num);
			}
		}

		for (int num : nums2) {
			if (!set1.contains(num)) {
				list2.add(num);
			}
		}

		int[][] answer = new int[2][];
		answer[0] = new int[list1.size()];
		answer[1] = new int[list2.size()];

		for (int i = 0; i < list1.size(); i++) {
			answer[0][i] = list1.get(i);
		}

		for (int i = 0; i < list2.size(); i++) {
			answer[1][i] = list2.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		int[][] answer = findDisjointArrays(nums1, nums2);

		System.out.println("Distinct integers in nums1 not present in nums2: ");
		for (int num : answer[0]) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("Distinct integers in nums2 not present in nums1: ");
		for (int num : answer[1]) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
