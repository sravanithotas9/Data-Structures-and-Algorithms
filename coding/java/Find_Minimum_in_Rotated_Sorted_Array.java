package coding.java;
/*
	Find Minimum in Rotated Sorted Array II

	Follow up for "Find Minimum in Rotated Sorted Array":
	What if duplicates are allowed?

	Would this affect the run-time complexity? How and why?
	Suppose a sorted array is rotated at some pivot unknown to you beforehand.

	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

	Find the minimum element.

	Logic:
		1. use binary search to find minimum element
		2. if only one element in an array return that element
		3. if two elements then return the minimum
		4. compare start element and mid element,
			4.1. if start is less than mid and also end that means start is smallest
			4.2. if start is is greater than mid
*/
/*
public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int
    }
}*/
