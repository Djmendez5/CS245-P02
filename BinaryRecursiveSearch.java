package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Recursive";
	}

	public int searchint( int[] arr, int target, int min, int max) {
		// min=0;
		// max = arr.length-1;
		int mid = (max+min)/2;
		if(mid>=max) {
			return -1;
		}
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[mid]>target) {
			return searchint(arr, target, min, mid-1);
		}
		else {
			return searchint(arr,target,mid+1, max);
		}
	}
	public int search(int[] arr, int target) {
		return searchint(arr, target, 0, arr.length-1);
	}

}
